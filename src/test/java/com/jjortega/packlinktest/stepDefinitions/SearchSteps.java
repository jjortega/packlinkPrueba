package com.jjortega.packlinktest.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.jjortega.packlinktest.pageObjects.ResultsPage;
import com.jjortega.packlinktest.pageObjects.SearchSection;
import com.jjortega.packlinktest.utils.DriverManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchSteps {

	private WebDriver driver;
	private SearchSection page;
	
	public SearchSteps(DriverManager driverManager) {
		this.driver = driverManager.getDriver();
		page = new SearchSection(driver);
	}
	
	@Given("^I choose this (.*) Country and (.*),  and this (.*) and (.*)$")
	public void i_choose_this_X_Country_and_X_and_this_X_and_X(String originCountry, String originZipLocality, String destinationCountry, String destinationZipLocality) {
		page.selectOriginCountry(originCountry);
		page.typeOriginZipLocality(originZipLocality);
		page.selectDestinationCountry(destinationCountry);
		page.typeDestinationZipLocality(destinationZipLocality);
	}
	
	@Given("^I have this one package with this characteristics (.*), (.*), (.*) and (.*)$")
	public void i_have_this_one_package_with_this_characteristics(String weight, String lenght, String width, String height) {
		page.typeWeight(weight);
		page.typeLenght(lenght);
		page.typeWidth(width);
		page.typeHeight(height);
	}
	
	@When("^I click on search button$")
	public void i_click_on_search_button() {
		page.clickOnSearchButton();
	}
	
	@Then("^I check the important message is (.*)$")
	public void i_check_the_important_message_is(String expectedMessage) {
		page.checkImportantMessage(expectedMessage);
	}
	
}
