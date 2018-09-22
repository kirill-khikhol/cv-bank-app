package com.tel_ran.cvBank.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class AddressDto implements Serializable {
	@Getter
	private String country;
	@Getter
	private String cityTown;
	@Getter
	private String street;
	@Getter
	private String houseBuilding;
	@Getter
	private String postcode;
	@Getter
	private String phone;

	public String getCountry() {
		return country;
	}

	public String getCityTown() {
		return cityTown;
	}

	public String getStreet() {
		return street;
	}

	public String getHouseBuilding() {
		return houseBuilding;
	}

	public String getPostcode() {
		return postcode;
	}

	public String getPhone() {
		return phone;
	}

	public AddressDto(String country, String cityTown, String street, String houseBuilding, String postcode,
			String phone) {
		super();
		this.country = country;
		this.cityTown = cityTown;
		this.street = street;
		this.houseBuilding = houseBuilding;
		this.postcode = postcode;
		this.phone = phone;
	}

	public AddressDto() {
		super();
	}

}
