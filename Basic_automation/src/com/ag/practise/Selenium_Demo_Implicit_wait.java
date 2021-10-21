package com.ag.practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// implicitlyWait --> For all elements.
// WebDriverWait --> This for specific elements.

public class Selenium_Demo_Implicit_wait {
	public static WebDriver driver;
	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver",
					"lib/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.MICROSECONDS);
			driver.get("http://www.google.com/");
			System.out.println("Title : " + driver.getTitle());
			
			
			 
			 WebDriverWait wait =new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
			driver.findElement(By.name("q")).sendKeys("selenium");
					
					

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			driver.close(); // this Just closes the tab.
			driver.quit(); // This will close browser.
			System.out.println("Browser closed");
			System.out.println("Complete");
		}
}}