package com.tel_ran.cvBank.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class SearchProfileWrapperDto implements Serializable {
	@Getter
	private SearchProfileDto searchProfile;

	public SearchProfileWrapperDto(SearchProfileDto searchProfile) {
		super();
		this.searchProfile = searchProfile;
	}

	public SearchProfileWrapperDto() {
		super();
	}

	public SearchProfileDto getSearchProfile() {
		return searchProfile;
	}

}
