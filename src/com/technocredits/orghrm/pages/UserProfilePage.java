package com.technocredits.orghrm.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.technocredits.orghrm.base.PredefinedActions;

public class UserProfilePage extends PredefinedActions {
	
	public void clickOnUserDropdown() {
		driver.findElement(By.xpath("//a[@id='user-dropdown']")).click();
	}
	public List<String> getListOfUserDropdown(){
		/*List<WebElement> listOfElement =driver.findElements(By.xpath("//ul[@id='user_menu']/li/a"));
	List<String> userDropdownList= new ArrayList<String>();
	for(WebElement e:listOfElement) {
		userDropdownList.add(e.getText());*/
	
	 return getAllElementsList("//ul[@id='user_menu']/li/a");
	}
	public int getTotalUserDropdown() {
		return getListOfUserDropdown().size();
	}
	public void clickOnAbout() {
		driver.findElement(By.xpath("//ul[@id='user_menu']/li/a[text()='About']")).click();
	}
	
	public List<String> getAllTestOfAboutMenu(){
	/*	List<WebElement> elementList =driver.findElements(By.xpath("//div[@id='companyInfo']/div/div/p"));
		List<String> AboutMenuList= new ArrayList<String>();
		for(WebElement e:elementList) {
			AboutMenuList.add(e.getText());
		}*/
		return getAllElementsList("//div[@id='companyInfo']/div/div/p");
	}
}
