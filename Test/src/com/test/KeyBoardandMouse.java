package com.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class KeyBoardandMouse {
	
	public static void main(String[] args) {
		
		//For keyboard events and mouse actions
		/*String baseUrl = "http://demo.guru99.com/test/newtours/";
		String baseUrl="http://www.facebook.com";
		System.setProperty("webdriver.chrome.driver","C://Users//Rasika//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get(baseUrl);
		
		WebElement link_Home = driver.findElement(By.linkText("Home"));
		WebElement td_Home = driver.findElement(By
                .xpath("//html/body/div"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr"));
  		
		Actions builder = new Actions(driver);
		Action mouseOverHome = builder
				.moveToElement(link_Home).
				build();
		String bgColor= td_Home.getCssValue("background_color");
		System.out.println("Before hover:" + bgColor);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		mouseOverHome.perform();
		bgColor = td_Home.getCssValue("background-color");
        System.out.println("After hover: " + bgColor); 
		driver.close();*/
		
		
		//With multiple series of actions	
		String baseUrl="http://www.facebook.com";
		System.setProperty("webdriver.chrome.driver","C://Users//Rasika//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get(baseUrl);
		
		WebElement txtUserName= driver.findElement(By.id("email"));
		Actions builder= new Actions(driver);
		Action seriesOfActions= builder
				.moveToElement(txtUserName)
				.click()
				.keyDown(txtUserName,Keys.SHIFT)
				.sendKeys(txtUserName,"hiii")
				.keyDown(txtUserName,Keys.SHIFT)
		        .doubleClick(txtUserName)
		        .contextClick()
		        .build();
		
		seriesOfActions.perform();
		
		//driver.close();
		
		
	}	

}
