package com.jjortega.packlinktest.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InitUserPage extends BasePage {
	
	@FindBy(how=How.CSS, using="#botoneraUsuario > div.textoCuenta")
	private WebElement accountText;

	public InitUserPage(WebDriver driver) {
		super(driver);
	}
	
	public void checkTextOfAccountTest(String expectedText) {
		assertEquals(expectedText, accountText.getText());
	}

}
