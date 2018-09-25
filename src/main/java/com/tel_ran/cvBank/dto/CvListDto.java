package com.tel_ran.cvBank.dto;

import java.util.List;

public class CvListDto {
	private Integer currentPage;
	private Integer itemsOnPage;
	private Integer itemsTotal;

	private List<CvWrapperDto> cvList;

	public CvListDto(Integer currentPage, Integer itemsOnPage, Integer itemsTotal, List<CvWrapperDto> cvList) {
		super();
		this.currentPage = currentPage;
		this.itemsOnPage = itemsOnPage;
		this.itemsTotal = itemsTotal;
		this.cvList = cvList;
	}

	public CvListDto() {
		super();
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public Integer getItemsOnPage() {
		return itemsOnPage;
	}

	public Integer getItemsTotal() {
		return itemsTotal;
	}

	public List<CvWrapperDto> getCvList() {
		return cvList;
	}
}
