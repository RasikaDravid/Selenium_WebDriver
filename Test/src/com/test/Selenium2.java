package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;

public class Selenium2 {
	public static void main(String[] args) {
	
	String exePath = "C://Users//Rasika//Desktop//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", exePath);
	WebDriver driver = new ChromeDriver();
	String baseUrl = "http://www.facebook.com";
	driver.get(baseUrl);
	Select month = new Select(driver.findElement(By.id("month")));
	month.selectByVisibleText("Nov");
	
	//Selecting Items in a Multiple SELECT elements
	driver.get("http://jsbin.com/osebed/2");
	Select fruits = new Select(driver.findElement(By.id("fruits")));
	fruits.selectByVisibleText("Banana");
	fruits.selectByIndex(2);
	
	driver.quit();

	}
}
