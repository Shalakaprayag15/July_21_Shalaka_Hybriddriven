package com.technocredits.orghrm.pages;

import org.openqa.selenium.By;

import com.technocredits.orghrm.base.PredefinedActions;

public class MenuPage extends PredefinedActions {
	
	public void nevigateTo(String menu) {
		String[] arr= menu.split("->");
		for(String component:arr)
			driver.findElement(By.xpath("//span[text()='"+component+"']")).click();
	}

}
