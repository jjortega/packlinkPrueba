package com.jjortega.packlinktest.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {
	
	private final String URL = "http://www.packlink.es";
	
	@FindBy(how=How.CSS, using="#headerLogin")
	private WebElement loginRegisterButton;
		
	@FindBy(how=How.CSS, using="#loginEmailpop")
	private WebElement emailTextBox;
	
	@FindBy(how=How.CSS, using="#loginPasspop")
	private WebElement passwordBox;
	
	@FindBy(how=How.CSS, using=".button_orange > a:nth-child(1)")
	private WebElement loginButton;
	
	@FindBy(how=How.CSS, using="#p03")
	private WebElement messageText;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void visit() {
		driver.navigate().to(URL);
	}
	
	public void clickOnLoginRegister() {
		loginRegisterButton.click();
	}
	
	public void typeEmail(String email){
		emailTextBox.clear();
		emailTextBox.sendKeys(email);
	}
	
	public void typePassword(String password){
		passwordBox.clear();
		passwordBox.sendKeys(password);
	}
	
	public void clickOnLogin() {
		loginButton.click();
	}
	
	public void checkTextOfMessageText(String expectedText) {
		assertEquals(expectedText, messageText.getText());
	}

}
