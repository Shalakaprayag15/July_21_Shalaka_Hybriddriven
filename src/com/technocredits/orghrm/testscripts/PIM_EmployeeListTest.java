package com.technocredits.orghrm.testscripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.technocredits.orghrm.pages.MenuPage;
import com.technocredits.orghrm.pages.PIM_EmployeeListPage;

public class PIM_EmployeeListTest extends TestBase {
	@BeforeMethod
	public void setUp() {
		super.setup();
	}

	@Test
	public void enterEmployeeToBeSearched() {
		System.out.println("STEP - Navigate to Employee List subtab under PIM tab");
		MenuPage menu = new MenuPage();
		menu.nevigateTo("PIM->Employee List");
		System.out.println("STEP - Enter Employee name to be searched and click on search");
		PIM_EmployeeListPage employeelist = new PIM_EmployeeListPage();
		employeelist
		.searchEmpName("shalaka M Prayag")
		.clickOnSearch();
		Assert.assertTrue(employeelist.isEmployeeAdded("shalaka M Prayag "));

	}

	//@AfterMethod()
	public void teardown() {
		super.tearDown();
	}

}
