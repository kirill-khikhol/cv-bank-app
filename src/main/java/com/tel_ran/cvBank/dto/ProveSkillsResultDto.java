package com.tel_ran.cvBank.dto;

import java.util.List;

public class ProveSkillsResultDto {
	private List<SkillDto> skills;

	public ProveSkillsResultDto(List<SkillDto> skills) {
		super();
		this.skills = skills;
	}

	public List<SkillDto> getSkills() {
		return skills;
	}

	public ProveSkillsResultDto() {
		super();
	}
	
}
