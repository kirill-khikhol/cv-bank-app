package com.tel_ran.cvBank.dto;

public class FolderWrapperDto {
	private FolderDto folder;

	public FolderDto getFolder() {
		return folder;
	}

	public FolderWrapperDto() {
		super();
	}

	public FolderWrapperDto(FolderDto folder) {
		super();
		this.folder = folder;
	}
}
