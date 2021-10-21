package com.ag.practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Demo_Alerts {

	public static WebDriver driver;
	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
			driver=new ChromeDriver(); 
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
finally{
	driver.close();
	driver.quit();
	System.out.println("Browser closed");
	System.out.println("complete");
}

	}

}
