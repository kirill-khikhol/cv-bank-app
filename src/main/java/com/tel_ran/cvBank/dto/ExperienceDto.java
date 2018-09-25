package com.tel_ran.cvBank.dto;

import java.util.List;

public class ExperienceDto {
	private List<LocalExperienceDto> localExperience;
	private Double totalExperience;
	public ExperienceDto() {
		super();
	}
	public ExperienceDto(List<LocalExperienceDto> localExperience, Double totalExperience) {
		super();
		this.localExperience = localExperience;
		this.totalExperience = totalExperience;
	}

	public List<LocalExperienceDto> getLocalExperience() {
		return localExperience;
	}

	public Double getTotalExperience() {
		return totalExperience;
	}

}
