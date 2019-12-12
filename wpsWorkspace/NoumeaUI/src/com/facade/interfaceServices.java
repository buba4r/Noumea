package com.facade;

import java.io.File;
import java.util.List;

import org.eclipse.jdt.core.IMethod;
import org.geotools.data.wps.WebProcessingService;

import net.opengis.wps10.ProcessBriefType;

public interface interfaceServices {
	
	
	public String getFileName();
	
	public List<String> getLocalWpsList();
	
	public List<String> getRemoteWpsList();
	
	public List<String> getWorkFlowList();
	
	public String generateJava(List<Integer> idWps,List<Integer> idWf,String folderName);
	
	public void setFile(File file);

	public boolean AddModel(String string, String text, String text2, IMethod theMethod, String string2);

	public boolean AddRemoteModel(String url, WebProcessingService aWps, String process);
	
}
