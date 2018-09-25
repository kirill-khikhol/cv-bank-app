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
	private Boolean isProved;

	public SkillDto(String skillName, Boolean isProved) {
		super();
		this.skillName = skillName;
		this.isProved = isProved;
	}

	public SkillDto() {
		super();
	}

	public String getSkillName() {
		return skillName;
	}

	public Boolean getIsProved() {
		return isProved;
	}

}
