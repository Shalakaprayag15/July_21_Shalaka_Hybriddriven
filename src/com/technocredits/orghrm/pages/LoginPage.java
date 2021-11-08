package com.technocredits.orghrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.technocredits.orghrm.base.PredefinedActions;

public class LoginPage extends PredefinedActions {
	MenuPage menuPage=new MenuPage();
	public boolean isLogoDisplayed() {
		return driver.findElement(By.xpath("//div[@id='divLogo']/img")).isDisplayed();
	}
	
	public boolean isPanelHeadingDisplayed() {
		return driver.findElement(By.xpath("//div[@id='divLogo']/img")).isDisplayed();
}
	public void enterCredentials(String userName, String password) {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
	}
	public MenuPage clickOnLoginButton() {
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		return menuPage;
		
	}
	
}
