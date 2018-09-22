package com.tel_ran.cvBank.dto;

import java.io.Serializable;

public class CompanyRegistrationDto implements Serializable {
	private String token;
	private CompanyProfileDto company;

	public String getToken() {
		return token;
	}

	public CompanyProfileDto getCompany() {
		return company;
	}

	public CompanyRegistrationDto(String token, CompanyProfileDto company) {
		super();
		this.token = token;
		this.company = company;
	}

	public CompanyRegistrationDto() {
		super();
	}

}
