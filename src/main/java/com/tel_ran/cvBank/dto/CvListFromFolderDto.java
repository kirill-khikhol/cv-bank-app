package com.tel_ran.cvBank.dto;

import java.util.List;

public class CvListFromFolderDto extends CvListDto {
	private String folderName;

	public CvListFromFolderDto() {
		super();
	}

	public CvListFromFolderDto(Integer currentPage, Integer itemsOnPage, Integer itemsTotal, List<CvWrapperDto> cvList,
			String folderName) {
		super(currentPage, itemsOnPage, itemsTotal, cvList);
		this.folderName = folderName;
	}

	public String getFolderName() {
		return folderName;
	}

}
