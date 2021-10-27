package com.ag.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_to_Elements {
//
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		//1. Open linkedin
		driver.get("https://www.linkedin.com/");
		System.out.println("Title : " +driver.getTitle());
		
		//2. CLick on Sign in
		driver.findElement(By.className("nav__button-secondary")).click();
		//3. Enter User Name 
		driver.findElement(By.id("username")).sendKeys("pratik@gmail.com");
		
		//4. Enter password.
		driver.findElement(By.name("session_password")).sendKeys("123456");
		
		//5. Click on sign in
		driver.findElement(By.xpath("/html/body/div/main/div[2]/div[1]/form/div[3]/button")).click();
		//Capture error message and print
		System.out.println(driver.findElement(By.id("error-for-password")).getText());
		
		Thread.sleep(5000);
		//Get partial text
		driver.findElement(By.partialLinkText("Forgot")).click();
		System.out.println("Title : " +driver.getTitle());
		//Login with link text
		
		driver.findElement(By.linkText("Join now")).click();
		System.out.println("Title : " +driver.getTitle());
		
		//Count total number of links in Sing up page
		int vlinkSize=driver.findElements(By.tagName("a")).size();
		System.out.println("Total links : "+vlinkSize );
		
		// Close browser		
		driver.close();
		driver.quit();
	}

}