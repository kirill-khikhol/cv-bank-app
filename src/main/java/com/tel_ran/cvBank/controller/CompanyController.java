package com.tel_ran.cvBank.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tel_ran.cvBank.api.CompanyRequestType;

@RestController
public class CompanyController implements CompanyRequestType {

	@RequestMapping(value = REGISTRATION, method = RequestMethod.POST)
	public String registration() {
		return "registration ok";
	}

	@RequestMapping(value = LOGIN, method = RequestMethod.GET)
	public String login() {
		return "login ok";
	}

	@RequestMapping(value = SEARCH_PROFILES, method = RequestMethod.GET)
	public String getSearchProfiles() {
		return "getSearchProfiles ok";
	}

	@RequestMapping(value = SEARCH_PROFILE, method = RequestMethod.PUT)
	public String editSearchProfile(@RequestParam(value = "searchProfileName") String searchProfileName) {
		return "editSearchProfile ok" + System.lineSeparator() + "searchProfileName = " + searchProfileName;
	}

	@RequestMapping(value = SEARCH_PROFILE, method = RequestMethod.DELETE)
	public String deleteSearchProfile(@RequestParam(value = "searchProfileName") String searchProfileName) {
		return "deleteSearchProfile ok" + System.lineSeparator() + "searchProfileName = " + searchProfileName;
	}

	@RequestMapping(value = CVS, method = RequestMethod.POST)
	public String searchCVs(@RequestParam(value = "itemsOnPage") Integer itemsOnPage,
			@RequestParam(value = "currentPage") Integer currentPage) {
		return "searchCVs ok" + System.lineSeparator() + "itemsOnPage = " + itemsOnPage + System.lineSeparator()
				+ "currentPage = " + currentPage;
	}

	@RequestMapping(value = CV, method = RequestMethod.PUT)
	public String openOrExpandCvsDetails(@RequestParam(value = "cvId") String cvId) {
		return "openOrExpandCvsDetails ok" + System.lineSeparator() + "cvId = " + cvId;
	}

	@RequestMapping(value = CV_TO_LIST, method = RequestMethod.POST)
	public String saveCvToList(@RequestParam(value = "cvId") String cvId) {
		return "saveCvToList ok" + System.lineSeparator() + "cvId = " + cvId;
	}

	@RequestMapping(value = CV_TO_LIST, method = RequestMethod.DELETE)
	public String removeCvFromList(@RequestParam(value = "cvId") String cvId) {
		return "removeCvFromList ok" + System.lineSeparator() + "cvId = " + cvId;
	}

	@RequestMapping(value = SAVED_CVS, method = RequestMethod.POST)
	public String getSavedCvs(@RequestParam(value = "itemsOnPage") Integer itemsOnPage,
			@RequestParam(value = "currentPage") Integer currentPage) {
		return "getSavedCvs ok" + System.lineSeparator() + "itemsOnPage = " + itemsOnPage + System.lineSeparator()
				+ "currentPage = " + currentPage;
	}

	@RequestMapping(value = PROVE_SKILLS_RESULT, method = RequestMethod.GET)
	public String showProveSkillsResult(@RequestParam(value = "cvId") String cvId) {
		return "showProveSkillsResult ok" + System.lineSeparator() + "cvId = " + cvId;
	}

	@RequestMapping(value = PROFILE, method = RequestMethod.GET)
	public String getCompanyProfile() {
		return "getCompanyProfile ok";
	}

	@RequestMapping(value = PROFILE, method = RequestMethod.PUT)
	public String editCompanyProfile() {
		return "editCompanyProfile ok";
	}

	@RequestMapping(value = MY_FOLDERS, method = RequestMethod.GET)
	public String getMyFolders() {
		return "getMyFolders ok";
	}

	@RequestMapping(value = FOLDER, method = RequestMethod.GET)
	public String getFolder(@RequestParam(value = "folderName") String folderName,
			@RequestParam(value = "itemsOnPage") Integer itemsOnPage,
			@RequestParam(value = "currentPage") Integer currentPage) {
		return "getFolder ok" + System.lineSeparator() + "folderName = " + folderName + System.lineSeparator()
				+ "itemsOnPage = " + itemsOnPage + System.lineSeparator() + "currentPage = " + currentPage;
	}

	@RequestMapping(value = FOLDER, method = RequestMethod.POST)
	public String editFolder(@RequestParam(value = "folderName") String folderName,
			@RequestParam(value = "newFolderName") String newFolderName) {
		return "editFolder ok" + System.lineSeparator() + "folderName = " + folderName + System.lineSeparator()
				+ "newFolderName = " + newFolderName;
	}

	@RequestMapping(value = FOLDER, method = RequestMethod.DELETE)
	public String deleteFolder(@RequestParam(value = "folderName") String folderName) {
		return "deleteFolder ok" + System.lineSeparator() + "folderName = " + folderName;
	}

	@RequestMapping(value = CV_TO_FOLDER, method = RequestMethod.POST)
	public String saveCvToFolder(@RequestParam(value = "cvId") String cvId,
			@RequestParam(value = "folderName") String folderName) {
		return "saveCvToFolder ok" + System.lineSeparator() + "cvId = " + cvId + System.lineSeparator()
				+ "folderName = " + folderName;
	}

	@RequestMapping(value = CV_TO_FOLDER, method = RequestMethod.DELETE)
	public String removeCvToFolder(@RequestParam(value = "cvId") String cvId,
			@RequestParam(value = "folderName") String folderName) {
		return "removeCvToFolder ok" + System.lineSeparator() + "cvId = " + cvId + System.lineSeparator()
				+ "folderName = " + folderName;
	}
}
