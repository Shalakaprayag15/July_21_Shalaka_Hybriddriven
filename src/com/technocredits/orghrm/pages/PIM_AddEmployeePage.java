package com.technocredits.orghrm.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.technocredits.orghrm.base.PredefinedActions;

public class PIM_AddEmployeePage extends PredefinedActions {

	public PIM_AddEmployeePage setEmpFirstName(String fname) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement fnameElement =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='first-name-box']")));
		fnameElement.sendKeys(fname);
		return this;
	}

	public PIM_AddEmployeePage setEmpMiddleName(String mname) {
		driver.findElement(By.xpath("//input[@id='middle-name-box']")).sendKeys(mname);
		return this;
	}

	public PIM_AddEmployeePage setEmpLastName(String lname) {
		driver.findElement(By.xpath("//input[@id='last-name-box']")).sendKeys(lname);
		return this;
	}

	public PIM_AddEmployeePage setEmpLocation(String location) {
		driver.findElement(By.xpath("//div[text()='-- Select --']")).click();
		driver.findElement(By.xpath("//span[text()='" + location + "']//parent::a")).click();
		return this;
	}

	public void addEmpInfo(String fname, String mname, String lname, String location) {
		setEmpFirstName(fname);
		setEmpMiddleName(mname);
		setEmpLastName(lname);
		setEmpFirstName(location);

	}

	public PIM_AddEmployeePage clickOnNextButton() {
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		return this;

	}

	public PIM_AddEmployeePage setHobbies(String hobbies) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement hobbyElement=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='5']")));
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",hobbyElement);
		hobbyElement.sendKeys(hobbies);
		return this;
	}

	public PIM_AddEmployeePage setWorkShift(String shiftValue) {// Default Shift
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Work Shift']/preceding-sibling::div//input")));
		e.click();
		/*try {
			driver.findElement(By.xpath("//label[text()='Work Shift']/preceding-sibling::div//input")).click();
		} catch (StaleElementReferenceException se) {
			driver.findElement(By.xpath("//label[text()='Work Shift']/preceding-sibling::div//input")).click();
		}*/
		WebElement e1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='work_shift_id_inputfileddiv']//span[text()='" + shiftValue + "']")));
		e1.click();
		//driver.findElement(By.xpath("//div[@id='work_shift_id_inputfileddiv']//span[text()='" + shiftValue + "']")).click();
		
		return this;
	}

	
	// ul[@class='dropdown-content select-dropdown']/li/span[text()='January']//String date,
	public PIM_AddEmployeePage setEffectiveForm( String date,String month, String year) {
		/*driver.findElement(By.xpath("//input[contains(@class,'ng-empty ng-valid-schema-form')]//following-sibling::i"))
				.click();
		WebDriverWait wait = new WebDriverWait(driver,60);
		WebElement dateElement= wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//input[@id='add_employee_effective_date']//following-sibling::span[1]//div[text()='"+date+"'][contains(@class,'--infocus')]"))));		
		dateElement.click();
		driver.findElement(By.xpath("//div[@class='select-wrapper picker__select--month']//input")).click();
		WebElement monthElement=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='select-wrapper picker__select--month']//span[text()='" + month + "']")));
		monthElement.click();
		driver.findElement(By.xpath("//div[@class='select-wrapper picker__select--year']//input")).click();
		driver.findElement(By.xpath("//div[@class='select-wrapper picker__select--year']//span[text()='" + year + "']"))
				.click();
		
		return this;
		*/
		
		
		driver.findElement(By.xpath("//label[text()='Effective From']/following-sibling::span//i")).click();

		driver.findElement(By.xpath("//div[@class='select-wrapper picker__select--month']//input")).click();

	

		driver.findElement(
				By.xpath("//div[@class='select-wrapper picker__select--month']//span[text()='" + month + "']")).click();
		driver.findElement(By.xpath("//div[@class='select-wrapper picker__select--year']//input")).click();
		driver.findElement(By.xpath("//div[@class='select-wrapper picker__select--year']//span[text()='" + year + "']"))
				.click();
		driver.findElement(
				By.xpath("//input[@id='add_employee_effective_date']//following-sibling::span[1]//div[text()='" + date
						+ "'][contains(@class,'--infocus')]"))
				.click();
		return this;
	}

	public PIM_AddEmployeePage setEmpRegion(String region) {// Region-2
		WebDriverWait wait = new WebDriverWait(driver,15);
		WebElement regionDropDown= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Region']/preceding-sibling::div/input")));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",regionDropDown);
		regionDropDown.click();
		WebElement regionElement= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='"+region+"']")));
				regionElement.click();
		return this;
	}

	public PIM_AddEmployeePage setEmpFte(String fte) {// 0.75
		driver.findElement(By.xpath("//label[text()='FTE']//preceding-sibling::div//input")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,15);
		WebElement fteElement= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='" + fte + "']")));
		fteElement.click();
		return this;
	}

	public PIM_AddEmployeePage setEmpDepartment(String department) {// Sub unit-1
		driver.findElement(By.xpath("//label[text()='Temporary Department']//preceding-sibling::div/input")).click();
		driver.findElement(
				By.xpath("//span[text()='" + department + "']")).click();
		return this;
	}

	public PIM_AddEmployeePage clickOnSave() {
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		return this;
	}

	public boolean isSuccessfullySaveMsgDisplayed() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='toast-message']")));
		return true;
		}catch(NoSuchElementException ne){
			return false;
			
		}
	}
}
