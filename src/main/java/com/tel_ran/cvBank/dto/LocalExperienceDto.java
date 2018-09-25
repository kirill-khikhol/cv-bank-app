package com.tel_ran.cvBank.dto;

public class LocalExperienceDto {
private String position;
	private Double years;

	public String getPosition() {
		return position;
	}

	public Double getYears() {
		return years;
	}

	public LocalExperienceDto() {
		super();
	}

	public LocalExperienceDto(String position, Double years) {
		super();
		this.position = position;
		this.years = years;
	}
}
