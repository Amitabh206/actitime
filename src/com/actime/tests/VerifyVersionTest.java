package com.actime.tests;

import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.ActiLoginPage;

public class VerifyVersionTest extends BaseTest{
	
	@Test
	public void testVerifyversion(){
		
		String loginTitle=ExcelData.getData("C:/Users/Amitabh/Selenium/ActiTime/data/input.xlsx","Sheet1",1,2);
		
		ActiLoginPage ap=new ActiLoginPage(driver);
		
		ap.verifyPage(loginTitle);
		
		ap.verifyVersion();
		
	}
	

}
