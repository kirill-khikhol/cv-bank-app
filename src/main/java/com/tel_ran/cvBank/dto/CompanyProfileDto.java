package com.tel_ran.cvBank.dto;

import java.io.Serializable;

public class CompanyProfileDto implements Serializable {
	private String companyName;
	private String webSite;
	private AddressDto address;
	private ApplicantDto applicant;

	public String getCompanyName() {
		return companyName;
	}

	public String getWebSite() {
		return webSite;
	}

	public AddressDto getAddress() {
		return address;
	}

	public ApplicantDto getApplicant() {
		return applicant;
	}

	public CompanyProfileDto(String companyName, String webSite, AddressDto address, ApplicantDto applicant) {
		super();
		this.companyName = companyName;
		this.webSite = webSite;
		this.address = address;
		this.applicant = applicant;
	}

	public CompanyProfileDto() {
		super();
	}

}
