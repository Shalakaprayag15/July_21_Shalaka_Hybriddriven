package com.technocredits.orghrm.testscripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.technocredits.orghrm.pages.MenuPage;
import com.technocredits.orghrm.pages.PIM_AddEmployeePage;

public class PIM_AddEmployeeTest extends TestBase {
private MenuPage menuPage;
	@BeforeMethod
	public void setUp() {
		menuPage=super.setup();
	}
	
	@Test
	public void verifyAddEmpTest() {
		menuPage.nevigateTo("PIM->Add Employee");
		PIM_AddEmployeePage pim_AddEmployeePage = new PIM_AddEmployeePage();
		pim_AddEmployeePage
			.setEmpFirstName("Shalaka")
			.setEmpMiddleName("M")
			.setEmpLastName("Prayag")
			.setEmpLocation("Canadian Development Center")
			.clickOnNextButton()
			.setHobbies("Tracking")
			.clickOnNextButton()
			.setWorkShift("General")
			.setEffectiveForm("12","January","2016")
			.setEmpRegion("Region-1")
			.setEmpFte("0.75")
			.setEmpDepartment("Sub unit-1")
			.clickOnSave()
			.isSuccessfullySaveMsgDisplayed();
		
	}
	/*@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/
	
}
