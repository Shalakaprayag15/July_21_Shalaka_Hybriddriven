package com.technocredits.orghrm.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.technocredits.orghrm.base.PredefinedActions;

public class DashboardPage extends PredefinedActions{
	 
/*	public String getTitleHeaderName() {
		return driver.getTitle();
	}*/
	public String getTitlePageName() {
		return driver.findElement(By.xpath("//li[@class='page-title']")).getText();
	}
	public String getTitleHeaderName() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}
	public int getWidgetSize() {
	return driver.findElements(By.xpath("//div[@id='widget.id']")).size();
	}
	public List<String> getWidgetName() {
		/*List<WebElement> widgetNames=driver.findElements(By.xpath("//div[@class='widget-header']/span[2]"));
		List<String> WidgetList= new ArrayList<String>();
		for(WebElement widgetName:widgetNames ) {
			WidgetList.add(widgetName.getText());
		}*/
		return getAllElementsList("//div[@class='widget-header']/span[2]");
	}
}
