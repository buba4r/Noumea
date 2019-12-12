package graph;

import java.util.ArrayList;
import java.util.List;

public class Node {

	protected List<Edge> inEdges;
	protected List<Edge> outEdges;

	protected int index = 0;

	public Node() {
		inEdges = new ArrayList<Edge>();
		outEdges = new ArrayList<Edge>();
	}

	public List<Edge> getInEdges() {
		return inEdges;
	}

	public List<Edge> getOutEdges() {
		return outEdges;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int newIndex) {
		index = newIndex;
	}
}
