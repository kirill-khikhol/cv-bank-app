package com.tel_ran.cvBank.dto;

public class TitleDto {
	private String firstName;
	private String lastName;

	public TitleDto(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public TitleDto() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

}
