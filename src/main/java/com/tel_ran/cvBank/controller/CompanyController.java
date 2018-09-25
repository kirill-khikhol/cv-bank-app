package com.tel_ran.cvBank.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tel_ran.cvBank.api.CompanyRequestType;
import com.tel_ran.cvBank.dto.AddressDto;
import com.tel_ran.cvBank.dto.ApplicantDto;
import com.tel_ran.cvBank.dto.CompanyProfileDto;
import com.tel_ran.cvBank.dto.CompanyProfileWrapperDto;
import com.tel_ran.cvBank.dto.CompanyRegistrationDto;
import com.tel_ran.cvBank.dto.ContactInfoDto;
import com.tel_ran.cvBank.dto.CvForCompanyDto;
import com.tel_ran.cvBank.dto.CvListDto;
import com.tel_ran.cvBank.dto.CvListFromFolderDto;
import com.tel_ran.cvBank.dto.FiltersDto;
import com.tel_ran.cvBank.dto.FolderDto;
import com.tel_ran.cvBank.dto.FolderWrapperDto;
import com.tel_ran.cvBank.dto.LocalExperienceDto;
import com.tel_ran.cvBank.dto.MyFoldersDto;
import com.tel_ran.cvBank.dto.ProjectJobsDto;
import com.tel_ran.cvBank.dto.ProveSkillsResultDto;
import com.tel_ran.cvBank.dto.SearchProfileDto;
import com.tel_ran.cvBank.dto.SearchProfileWrapperDto;
import com.tel_ran.cvBank.dto.SearchProfilesDto;
import com.tel_ran.cvBank.dto.SkillDto;
import com.tel_ran.cvBank.dto.TitleDto;
import com.tel_ran.cvBank.dto.CvVeryShortDto;
import com.tel_ran.cvBank.dto.CvWrapperDto;
import com.tel_ran.cvBank.dto.DescriptionDto;
import com.tel_ran.cvBank.dto.EducationDto;
import com.tel_ran.cvBank.dto.ExperienceDto;

@RestController
public class CompanyController implements CompanyRequestType {

	@RequestMapping(value = REGISTRATION, method = RequestMethod.POST)
	public CompanyRegistrationDto registration(@RequestBody CompanyProfileDto company) {
		String token = company.getApplicant().getEmail() + ":" + "password";
		return new CompanyRegistrationDto(token, company);
	}

	@RequestMapping(value = LOGIN, method = RequestMethod.GET)
	public CompanyProfileWrapperDto login() {
		return new CompanyProfileWrapperDto(new CompanyProfileDto("inetex", "inetex.co.il",
				new AddressDto("israel", "rechovot", "some St", "777", "1234567", "0501234567"),
				new ApplicantDto("Vasya", "Pupkin", "chief", "pv@mail.com", "0512345678")));
	}

	@RequestMapping(value = SEARCH_PROFILES, method = RequestMethod.GET)
	public SearchProfilesDto getSearchProfiles() {
		List<SkillDto> skills = new ArrayList();
		skills.add(new SkillDto("java", true));
		List<String> region = new ArrayList();
		region.add("Center");
		region.add("South");
		List<SearchProfileWrapperDto> searchProfiles = new ArrayList();
		searchProfiles.add(new SearchProfileWrapperDto(new SearchProfileDto("java search profile",
				new FiltersDto("java developer", "medicine", region, skills, 12000, 21000, "Tel Aviv", "Israel"))));

		return new SearchProfilesDto(searchProfiles);
	}

	@RequestMapping(value = SEARCH_PROFILE, method = RequestMethod.PUT)
	public SearchProfileWrapperDto editSearchProfile(
			@RequestParam(value = "searchProfileName") String searchProfileName,
			@RequestBody SearchProfileDto searchProfile) {
		return new SearchProfileWrapperDto(searchProfile);
	}

