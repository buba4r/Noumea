package graph;

public class Edge {

	protected Node from;
	protected Node to;

	public Edge() {
	}

	public Node getFrom() {
		return from;
	}

	public void setFrom(Node newFrom) {
		from = newFrom;
		from.getOutEdges().add(this);
	}

	public Node getTo() {
		to.getInEdges().add(this);
		return to;
	}

	public void setTo(Node newTo) {
		to = newTo;
	}
} 
