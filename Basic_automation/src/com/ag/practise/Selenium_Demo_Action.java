package com.ag.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Action class--> Used for Mouse actions , Mouse hover.
public class Selenium_Demo_Action {
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver",
					"lib/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://www.amazon.in/");
			System.out.println("Title : " + driver.getTitle());
			Actions act = new Actions(driver);
			act.moveToElement(
					driver.findElement(By
							.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[3]/div[1]/a[2]/span[1]")))
					.build().perform();
			driver.findElement(
					By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/span[1]"))
					.click();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			driver.close(); // this Just closes the tab.
			driver.quit(); // This will close browser.
			System.out.println("Browser closed");
			System.out.println("Complete");
		}

	}

}
