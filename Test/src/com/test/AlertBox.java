package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {
	
	public static void main(String[] args) throws NoAlertPresentException, InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C://Users//Rasika//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("12345");
		driver.findElement(By.name("submit")).submit();
		
		//Switching to ALert
		Alert alert = driver.switchTo().alert();
		
		//Capturing Alert Message
		String alertMessage=driver.switchTo().alert().getText();
		
		//Displaying alert Message
		System.out.println(alertMessage);
		Thread.sleep(5000);
		
		alert.accept();
		
		driver.close();
		
	}

}
