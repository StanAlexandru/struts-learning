package com.learn.sis.action;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.learn.sis.model.FileDO;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class FilesTableAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private List<FileDO> tableFiles = new ArrayList<FileDO>();

	public List<FileDO> getTableFiles() {
		return tableFiles;
	}

	public void setTableFiles(List<FileDO> tableFiles) {
		this.tableFiles = tableFiles;
	}

	@Override
	public String execute() throws Exception {

		Path filesPath = Paths.get(
				"C:/Users/AlexandruStan/Desktop/Development/eclipse-workspace/struts-learning-workspace/SIS-Files/downloadFiles/");

		Files.list(filesPath).forEach((filePath) -> {

			FileDO fileDO = new FileDO();
			fileDO.setFileName(filePath.getFileName().toString());
			fileDO.setFilePath(filePath.toAbsolutePath().toString());
			fileDO.setFileContent(null); // TODO: set content
			tableFiles.add(fileDO);

		});

		return Action.SUCCESS;
	}

}