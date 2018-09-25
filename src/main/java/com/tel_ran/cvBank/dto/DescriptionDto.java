package com.tel_ran.cvBank.dto;

import java.util.List;

public class DescriptionDto {
	private String about;
	private List<String> preferableArea;
	private String position;
	private Long salaryFrom;
	private Long salaryTo;

	public String getAbout() {
		return about;
	}

	public List<String> getPreferableArea() {
		return preferableArea;
	}

	public String getPosition() {
		return position;
	}

	public Long getSalaryFrom() {
		return salaryFrom;
	}

	public Long getSalaryTo() {
		return salaryTo;
	}

	public DescriptionDto() {
		super();
	}

	public DescriptionDto(String about, List<String> preferableArea, String position, Long salaryFrom, Long salaryTo) {
		super();
		this.about = about;
		this.preferableArea = preferableArea;
		this.position = position;
		this.salaryFrom = salaryFrom;
		this.salaryTo = salaryTo;
	}

}
