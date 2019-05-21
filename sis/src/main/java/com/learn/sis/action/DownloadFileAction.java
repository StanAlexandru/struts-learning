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
	private String filePath;
	private String fileName;

	public InputStream getFileInputStream() {
		return fileInputStream;
	}

	public void setFileInputStream(FileInputStream fileInputStream) {
		this.fileInputStream = fileInputStream;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String execute() throws Exception {
		
		fileName = Paths.get(filePath).getFileName().toString();
		fileInputStream = Files.newInputStream(Paths.get(filePath));
		
		return Action.SUCCESS;
		
	}

}
