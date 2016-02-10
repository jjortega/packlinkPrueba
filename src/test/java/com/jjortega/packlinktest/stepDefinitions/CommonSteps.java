package com.jjortega.packlinktest.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.jjortega.packlinktest.pageObjects.BasePage;
import com.jjortega.packlinktest.utils.DriverManager;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CommonSteps {
	
	private DriverManager driverManager;
	private BasePage page;
	
	public CommonSteps (DriverManager driverManager) {
		this.driverManager = driverManager;
	}
	
	@Before
	public void setUp() {
		driverManager.useFireFoxDriver();
		driverManager.setImplicitWaitInSeconds(10);
	}
	
	@After
	public void tearDown() {
		driverManager.getDriver().quit();
	}

}
