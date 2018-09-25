package com.tel_ran.cvBank.dto;

import java.util.List;

public class CvForCompanyDto implements CvDto{
	private String cvId;
	private String cvName;
	private TitleDto title;
	private ExperienceDto experience;
	private ContactInfoDto contactInfo;
	private DescriptionDto description;
	private List<EducationDto> education;
	private List<SkillDto> skills;
	private List<ProjectJobsDto> projectJobs;
	private List<String> achivements;
	private List<String> certifications;
	private List<String> languages;
	private List<String> footerLinks;
	private List<String> footerInfo;
	private Boolean isProved;

	public String getCvId() {
		return cvId;
	}

	public String getCvName() {
		return cvName;
	}

	public TitleDto getTitle() {
		return title;
	}

	public ExperienceDto getExperience() {
		return experience;
	}

	public ContactInfoDto getContactInfo() {
		return contactInfo;
	}

	public DescriptionDto getDescription() {
		return description;
	}

	public List<EducationDto> getEducation() {
		return education;
	}

	public List<SkillDto> getSkills() {
		return skills;
	}

	public List<ProjectJobsDto> getProjectJobs() {
		return projectJobs;
	}

	public List<String> getAchivements() {
		return achivements;
	}

	public List<String> getCertifications() {
		return certifications;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public List<String> getFooterLinks() {
		return footerLinks;
	}

	public List<String> getFooterInfo() {
		return footerInfo;
	}

	public Boolean getIsProved() {
		return isProved;
	}

	public CvForCompanyDto() {
		super();
	}

	public CvForCompanyDto(String cvId, String cvName, TitleDto title, ExperienceDto experience,
			ContactInfoDto contactInfo, DescriptionDto description, List<EducationDto> education, List<SkillDto> skills,
			List<ProjectJobsDto> projectJobs, List<String> achivements, List<String> certifications,
			List<String> languages, List<String> footerLinks, List<String> footerInfo, Boolean isProved) {
		super();
		this.cvId = cvId;
		this.cvName = cvName;
		this.title = title;
		this.experience = experience;
		this.contactInfo = contactInfo;
		this.description = description;
		this.education = education;
		this.skills = skills;
		this.projectJobs = projectJobs;
		this.achivements = achivements;
		this.certifications = certifications;
		this.languages = languages;
		this.footerLinks = footerLinks;
		this.footerInfo = footerInfo;
		this.isProved = isProved;
	}

}
