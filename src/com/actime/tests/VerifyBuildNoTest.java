package com.actime.tests;

import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.ActiLoginPage;
import com.actitime.pages.EnterTimeTrackPage;

public class VerifyBuildNoTest extends BaseTest{
	
	@Test(priority=1)
	public void TestBuildNo(){
		String user= ExcelData.getData("./data/input.xlsx","Sheet1",1,0);
		String pass=ExcelData.getData("./data/input.xlsx","Sheet1",1,1);
		String logintitle =	ExcelData.getData("./data/input.xlsx","Sheet1",1,2);
		String enterTimeTrack=ExcelData.getData("./data/input.xlsx","Sheet1",1,3);
		String buildn=ExcelData.getData("./data/input.xlsx","Sheet1",1,4);

		
		ActiLoginPage ap=new ActiLoginPage(driver);
		EnterTimeTrackPage ep=new EnterTimeTrackPage(driver);
		ap.verifyPage(logintitle);
		
		//enterUserName
		ap.enterUsername(user);
		
		//enterPassword
		ap.enterPassword(pass);
		
		//clickOnLogin
		ap.clickLogin();
		
		//verifyEnterTimeTrackPage
		ap.verifyPage(enterTimeTrack);
		
		//click on help
		ep.clickOnHelp();
		
		//click on about your actitime
		ep.clickOnAbtActi();
		
		//verify the build no
		ep.verifyBuild(buildn);
	}

}
