package com.technocredits.orghrm.testscripts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.technocredits.orghrm.base.PredefinedActions;
import com.technocredits.orghrm.pages.DashboardPage;
import com.technocredits.orghrm.pages.LoginPage;

public class DashboaredTest {
	@Test
	public void verifyWidgets() {
		SoftAssert softAssert = new SoftAssert();
		System.out.println("Step-Launch orghrm application");
		PredefinedActions.start();

		LoginPage loginPage = new LoginPage();
		System.out.println("Step- Verify Logo displayed on Login Page");
		boolean isLogoDisplayed = loginPage.isLogoDisplayed();
		softAssert.assertTrue(isLogoDisplayed);

		System.out.println("Step- Verify Login Panel displayed on Login Page");
		Boolean isLoginPanelDisplayed = loginPage.isPanelHeadingDisplayed();
		softAssert.assertTrue(isLoginPanelDisplayed);

		System.out.println("Step-Enter Credentials");
		loginPage.enterCredentials("Admin", "phX9bA@BR3");
		softAssert.assertAll();

		System.out.println("Step-Click on Login button");
		loginPage.clickOnLoginButton();

		DashboardPage dashboardpage = new DashboardPage();
		System.out.println("Step-Verify Dashboard is displayed as Header Title");
		String actualPageTitle = dashboardpage.getTitleHeaderName();
		String expectedPageTitle = "Dashboard";
		softAssert.assertEquals(actualPageTitle, expectedPageTitle);

		System.out.println("Step-Verify Dashboard is displayed as Page Title");
		String actualHeaderTitle = dashboardpage.getTitlePageName();
		String expectedHeaderTitle = "Dashboard";
		softAssert.assertEquals(actualHeaderTitle, expectedHeaderTitle);

		System.out.println("Step-Verify total 11 widget's are disply on Dashboard page");
		int totalWidgets = dashboardpage.getWidgetSize();
		softAssert.assertEquals(totalWidgets, 12);
		softAssert.assertAll();

		System.out.println("Step-Get all widgets names");
		List<String> expectedWidgetList = new ArrayList<String>();
		expectedWidgetList.add("Quick Access");
		expectedWidgetList.add("Buzz Latest Posts");
		expectedWidgetList.add("Employee Job Details");
		expectedWidgetList.add("My Actions");
		expectedWidgetList.add("Headcount by Location");
		expectedWidgetList.add("Employees on Leave Today");
		expectedWidgetList.add("Time At Work");
		expectedWidgetList.add("Performance Quick Feedback");
		expectedWidgetList.add("Annual basic payment by Location");
		expectedWidgetList.add("Latest Documents");
		expectedWidgetList.add("Latest News");
		expectedWidgetList.add("Yearly New Hires");

		List<String> widgetList = dashboardpage.getWidgetName();
		System.out.println("Step-Verify widgets names");
		Assert.assertEquals(widgetList, expectedWidgetList);
	}

	@AfterMethod
	public void tearDown() {
		PredefinedActions.closeBrowser();
	}
}
