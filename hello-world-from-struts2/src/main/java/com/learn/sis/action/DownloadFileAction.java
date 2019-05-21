package com.learn.sis.action;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class DownloadFileAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	private InputStream fileInputStream;

	public InputStream getFileInputStream() {
		return fileInputStream;
	}

	public void setFileInputStream(FileInputStream fileInputStream) {
		this.fileInputStream = fileInputStream;
	}

	@Override
	public String execute() throws Exception {
		//fileInputStream = new FileInputStream(new File("C:\\downloadfile.txt"));
		fileInputStream = Files.newInputStream(Paths.get("C:/Users/AlexandruStan/Desktop/Development/eclipse-workspace/struts-learning-workspace/SIS-Files/downloadFiles/DownloadFile1.txt"));
		return Action.SUCCESS;
	}
	
	
}
