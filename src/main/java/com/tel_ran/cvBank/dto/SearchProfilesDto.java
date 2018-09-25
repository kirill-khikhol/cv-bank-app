package com.tel_ran.cvBank.dto;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class SearchProfilesDto implements Serializable {
	@Getter
	private List<SearchProfileWrapperDto> searchProfiles;

	public SearchProfilesDto(List<SearchProfileWrapperDto> searchProfiles) {
		super();
		this.searchProfiles = searchProfiles;
	}

	public SearchProfilesDto() {
		super();
	}

	public List<SearchProfileWrapperDto> getSearchProfiles() {
		return searchProfiles;
	}

}
