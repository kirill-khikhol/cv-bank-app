package com.tel_ran.cvBank.dto;

import java.io.Serializable;

public class CompanyProfileWrapperDto implements Serializable {
	private CompanyProfileDto company;

	public CompanyProfileDto getCompany() {
		return company;
	}

	public CompanyProfileWrapperDto(CompanyProfileDto company) {
		super();
		this.company = company;
	}

	public CompanyProfileWrapperDto() {
		super();
	}

}
