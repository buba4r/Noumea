package testWfWervices;

import graph.wfGraphAdapter;

import java.util.List;

import WfServices.WfWpsServices;
import wfwps.*;

public class testServices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WfWpsServices monAPI = new WfWpsServices();
		
		monAPI.setLibFileName("myLib.wfwps");
		monAPI.LoadLibFile();
		
		for (LocalWPS wps : monAPI.getLocalWPS()) {
			System.out.println(wps.getName());
		}
		System.out.println("----------------------");
		for (WorkFlow wf : monAPI.getWF()) {
			System.out.println(wf.getName());
			for (WPSReference wps : wf.getWps()) {
				System.out.println(wps.getInputs().get(0).getInput().getWps().getName());
			}
			wfGraphAdapter adapt = new wfGraphAdapter(wf);	
			boolean result = adapt.preOrder();
			if (result) {
				for (WPSReference wps : wf.getWps()) {
					System.out.println(wps.getInputs().get(0).getInput().getWps().getName());
				}
			} else {
				System.out.println("pb");
			}
			System.out.println("----------------------");
		}		
	}
}
