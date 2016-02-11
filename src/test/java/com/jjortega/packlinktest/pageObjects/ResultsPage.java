package com.jjortega.packlinktest.pageObjects;

import org.openqa.selenium.WebDriver;

public class ResultsPage extends BasePage {

	public ResultsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void checkPageTitle(String expectedTitle) {
		assertEquals("Elegir Servicio",driver.getTitle());
	}

}
