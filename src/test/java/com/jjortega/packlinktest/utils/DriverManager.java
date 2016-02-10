package com.jjortega.packlinktest.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
	
	private WebDriver driver;
	
	public DriverManager() {
		
	}
	
	public WebDriver useFireFoxDriver() {
		this.driver = new FirefoxDriver();	
		return driver;
	}
	
	public void setImplicitWaitInSeconds(int seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
	
	public WebDriver getDriver() {
		return driver;
	}

}
