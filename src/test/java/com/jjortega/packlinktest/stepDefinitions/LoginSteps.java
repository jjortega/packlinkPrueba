package com.jjortega.packlinktest.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Sleeper;

import com.jjortega.packlinktest.pageObjects.HomePage;
import com.jjortega.packlinktest.pageObjects.InitUserPage;
import com.jjortega.packlinktest.utils.DriverManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	private WebDriver driver;
	private HomePage page;
	
	public LoginSteps(DriverManager driverManager) {
		this.driver = driverManager.getDriver();
		page = new HomePage(driver);
	}


	@Given("^I go to init page$")
	public void i_go_to_init_page() {
		page.visit();
	}
	
	@Given("^I click on Login/Register button$")
	public void i_click_on_Login_Register_button() {
		page.clickOnLoginRegister();
	}
	
	@Given("^I type (.*) in emailTextBox$")
	public void i_type_email_in_emailTextBox(String email) {
		page.typeEmail(email);
	}
	
	@Given("^I type (.*) in passwordTextBox$")
	public void i_type_password_in_passwordTextBox(String password) {
		page.typePassword(password);
	}
	
	@When("^I click on Login button$")
	public void i_click_on_Login_button() {
		page.clickOnLogin();
	}
	
	@Then("^I check that (.*) is un textAccount$")
	public void i_check_that_text_is_un_textAccount(String text) {
		InitUserPage initUserPage = new InitUserPage(driver);
		initUserPage.checkTextOfAccountTest(text);
	}
	
	@Then("^I check that (.*) is un messageText$")
	public void i_check_that_text_is_un_messageText(String text) {
		page.checkTextOfMessageText(text);
	}
	
	@Then("^I check that the color of emailTextBox is red$")
	public void i_check_that_the_color_of_emailTextBox_is_red() {
		page.checkColorOnEmailBox("rgba(255, 170, 170, 1)");
	}

	@Then("^I check that the color of passwordTextBox is red$")
	public void i_check_that_the_color_of_passwordTextBox_is_red() {
		page.checkColorOnPasswordBox("rgba(255, 170, 170, 1)");
	}
}
