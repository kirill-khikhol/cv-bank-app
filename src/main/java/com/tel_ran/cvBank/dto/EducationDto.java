package com.tel_ran.cvBank.dto;

public class EducationDto {
	private String schoolInstitutionName;
	private String degree;
	private String graduationYear;
	private String location;
	private String details;

	public EducationDto(String schoolInstitutionName, String degree, String graduationYear, String location,
			String details) {
		super();
		this.schoolInstitutionName = schoolInstitutionName;
		this.degree = degree;
		this.graduationYear = graduationYear;
		this.location = location;
		this.details = details;
	}

	public EducationDto() {
		super();
	}

	public String getSchoolInstitutionName() {
		return schoolInstitutionName;
	}

	public String getDegree() {
		return degree;
	}

	public String getGraduationYear() {
		return graduationYear;
	}

	public String getLocation() {
		return location;
	}

	public String getDetails() {
		return details;
	}

}
