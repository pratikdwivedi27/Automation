package com.ag.practise;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Demo_Window {
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver",
					"lib/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://www.gmail.com/");
			System.out.println("Title : " + driver.getTitle());
			// driver.findElement(By.xpath("/html/body/footer/div/div/nav/ul/li/a")).click();;
			 driver.findElement(By.linkText("Help")).click();
			 
			 Set<String> ids=driver.getWindowHandles();
			 Iterator<String> it=ids.iterator();
			 
			// System.out.println(ids);
			 String gmailWindow=it.next();
			 String helpWindow=it.next();
			 
			 driver.switchTo().window(helpWindow);
			System.out.println("Title : " + driver.getTitle());

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
