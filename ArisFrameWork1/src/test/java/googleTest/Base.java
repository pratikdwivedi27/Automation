package googleTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;



public class Base {
	Properties prop;
	 WebDriver driver;
	FileInputStream fis;
	String vBrowser;
	String vURL;
	@Test
	public WebDriver BrowserCall() throws IOException {
		
		
			prop = new Properties();
			fis=new FileInputStream("D:\\PD_Workspace\\ArisFrameWork1\\data.properties");
			prop.load(fis);
			vBrowser=prop.getProperty("Browser");
			if(vBrowser.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
				driver=new ChromeDriver(); 
				System.out.println("Chrome opened");
				vURL=prop.getProperty("URL");
				driver.get(vURL);
			}
			else if  (vBrowser.equalsIgnoreCase("Edge"))
			{
			System.setProperty("webdriver.edge.driver", "lib/msedgedriver.exe");
			driver = new EdgeDriver();
			}
			return driver;
		

	}
}
