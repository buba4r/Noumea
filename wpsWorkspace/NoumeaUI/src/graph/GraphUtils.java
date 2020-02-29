package graph;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class GraphUtils {
	
	protected Graph theGraph;

	public GraphUtils(Graph aGraph) {
		theGraph = aGraph;
		int i = 0;
		for (Node aNode : theGraph.getNodes()) {
			aNode.setIndex(i);
			i++;
		}
	}
	
	public String toString(Graph aGraph){
		String graphText = "";
		for (Node aNode : aGraph.getNodes()) {
			graphText+=("Node"+(aNode.getIndex()+1)+" to: ");
			for (Edge edge : aNode.getOutEdges()) {
				graphText+=((edge.getTo().getIndex()+1)+" ");
			} ; graphText+=("\n");
		}
		return graphText;
	}
	
	public Graph cloneGraph(Graph aGraph){
		Graph resultGraph = new Graph();
		
		HashMap<Node,Node> copies = new HashMap<Node,Node>();
		
		for (Node node : aGraph.getNodes()) {
			Node cloneNode = new Node();
			cloneNode.setIndex(node.getIndex());
			copies.put(node,cloneNode);
			resultGraph.getNodes().add(cloneNode);
		}
		
		for (Edge edge : aGraph.getEdges()) {
			Edge cloneEdge = new Edge();
			resultGraph.getEdges().add(cloneEdge);
			cloneEdge.setFrom(copies.get(edge.getFrom()));cloneEdge.setTo(copies.get(edge.getTo()));
		}
		
		return resultGraph;
	}
	
	public List<Node> isolatedNodes() {
		List<Node> alones = new ArrayList<Node>();
		
		for (Node aNode : theGraph.getNodes()) {
			List<Node> postNodes = this.postNodes(aNode);
			List<Node> preNodes = this.preNodes(aNode);
			if (postNodes.isEmpty() && preNodes.isEmpty()) {
				alones.add(aNode);
			}
		}
		return alones;
	}
	
	public boolean hasCycle() {
		boolean result = false;
		for (Node aNode : theGraph.getNodes()) {
			List<Node> postNodes = this.postNodes(aNode);
			if (postNodes.contains(aNode)) {
				result=true;
			}
		}
		return result;
	}
	
	public List<Node> preNodes(Node aNode){
		List<Node> pre = new ArrayList<Node>();
		List<Node> prev = new  CopyOnWriteArrayList<Node>();
		List<Boolean> passe = new ArrayList<Boolean>();
		
		for (Node node : theGraph.getNodes()) {
			passe.add(false);
		}
		
		for (Edge edge : aNode.getInEdges()) {
			prev.add(edge.getFrom());
			pre.add(edge.getFrom());
			passe.set(edge.getFrom().getIndex(),true);
		}
		
		while (!prev.isEmpty()){
			for (Node node : prev) {			
				for (Edge edge : node.getInEdges()) {
					if ( ! passe.get(edge.getFrom().getIndex())) {
						prev.add(edge.getFrom());
						passe.set(edge.getFrom().getIndex(),true);
						pre.add(edge.getFrom());				
					}			
				}
				prev.remove(node);
			}
		}				
		return pre;
	}
	
	public List<Node> postNodes(Node aNode){
		List<Node> post = new ArrayList<Node>();
		List<Node> next = new  CopyOnWriteArrayList<Node>();
		List<Boolean> passe = new ArrayList<Boolean>();
		
		for (Node node : theGraph.getNodes()) {
			passe.add(false);
		}
		
		for (Edge edge : aNode.getOutEdges()) {
			next.add(edge.getTo());
			post.add(edge.getTo());
			passe.set(edge.getTo().getIndex(),true);
		}
		
		while (!next.isEmpty()){
			for (Node node : next) {			
				for (Edge edge : node.getOutEdges()) {
					if (! passe.get(edge.getTo().getIndex())) {
						next.add(edge.getTo());
						passe.set(edge.getTo().getIndex(),true);
						post.add(edge.getTo());				
					}			
				}
				next.remove(node);
			}
		}		
		return post;
	}
}
