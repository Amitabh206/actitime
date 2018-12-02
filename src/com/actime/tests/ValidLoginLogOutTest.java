package com.actime.tests;

import org.testng.annotations.Test;


import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.ActiLoginPage;
import com.actitime.pages.EnterTimeTrackPage;

public class ValidLoginLogOutTest extends BaseTest {
	@Test
	public void testValidLoginLogout(){
	String user= ExcelData.getData("./data/input.xlsx","Sheet1",1,0);
	String pass=ExcelData.getData("./data/input.xlsx","Sheet1",1,1);
	String logintitle =	ExcelData.getData("./data/input.xlsx","Sheet1",1,2);
	String enterTimeTrack=ExcelData.getData("./data/input.xlsx","Sheet1",1,3);
	
	ActiLoginPage Alp=new ActiLoginPage(driver);
	EnterTimeTrackPage ep=new EnterTimeTrackPage(driver);
	//VerifyLoginPage
	Alp.verifyPage(logintitle);
	
	//enterUserName
	Alp.enterUsername(user);
	
	//enterPassword
	Alp.enterPassword(pass);
	
	//clickOnLogin
	Alp.clickLogin();
	
	//verifyEnterTimeTrackPage
	Alp.verifyPage(enterTimeTrack);
	
	//clickLogOut
	ep.clikOnLogOut();
	
	//verifyLoginPage
	Alp.verifyPage(logintitle);

	}

}
