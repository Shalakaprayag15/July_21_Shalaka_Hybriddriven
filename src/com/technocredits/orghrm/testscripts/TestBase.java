package com.technocredits.orghrm.testscripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.technocredits.orghrm.base.PredefinedActions;
import com.technocredits.orghrm.pages.LoginPage;
import com.technocredits.orghrm.pages.MenuPage;

public class TestBase {

	public MenuPage setup() {
		System.out.println("Step-Launch orghrm application");
		PredefinedActions.start();
		LoginPage loginPage = new LoginPage();
		System.out.println("Step-Enter Credentials");
		loginPage.enterCredentials("Admin", "phX9bA@BR3");
		System.out.println("Step-Click on Login button");
		return loginPage.clickOnLoginButton();
	} 
	
	public void tearDown() {
		PredefinedActions.closeBrowser();
	}

}
