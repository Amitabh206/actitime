package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.actitime.generic.BasePage;

public class EnterTimeTrackPage extends BasePage{
	

	//declaration
	@FindBy(id="logoutLink")
	private WebElement logoutBTN;
	
	@FindBy(xpath="//div[@class='popup_menu_icon support_icon']")
	private WebElement helpBTN;
	
	@FindBy(xpath="//a[.='About your actiTIME']")
	private WebElement abtLink;
	
	@FindBy(xpath="//span[.='(build 40469)']")
	private WebElement buildNo;
	
	//initialization
	public EnterTimeTrackPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	//utilization
	public void clikOnLogOut(){
		logoutBTN.click();
	}
	public void clickOnHelp(){
		helpBTN.click();
	}
	
	public void clickOnAbtActi(){
		abtLink.click();
	}
	public void verifyBuild(String build){
		Reporter.log(buildNo.getText(), true);
		if(buildNo.getText().equals(build)){
			Reporter.log("number is same..", true);
		}
		else{
			Reporter.log("number is not same..", true);

		}
	}
}
