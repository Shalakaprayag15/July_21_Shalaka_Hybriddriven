package com.technocredits.orghrm.base;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PredefinedActions {
	
	protected static WebDriver driver;
	public static void start(String url) {
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		System.out.println("STEP - Open Chrome Browser");
	    driver = new ChromeDriver();
	  //  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println("STEP - Enter url");
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	public static void start() {
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		System.out.println("STEP - Open Chrome Browser");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println("STEP - Enter url");
		driver.get("https://shalakaprayag-trials72.orangehrmlive.com");
		driver.manage().window().maximize();	
	}
	protected List<String> getAllElementsList(String locator){
		List<WebElement> elementList =driver.findElements(By.xpath(locator));
		List<String> MenuList= new ArrayList<String>();
		for(WebElement e:elementList) {
			MenuList.add(e.getText());
		}
		return MenuList;
	}
	
	public static void closeBrowser() {
		driver.close();
	}
	
	public static void quiteBrowser() {
		driver.quit();
	}
}
