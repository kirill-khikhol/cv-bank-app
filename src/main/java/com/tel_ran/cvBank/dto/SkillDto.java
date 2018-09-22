package com.tel_ran.cvBank.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
// @RequiredArgsConstructor
public class SkillDto implements Serializable {
	@Getter
	private String skillName;
	// private String isProved;

	public SkillDto(String skillName) {
		super();
		this.skillName = skillName;
	}

	public SkillDto() {
		super();
	}

	public String getSkillName() {
		return skillName;
	}

}
