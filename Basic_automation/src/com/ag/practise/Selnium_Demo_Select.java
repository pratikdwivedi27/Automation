package com.ag.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
// Select is a class , used if Select us used as tag in HTML in when drop down values are there with multiple options.
public class Selnium_Demo_Select {
	public static WebDriver driver;
	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
			driver=new ChromeDriver(); 
	/*		//1. Open Amazon
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			System.out.println("Title : " +driver.getTitle());
			
			Select productSelect=new Select(driver.findElement(By.id("searchDropdownBox")));
			productSelect.selectByValue("search-alias=fashion");
			productSelect.selectByIndex(2);
			productSelect.selectByVisibleText("Software");
			 Thread.sleep(3000);*/
			
			 driver.get("https://www.cleartrip.com/");
				driver.manage().window().maximize();
				Thread.sleep(5000);
				System.out.println("Title : " +driver.getTitle());
				Thread.sleep(5000);
			//	Select productSelect=new Select(driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[4]/div/div[1]/select")));
				 Select productSelect=new Select(driver.findElement(By.xpath("//*[@id='root']/div/div/div[1]/div/div[2]/div/div[4]/div/div[1]/select")));
				productSelect.selectByValue("2");
				Thread.sleep(2000);
				productSelect.selectByIndex(3);
				Thread.sleep(2000);
				productSelect.selectByVisibleText("7");
				 Thread.sleep(3000);
			 
		} catch (InterruptedException e) {
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
