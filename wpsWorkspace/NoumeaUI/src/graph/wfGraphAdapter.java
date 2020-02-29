package graph;

import java.util.*;
import java.util.Map.Entry;

import wfwps.*;

public class wfGraphAdapter {
	
	private WorkFlow theWF;
	private Graph theGraph;
	private HashMap<WPSReference, Node> wpsNodes;
	private List<WorkFlow> allWorflows;
	
	public Graph getTheGraph() {
		return theGraph;
	}
	
	public wfGraphAdapter(WorkFlow aWF) {
		
		theWF = aWF;
		theGraph = new Graph();
		wpsNodes = new HashMap<WPSReference, Node>();
		List<WorkFlow> listWf = new ArrayList<WorkFlow>();
		allWorflows = getAllWorkflows(aWF,listWf);
		
		for (WPSReference wps : aWF.getWps()) {
			Node node = new Node();
			theGraph.getNodes().add(node);
			wpsNodes.put(wps, node);
		}
		
		for (Link link : aWF.getLinks()) {
			Edge edge = new Edge();
			theGraph.getEdges().add(edge);
			if ((link.getInput() instanceof OutputReference) && (link.getOutput() instanceof InputReference)) {
				edge.setFrom(wpsNodes.get(link.getInput().eContainer()));
				edge.setTo(wpsNodes.get(link.getOutput().eContainer()));
			}
		}
	}
	
	public boolean preOrder() {
		GraphOrder aGraphOrder = new GraphOrder(theGraph);
		boolean result = aGraphOrder.preOrder();	
		theWF.getWps().clear();
		for (Node node : theGraph.getNodes()) {
		    for (Entry<WPSReference,Node> entry : wpsNodes.entrySet()) {
		        if (Objects.equals(node, entry.getValue())) {
					theWF.getWps().add(entry.getKey());
		        }
		    }
		}
		return result;
	}
	
	public boolean noRecursion() {
		boolean result = true;
		for (WorkFlow wf : allWorflows) {
			if (wf == theWF ) {
				result = false;
			}
		}
		return result;
	}
	
	protected List<WorkFlow> getAllWorkflows(WorkFlow aWf,List<WorkFlow> listWf) {
		for (WPSReference refWps : aWf.getWps()) {
			if (refWps instanceof WorkflowReference) {
				WorkFlow wf = ((WorkflowReference) refWps).getWps();
				if (! listWf.contains(wf)) {
					listWf.add(wf);
					this.getAllWorkflows(wf,listWf);
				}
			}
		}
		return listWf;
	}
}
