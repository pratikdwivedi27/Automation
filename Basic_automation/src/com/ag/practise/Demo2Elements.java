package com.ag.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2Elements {

	public static void main(String[] args) throws InterruptedException 
	{
		//If it is firefox - webdriver.gecko.driver
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		WebDriver myD= new ChromeDriver();

		//1. OPEN LinkedIN APP
		myD.get("https://www.linkedin.com/");
		System.out.println("Title "+myD.getTitle());
		
		//2. CLICK ON SIGN IN
		myD.findElement(By.className("nav__button-secondary")).click();
		
		//3. ENTER Username
		myD.findElement(By.id("username")).sendKeys("samsaravananr");
		
		
		//4. ENTER Password
		myD.findElement(By.name("session_password")).sendKeys("1234566");
		
		
		//5. CLICK Signin
		//myD.findElement(By.className("btn__primary--large from__button--floating")).click();
		myD.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
		
		//Capture Error Message and Print
		String vError=myD.findElement(By.id("error-for-username")).getText();
		System.out.println("Error Message is :"+vError);
		
		
		//WAIT for 5 Seconds
		Thread.sleep(5000);
		
		
		//6. CLOSE APP
		myD.close();

	}

}
