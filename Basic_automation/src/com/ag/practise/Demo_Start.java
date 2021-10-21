package com.ag.practise;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo_Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Scanner sc =new Scanner(System.in);
		System.out.println("Enter browser name Chrome/Edge: ");
		String browserName = sc.nextLine();
		if (browserName.equalsIgnoreCase("Chrome"))
		{
			testChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("Edge")){
			testEdgeDriver();
		}
			
			
		} catch (Exception e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void testChromeDriver() {
		
		System.setProperty("webdriver.chrome.driver",
				"lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String vTitle=driver.getTitle();
		System.out.println("Title : "+vTitle);
		System.out.println("Test URL : "+driver.getCurrentUrl());
		if (vTitle.equalsIgnoreCase("Google")) {
			System.out.println("Pass");
			
		}
		else{
			System.out.println("Failed");
		}
		driver.close();
		driver.quit();
	}
	
	private static void testEdgeDriver() {
				System.setProperty("webdriver.edge.driver",
				"lib/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String vTitle=driver.getTitle();
		System.out.println("Title : "+vTitle);
		System.out.println("Test URL : "+driver.getCurrentUrl());
		driver.close();
		driver.quit();
	}

}