	@RequestMapping(value = SEARCH_PROFILE, method = RequestMethod.DELETE)
	public SearchProfileWrapperDto deleteSearchProfile(
			@RequestParam(value = "searchProfileName") String searchProfileName) {
		List<SkillDto> skills = new ArrayList();
		skills.add(new SkillDto("java", true));
		List<String> region = new ArrayList();
		region.add("Center");
		region.add("South");
		SearchProfileDto searchProfile = new SearchProfileDto(searchProfileName,
				new FiltersDto("java developer", "medicine", region, skills, 12000, 21000, "Tel Aviv", "Israel"));
		return new SearchProfileWrapperDto(searchProfile);
	}

	@RequestMapping(value = CVS, method = RequestMethod.POST)
	public CvListDto searchCVs(@RequestParam(value = "itemsOnPage") Integer itemsOnPage,
			@RequestParam(value = "currentPage") Integer currentPage, @RequestBody FiltersDto filters) {
		Integer itemsTotal = 103;
		List<CvWrapperDto> cvList = new ArrayList<>();
		TitleDto title = new TitleDto("Petr", "Petrov");
		List<LocalExperienceDto> localExperience = new ArrayList<>();
		localExperience.add(new LocalExperienceDto("developer", 5.5));
		ExperienceDto experience = new ExperienceDto(localExperience, 5.5);
		ContactInfoDto contactInfo = new ContactInfoDto("jarusalem", "01.01.1980", "0501234567", "petr@petrov.com",
				"https://www.linkedin.com/in/petr-petrov-123456789/");
		List<String> preferableArea = new ArrayList<>();
		preferableArea.add("IoT");
		preferableArea.add("banking");
		DescriptionDto description = new DescriptionDto("I am java developer", preferableArea, "team leader", 20000l,
				50000l);
		List<EducationDto> education = new ArrayList<>();
		education.add(new EducationDto("technion", "m.s.", "2007", "Haifa, Israel", "details here"));
		List<SkillDto> skills = new ArrayList<>();
		skills.add(new SkillDto("java", true));
		skills.add(new SkillDto("javaScript", false));
		List<ProjectJobsDto> projectJobs = new ArrayList<>();
		Date startDate = new Date(100l);
		Date endDate = new Date(100000000l);
		List<String> achivements = new ArrayList<>();
		achivements.add("very fast");
		List<String> certifications = new ArrayList<>();
		certifications.add("google certificate");
		List<String> languages = new ArrayList<>();
		languages.add("english");
		languages.add("hebrew");
		languages.add("russian");
		List<String> footerLinks = new ArrayList<>();
		footerLinks.add("foter link 1");
		footerLinks.add("foter link 2");
		List<String> footerInfo = new ArrayList<>();
		footerInfo.add("footer info 1");
		footerInfo.add("footer info 2");
		projectJobs.add(new ProjectJobsDto("myCompany", "java developer", 90, startDate, endDate,
				"good project for good people"));
		cvList.add(new CvWrapperDto(new CvForCompanyDto("100500", "Java developer cv", title, experience, contactInfo,
				description, education, skills, projectJobs, achivements, certifications, languages, footerLinks,
				footerInfo, true)));

		return new CvListDto(currentPage, itemsOnPage, itemsTotal, cvList);
	}

	@RequestMapping(value = CV, method = RequestMethod.PUT)
	public String openOrExpandCvsDetails(@RequestParam(value = "cvId") String cvId) {
		return "openOrExpandCvsDetails ok" + System.lineSeparator() + "cvId = " + cvId;
	}

	@RequestMapping(value = CV_TO_LIST, method = RequestMethod.POST)
	public CvVeryShortDto saveCvToList(@RequestParam(value = "cvId") String cvId) {
		return new CvVeryShortDto(cvId);
	}

	@RequestMapping(value = CV_TO_LIST, method = RequestMethod.DELETE)
	public CvVeryShortDto removeCvFromList(@RequestParam(value = "cvId") String cvId) {
		return new CvVeryShortDto(cvId);
	}

