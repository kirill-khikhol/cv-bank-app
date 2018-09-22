package com.tel_ran.cvBank.dto;

import java.io.Serializable;

public class ApplicantDto implements Serializable{
	private String firstName;
	private String lastName;
	private String position;
	private String email;
	private String phone;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPosition() {
		return position;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public ApplicantDto(String firstName, String lastName, String position, String email, String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
		this.email = email;
		this.phone = phone;
	}

	public ApplicantDto() {
		super();
	}
}
