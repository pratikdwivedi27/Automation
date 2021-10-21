package com.ag.practise;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Demo_Frames {
	public static WebDriver driver;

	public static void main(String[] args) {
		
		try {
			System.setProperty("webdriver.chrome.driver",
					"lib/chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.get("https://jqueryui.com/droppable/");
			driver.manage().window().maximize();
			System.out.println("Title : " + driver.getTitle());
			String vText=driver.findElement(By.className("entry-title")).getText();
			System.out.println("Main Page Text" +vText);
			driver.findElement(By.xpath("//a[normalize-space()='Droppable']")).click();
			Thread.sleep(3000);
			
			//Get list of Frames.
			
			int vFrame=driver.findElements(By.tagName("iframe")).size();
			System.out.println(vFrame);
			
			driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
			
			
			 vText=driver.findElement(By.id("draggable")).getText();
			System.out.println(vText);
			
			WebElement draggable=driver.findElement(By.id("draggable"));
			WebElement droppable=driver.findElement(By.id("droppable"));
			
			Actions act=new Actions(driver);
			act.dragAndDrop(draggable, droppable).build().perform();
			Thread.sleep(3000);
			
			driver.switchTo().defaultContent();
			
			
			vText=driver.findElement(By.className("entry-title")).getText();
			System.out.println("Main Page Text : "+vText);
			
		
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
