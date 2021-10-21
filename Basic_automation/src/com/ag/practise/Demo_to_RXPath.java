package com.ag.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_to_RXPath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
				WebDriver driver=new ChromeDriver(); 
				//1. Open linkedin
				driver.get("https://www.linkedin.com/");
				driver.manage().window().maximize();
				System.out.println("Title : " +driver.getTitle());
				
				//2. CLick on Sign in
				driver.findElement(By.className("nav__button-secondary")).click();
				//3. Enter User Name 
				driver.findElement(By.id("username")).sendKeys("pratik@gmail.com");
				
				//4. Enter password.
				driver.findElement(By.name("session_password")).sendKeys("123456");
				
				//Relative XPaths
				//5. Click on sign in
			//a	driver.findElement(By.xpath("//button[@aria-label='Sign in']")).click();
			//b	driver.findElement(By.xpath("//*[@aria-label='Sign in']")).click();
			//c	driver.findElement(By.xpath("//button[@class='btn__primary--large from__button--floating']")).click();
			//d	driver.findElement(By.xpath("//button[@type='submit' and @aria-label='Sign in']")).click();
			//e
				driver.findElement(By.xpath("//button[text()='Sign in']")).click();
				
				
				System.out.println("Title : " +driver.getTitle());
				System.out.println("Error message : "+driver.findElement(By.id("error-for-password")).getText());
				
				Thread.sleep(3000);
				// Close browser		
				driver.close();
				driver.quit();
	}

}
