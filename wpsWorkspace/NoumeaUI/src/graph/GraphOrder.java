package graph;

import java.util.*;

public class GraphOrder {
	
	protected Graph theGraph;
	protected GraphUtils myUtil;
	
	public GraphOrder(Graph aGraph) {
		theGraph = aGraph;
		myUtil = new GraphUtils(aGraph);
	}
	
	public boolean preOrder() {
		if (! myUtil.hasCycle()) {
						
			List<Node> nodes = new ArrayList<Node>();
			List<Boolean> passe = new ArrayList<Boolean>();
		
			for (Node node : theGraph.getNodes()) {
				nodes.add(node);
				passe.add(false);
			}
			Boolean toutEstPasse = false;
			
			List<Node> orderedNodes = new ArrayList<Node>();
						
			while (!toutEstPasse) {
				for (Node node : nodes) {
					List<Node> preNodes = myUtil.preNodes(node);
					if ((preNodes.isEmpty() || orderedNodes.containsAll(preNodes))&& ! passe.get(node.getIndex()) ) {
						orderedNodes.add(node);
						passe.set(node.getIndex(),true);
					}
				}
				toutEstPasse = true;
				for (Boolean pas : passe) {
					toutEstPasse = pas && toutEstPasse;
				}
			}
			
			theGraph.getNodes().clear();
			theGraph.getNodes().addAll(orderedNodes);
			return true;
		} 
		return false;
	}
}
