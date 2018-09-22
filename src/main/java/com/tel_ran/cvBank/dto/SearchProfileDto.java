package com.tel_ran.cvBank.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class SearchProfileDto implements Serializable {
	@Getter
	private String searchProfileName;
	@Getter
	private FiltersDto filters;

	public SearchProfileDto(String searchProfileName, FiltersDto filters) {
		super();
		this.searchProfileName = searchProfileName;
		this.filters = filters;
	}

	public SearchProfileDto() {
		super();
	}

	public String getSearchProfileName() {
		return searchProfileName;
	}

	public FiltersDto getFilters() {
		return filters;
	}

}
