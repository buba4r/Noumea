package graph;

import java.util.List;

public class testCycle {

	public static void main(String[] args) {
		
		Graph aGraph = new Graph();
		
		Node node1 = new Node();
		Node node2 = new Node();
		Node node3 = new Node();
		Node node4 = new Node();
		Node node5 = new Node();
		Node node6 = new Node();
		Node node7 = new Node();
		Node node8 = new Node();
		
		Edge edge1 = new Edge();
		Edge edge2 = new Edge();
		Edge edge3 = new Edge();
		Edge edge4 = new Edge();
		Edge edge5 = new Edge();
		Edge edge6 = new Edge();
		Edge edge7 = new Edge();
		Edge edge8 = new Edge();
		Edge edge9 = new Edge();
		
		aGraph.getNodes().add(node1);
		aGraph.getNodes().add(node2);
		aGraph.getNodes().add(node3);
		aGraph.getNodes().add(node4);
		aGraph.getNodes().add(node5);
		aGraph.getNodes().add(node6);
		aGraph.getNodes().add(node7);
//		aGraph.getNodes().add(node8);
		
		aGraph.getEdges().add(edge1);
		aGraph.getEdges().add(edge2);
		aGraph.getEdges().add(edge3);
		aGraph.getEdges().add(edge4);
		aGraph.getEdges().add(edge5);
		aGraph.getEdges().add(edge6);
		aGraph.getEdges().add(edge7);	
//		aGraph.getEdges().add(edge8);
		aGraph.getEdges().add(edge9);
		
		edge1.setFrom(node7);edge1.setTo(node3);
		edge2.setFrom(node2);edge2.setTo(node4);
		edge3.setFrom(node3);edge3.setTo(node4);
		edge4.setFrom(node3);edge4.setTo(node5);
		edge5.setFrom(node4);edge5.setTo(node6);
		edge6.setFrom(node5);edge6.setTo(node6);
		edge7.setFrom(node5);edge7.setTo(node1);
//		edge8.setFrom(node4);edge8.setTo(node7);
		edge9.setFrom(node1);edge9.setTo(node6);
		
		GraphUtils myUtil = new GraphUtils(aGraph);

		System.out.println("graph");
		System.out.println(myUtil.toString(aGraph));
		System.out.println("---------------------");
		
		System.out.println("Post nodes");		
		for (Node aNode : aGraph.getNodes()) {
			List<Node> postNodes = myUtil.postNodes(aNode);
			System.out.print("Node"+(aNode.getIndex()+1)+": ");
			for (Node node : postNodes) {
				System.out.print((node.getIndex()+1)+" ");
			} ; System.out.println("");
		}
		System.out.println("---------------------");		
		System.out.println("Pre nodes");		
		for (Node aNode : aGraph.getNodes()) {
			List<Node> postNodes = myUtil.preNodes(aNode);
			System.out.print("Node"+(aNode.getIndex()+1)+": ");
			for (Node node : postNodes) {
				System.out.print((node.getIndex()+1)+" ");
			} ; System.out.println("");
		}
		System.out.println("---------------------");		
		System.out.println("cycle: "+myUtil.hasCycle());
		System.out.println("---------------------");		
		System.out.println("no isolated: "+myUtil.isolatedNodes().isEmpty());
		for (Node aNode : myUtil.isolatedNodes()) {
			System.out.print("Node"+(aNode.getIndex()+1)+" ");
		}
		System.out.println("");
		System.out.println("---------------------");
		
		System.out.println("copy");
		Graph copyGraph = myUtil.cloneGraph(aGraph);
		System.out.println(myUtil.toString(copyGraph));
		System.out.println("---------------------");
		
		System.out.print("pre order: ");		
		GraphOrder aGraphOrder = new GraphOrder(aGraph);
		if(aGraphOrder.preOrder()) {System.out.println(" ok ");} else {System.out.println(" nok because cycles ");}
		System.out.print("preOrder: ");
		for (Node aNode : aGraph.getNodes()) {
			System.out.print("Node"+(aNode.getIndex()+1)+" ");
		}
		System.out.println("");
		System.out.println("---------------------");
		System.out.println("ordered graph");	
		System.out.println(myUtil.toString(aGraph));
	}
}
