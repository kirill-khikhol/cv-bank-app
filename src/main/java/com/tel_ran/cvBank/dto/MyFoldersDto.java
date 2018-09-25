package com.tel_ran.cvBank.dto;

import java.util.List;

public class MyFoldersDto {
	private List<FolderWrapperDto> myFolders;

	public List<FolderWrapperDto> getMyFolders() {
		return myFolders;
	}

	public MyFoldersDto() {
		super();
	}

	public MyFoldersDto(List<FolderWrapperDto> myFolders) {
		super();
		this.myFolders = myFolders;
	}
}
