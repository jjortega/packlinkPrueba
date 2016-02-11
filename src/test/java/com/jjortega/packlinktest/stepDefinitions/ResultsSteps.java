package com.jjortega.packlinktest.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.jjortega.packlinktest.pageObjects.ResultsPage;
import com.jjortega.packlinktest.utils.DriverManager;

import cucumber.api.java.en.Then;

public class ResultsSteps {
	
	private WebDriver driver;
	private ResultsPage page;
	
	public ResultsSteps(DriverManager driverManager) {
		this.driver = driverManager.getDriver();
		page = new ResultsPage(driver);
	}
	
	@Then("^I check I am in results page$")
	public void i_check_I_am_in_results_page() {
		page.checkPageTitle("Elegir Servicio");
	}

	
}
