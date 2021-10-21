package com.ag.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_to_RXPath2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		//1. Open Google.com
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println("Title : " +driver.getTitle());
		
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		int vButtonSize =driver.findElements(By.xpath("//input[@type='submit']")).size();
		System.out.println(vButtonSize);
		// Verify in Chrome console in Google.com : $x("(//input[@name='btnK'])[1]")
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='btnK'][1]")).click();;
		 Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
