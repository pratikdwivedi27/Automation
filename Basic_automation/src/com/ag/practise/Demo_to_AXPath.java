package com.ag.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_to_AXPath {
	public static WebDriver driver;
	public static void main(String[] args)  {
		try {
			System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
			driver=new ChromeDriver(); 
			//1. Open Amazon
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			System.out.println("Title : " +driver.getTitle());
			// Absolute path
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[5]/div[2]/div[1]/div[1]/a[2]")).click();
			
			
			 Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
finally{
	driver.close();
	driver.quit();
	System.out.println("browser closed");
	System.out.println("complete");
}
	}

}
