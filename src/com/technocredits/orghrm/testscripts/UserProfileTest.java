package com.technocredits.orghrm.testscripts;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.technocredits.orghrm.base.PredefinedActions;
import com.technocredits.orghrm.pages.LoginPage;
import com.technocredits.orghrm.pages.MenuPage;
import com.technocredits.orghrm.pages.UserProfilePage;

public class UserProfileTest extends TestBase {

	@BeforeMethod
	public void setUp() {
		MenuPage menuPage = super.setup();
	}
	@Test
	public void verifyMenuOption() {
		UserProfilePage userProfilePage = new UserProfilePage();
		System.out.println("Step-Click on Login button");
		userProfilePage.clickOnUserDropdown();

		System.out.println("Step-Get list of User Dropdown");
		List<String> expecteddropdownList = new ArrayList<String>();
		expecteddropdownList.add("About");
		expecteddropdownList.add("Change Password");
		expecteddropdownList.add("Logout");
		List<String> listOfDropdown = userProfilePage.getListOfUserDropdown();
		Assert.assertEquals(listOfDropdown, expecteddropdownList);

		System.out.println("Step-Get total User Dropdown");
		int totalUserDropdown = userProfilePage.getTotalUserDropdown();
		Assert.assertEquals(totalUserDropdown, 3);

		System.out.println("Step-Click on About button");
		userProfilePage.clickOnAbout();

		System.out.println("Step-Get list of About menu");
		List<String> expectedAboutMenuList = new ArrayList<String>();
		expectedAboutMenuList.add("Company Name: OrangeHRM (Pvt) Ltd(Parallel Demo)");
		expectedAboutMenuList.add("Version: OrangeHRM 7.2.159485");
		expectedAboutMenuList.add("Employees: 95 (305 more allowed)");
		expectedAboutMenuList.add("Users: 77 (723 more allowed)");
		expectedAboutMenuList.add("Renewal on: Wed, 01 Jun 2022");
		List<String> listOfAboutMenu = userProfilePage.getListOfUserDropdown();
		Assert.assertEquals(listOfAboutMenu, expecteddropdownList);
	}
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}
}
