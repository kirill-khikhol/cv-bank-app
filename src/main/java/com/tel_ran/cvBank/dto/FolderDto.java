package com.tel_ran.cvBank.dto;

public class FolderDto {
	private String folderName;

	public FolderDto(String folderName) {
		super();
		this.folderName = folderName;
	}

	public FolderDto() {
		super();
	}

	public String getFolderName() {
		return folderName;
	}

}
