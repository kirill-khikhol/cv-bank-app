package com.tel_ran.cvBank.dto;

import java.util.Date;

public class ProjectJobsDto {
	private String company;
	private String position;
	private Integer backEndFrontEndRatio;
	private Date startDate;
	private Date endDate;
	private String projectDescription;

	public ProjectJobsDto() {
		super();
	}

	public ProjectJobsDto(String company, String position, Integer backEndFrontEndRatio, Date startDate, Date endDate,
			String projectDescription) {
		super();
		this.company = company;
		this.position = position;
		this.backEndFrontEndRatio = backEndFrontEndRatio;
		this.startDate = startDate;
		this.endDate = endDate;
		this.projectDescription = projectDescription;
	}

	public String getCompany() {
		return company;
	}

	public String getPosition() {
		return position;
	}

	public Integer getBackEndFrontEndRatio() {
		return backEndFrontEndRatio;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

}
