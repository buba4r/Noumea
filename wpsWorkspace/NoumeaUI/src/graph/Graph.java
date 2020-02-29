package graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {

	protected List<Node> nodes;
	protected List<Edge> edges;

	public Graph() {
		nodes = new ArrayList<Node>();
		edges = new ArrayList<Edge>();
	}

	public List<Node> getNodes() {
		return nodes;
	}

	public List<Edge> getEdges() {
		return edges;
	}
} 
