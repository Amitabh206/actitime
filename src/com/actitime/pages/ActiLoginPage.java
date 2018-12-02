package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BasePage;

public class ActiLoginPage extends BasePage {
	//declaration
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBTN;
	
	@FindBy(xpath="//nobr[contains(text(),'actiTIME')]")
	private WebElement version;

	//initialization
	public ActiLoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	//utilization
	public void enterUsername(String un){
		unTB.sendKeys(un);
	}
	public void enterPassword(String pwd){
		pwTB.sendKeys(pwd);
	}
	public void clickLogin(){
	 loginBTN.click();
	}
	public void verifyPage(String eTitle){
		VerifyTitle(eTitle);
	}
	
	public void verifyVersion(){
		verifyElement(version);
	}
	

}
