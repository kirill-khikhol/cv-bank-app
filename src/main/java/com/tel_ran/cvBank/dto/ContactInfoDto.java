package com.tel_ran.cvBank.dto;

public class ContactInfoDto {
	private String residence;
	private String birthday;
	private String phone;
	private String email;
	private String linkedIn;

	public ContactInfoDto(String residence, String birthday, String phone, String email, String linkedIn) {
		super();
		this.residence = residence;
		this.birthday = birthday;
		this.phone = phone;
		this.email = email;
		this.linkedIn = linkedIn;
	}

	public ContactInfoDto() {
		super();
	}

	public String getResidence() {
		return residence;
	}

	public String getBirthday() {
		return birthday;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public String getLinkedIn() {
		return linkedIn;
	}
}