	@RequestMapping(value = SAVED_CVS, method = RequestMethod.POST)
	public CvListDto getSavedCvs(@RequestParam(value = "itemsOnPage") Integer itemsOnPage,
			@RequestParam(value = "currentPage") Integer currentPage, @RequestBody FiltersDto filters) {
		Integer itemsTotal = 103;
		List<CvWrapperDto> cvList = new ArrayList<>();
		TitleDto title = new TitleDto("Petr", "Petrov");
		List<LocalExperienceDto> localExperience = new ArrayList<>();
		localExperience.add(new LocalExperienceDto("developer", 5.5));
		ExperienceDto experience = new ExperienceDto(localExperience, 5.5);
		ContactInfoDto contactInfo = new ContactInfoDto("jarusalem", "01.01.1980", "0501234567", "petr@petrov.com",
				"https://www.linkedin.com/in/petr-petrov-123456789/");
		List<String> preferableArea = new ArrayList<>();
		preferableArea.add("IoT");
		preferableArea.add("banking");
		DescriptionDto description = new DescriptionDto("I am java developer", preferableArea, "team leader", 20000l,
				50000l);
		List<EducationDto> education = new ArrayList<>();
		education.add(new EducationDto("technion", "m.s.", "2007", "Haifa, Israel", "details here"));
		List<SkillDto> skills = new ArrayList<>();
		skills.add(new SkillDto("java", true));
		skills.add(new SkillDto("javaScript", false));
		List<ProjectJobsDto> projectJobs = new ArrayList<>();
		Date startDate = new Date(100l);
		Date endDate = new Date(100000000l);
		List<String> achivements = new ArrayList<>();
		achivements.add("very fast");
		List<String> certifications = new ArrayList<>();
		certifications.add("google certificate");
		List<String> languages = new ArrayList<>();
		languages.add("english");
		languages.add("hebrew");
		languages.add("russian");
		List<String> footerLinks = new ArrayList<>();
		footerLinks.add("foter link 1");
		footerLinks.add("foter link 2");
		List<String> footerInfo = new ArrayList<>();
		footerInfo.add("footer info 1");
		footerInfo.add("footer info 2");
		projectJobs.add(new ProjectJobsDto("myCompany", "java developer", 90, startDate, endDate,
				"good project for good people"));
		cvList.add(new CvWrapperDto(new CvForCompanyDto("100500", "Java developer cv", title, experience, contactInfo,
				description, education, skills, projectJobs, achivements, certifications, languages, footerLinks,
				footerInfo, true)));

		return new CvListDto(currentPage, itemsOnPage, itemsTotal, cvList);
	}

	@RequestMapping(value = PROVE_SKILLS_RESULT, method = RequestMethod.GET)
	public ProveSkillsResultDto showProveSkillsResult(@RequestParam(value = "cvId") String cvId) {
		List<SkillDto> skills = new ArrayList();
		skills.add(new SkillDto("java", true));
		skills.add(new SkillDto("big data", false));

		return new ProveSkillsResultDto(skills);
	}

	@RequestMapping(value = PROFILE, method = RequestMethod.GET)
	public CompanyProfileWrapperDto getCompanyProfile() {
		return new CompanyProfileWrapperDto(new CompanyProfileDto("inetex", "inetex.co.il",
				new AddressDto("israel", "rechovot", "some St", "777", "1234567", "0501234567"),
				new ApplicantDto("Vasya", "Pupkin", "chief", "pv@mail.com", "0512345678")));
	}

	@RequestMapping(value = PROFILE, method = RequestMethod.PUT)
	public CompanyProfileWrapperDto editCompanyProfile(@RequestBody CompanyProfileDto company) {
		return new CompanyProfileWrapperDto(company);
	}

	@RequestMapping(value = MY_FOLDERS, method = RequestMethod.GET)
	public MyFoldersDto getMyFolders() {
		List<FolderWrapperDto> myFolders = new ArrayList<>();
		myFolders.add(new FolderWrapperDto(new FolderDto("java Devs")));
		return new MyFoldersDto(myFolders);
	}

