package com.jjortega.packlinktest.pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class SearchSection extends BasePage {
	
	@FindBy(how=How.CSS, using="#ol5_select")
	private WebElement originCountrySelector;
	
	@FindBy(how=How.CSS, using="#cp_desde")
	private WebElement originZipLocalityTextBox;
	
	@FindBy(how=How.CSS, using="#dl5_select")
	private WebElement destinationCountrySelector;
	
	@FindBy(how=How.CSS, using="#cp_hasta")
	private WebElement destinationZipLocalityTextBox;
	
	@FindBy(how=How.CSS, using="#peso1")
	private WebElement weightTextBox;

	@FindBy(how=How.CSS, using="#largo1")
	private WebElement lengthTextBox;
	
	@FindBy(how=How.CSS, using="#ancho1")
	private WebElement widthTextBox;
	
	@FindBy(how=How.CSS, using="#alto1")
	private WebElement heightTextBox;

	@FindBy(how=How.CSS, using=".botonFacturaTexto")
	private WebElement searchButton;

	public SearchSection(WebDriver driver) {
		super(driver);
	}
	
	public void typeOriginZipLocality (String originZipLocality) {
		originZipLocalityTextBox.clear();
		originZipLocalityTextBox.sendKeys(originZipLocality);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		originZipLocalityTextBox.sendKeys(Keys.ARROW_DOWN);
		originZipLocalityTextBox.sendKeys(Keys.ENTER);
	}
	
	public void typeDestinationZipLocality (String destinationZipLocality) {
		destinationZipLocalityTextBox.clear();
		destinationZipLocalityTextBox.sendKeys(destinationZipLocality);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		destinationZipLocalityTextBox.sendKeys(Keys.ARROW_DOWN);
		destinationZipLocalityTextBox.sendKeys(Keys.ENTER);
	}
	
	public void typeWeight(String weight) {
		weightTextBox.clear();
		weightTextBox.sendKeys(weight);
	}
	
	public void typeLenght(String lenght) {
		lengthTextBox.clear();
		lengthTextBox.sendKeys(lenght);
	}
	
	public void typeWidth(String width) {
		widthTextBox.clear();
		widthTextBox.sendKeys(width);
	}

	public void typeHeight(String height) {
		heightTextBox.clear();
		heightTextBox.sendKeys(height);
	}
	
	public void selectOriginCountry(String originCountry) {
		Select select = new Select(originCountrySelector);
		select.selectByVisibleText(originCountry);
	}
	
	public void selectDestinationCountry(String destinationCountry) {
		Select select = new Select(destinationCountrySelector);
		select.selectByVisibleText(destinationCountry);
	}
	
	public void clickOnSearchButton() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", searchButton);
		searchButton.click();
	}

}
