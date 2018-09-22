package com.tel_ran.cvBank.dto;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class FiltersDto implements Serializable {
	@Getter
	private String position;
	@Getter
	private String profArea;
	@Getter
	private List<String> region;
	@Getter
	private List<SkillDto> skills;
	@Getter
	private Integer salaryFrom;
	@Getter
	private Integer salaryTo;
	@Getter
	private String city;
	@Getter
	private String citizenship;

	public FiltersDto(String position, String profArea, List<String> region, List<SkillDto> skills, Integer salaryFrom,
			Integer salaryTo, String city, String citizenship) {
		super();
		this.position = position;
		this.profArea = profArea;
		this.region = region;
		this.skills = skills;
		this.salaryFrom = salaryFrom;
		this.salaryTo = salaryTo;
		this.city = city;
		this.citizenship = citizenship;
	}

	public FiltersDto() {
		super();
	}

	public String getPosition() {
		return position;
	}

	public String getProfArea() {
		return profArea;
	}

	public List<String> getRegion() {
		return region;
	}

	public List<SkillDto> getSkills() {
		return skills;
	}

	public Integer getSalaryFrom() {
		return salaryFrom;
	}

	public Integer getSalaryTo() {
		return salaryTo;
	}

	public String getCity() {
		return city;
	}

	public String getCitizenship() {
		return citizenship;
	}

}