	@RequestMapping(value = FOLDER, method = RequestMethod.GET)
	public CvListFromFolderDto getFolder(@RequestParam(value = "folderName") String folderName,
			@RequestParam(value = "itemsOnPage") Integer itemsOnPage,
			@RequestParam(value = "currentPage") Integer currentPage) {
		Integer itemsTotal = 103;
		List<CvWrapperDto> cvList = new ArrayList<>();
		TitleDto title = new TitleDto("Petr", "Petrov");
		List<LocalExperienceDto> localExperience = new ArrayList<>();
		localExperience.add(new LocalExperienceDto("developer", 5.5));
		ExperienceDto experience = new ExperienceDto(localExperience, 5.5);
		ContactInfoDto contactInfo = new ContactInfoDto("jarusalem", "01.01.1980", "0501234567", "petr@petrov.com",
				"https://www.linkedin.com/in/petr-petrov-123456789/");
		List<String> preferableArea = new ArrayList<>();
		preferableArea.add("IoT");
		preferableArea.add("banking");
		DescriptionDto description = new DescriptionDto("I am java developer", preferableArea, "team leader", 20000l,
				50000l);
		List<EducationDto> education = new ArrayList<>();
		education.add(new EducationDto("technion", "m.s.", "2007", "Haifa, Israel", "details here"));
		List<SkillDto> skills = new ArrayList<>();
		skills.add(new SkillDto("java", true));
		skills.add(new SkillDto("javaScript", false));
		List<ProjectJobsDto> projectJobs = new ArrayList<>();
		Date startDate = new Date(100l);
		Date endDate = new Date(100000000l);
		List<String> achivements = new ArrayList<>();
		achivements.add("very fast");
		List<String> certifications = new ArrayList<>();
		certifications.add("google certificate");
		List<String> languages = new ArrayList<>();
		languages.add("english");
		languages.add("hebrew");
		languages.add("russian");
		List<String> footerLinks = new ArrayList<>();
		footerLinks.add("foter link 1");
		footerLinks.add("foter link 2");
		List<String> footerInfo = new ArrayList<>();
		footerInfo.add("footer info 1");
		footerInfo.add("footer info 2");
		projectJobs.add(new ProjectJobsDto("myCompany", "java developer", 90, startDate, endDate,
				"good project for good people"));
		cvList.add(new CvWrapperDto(new CvForCompanyDto("100500", "Java developer cv", title, experience, contactInfo,
				description, education, skills, projectJobs, achivements, certifications, languages, footerLinks,
				footerInfo, true)));

		return new CvListFromFolderDto(currentPage, itemsOnPage, itemsTotal, cvList, folderName);
	}

	@RequestMapping(value = FOLDER, method = RequestMethod.POST)
	public FolderWrapperDto editFolder(@RequestParam(value = "folderName") String folderName,
			@RequestParam(value = "newFolderName") String newFolderName) {
		return new FolderWrapperDto(new FolderDto(newFolderName));
	}

	@RequestMapping(value = FOLDER, method = RequestMethod.DELETE)
	public FolderWrapperDto deleteFolder(@RequestParam(value = "folderName") String folderName) {
		return new FolderWrapperDto(new FolderDto(folderName));
	}

	@RequestMapping(value = CV_TO_FOLDER, method = RequestMethod.POST)
	public CvVeryShortDto saveCvToFolder(@RequestParam(value = "cvId") String cvId,
			@RequestParam(value = "folderName") String folderName) {
		return new CvVeryShortDto(cvId);
	}

	@RequestMapping(value = CV_TO_FOLDER, method = RequestMethod.DELETE)
	public CvVeryShortDto removeCvToFolder(@RequestParam(value = "cvId") String cvId,
			@RequestParam(value = "folderName") String folderName) {
		return new CvVeryShortDto(cvId);
	}
}
