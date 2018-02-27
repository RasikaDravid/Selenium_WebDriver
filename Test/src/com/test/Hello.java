package com.test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exePath = "C://Users//Rasika//Desktop//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		//driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		//System.out.println("Hello");
		
        String baseUrl = "http://www.facebook.com";
        String tagName = "";
        String actualTitle="";
        String expectedTitle="Welcome: Mercury Tours";
        
        driver.get(baseUrl);
        
        actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        
        if(actualTitle.contentEquals(expectedTitle)) {
        	System.out.println("Tests passed");
        }
        else {
        	System.out.println("Tests failed");
        }
        tagName = driver.findElement(By.id("email")).getTagName();
        System.out.println(tagName);
        
         
        
        driver.close();
        System.exit(0);

	}

}
