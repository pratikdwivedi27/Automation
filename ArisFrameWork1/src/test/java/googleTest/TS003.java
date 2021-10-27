package googleTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TS003 extends Base{
	
	@Test
	public  void step02() throws IOException{
		driver=BrowserCall();
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		Assert.assertEquals(prop.getProperty("ExpectedTitle"),driver.getTitle());
		System.out.println("End of tests.");
		
	}

	@AfterMethod
	public void tearDown(){
		driver.manage().deleteAllCookies();
		driver.close();
		
		
	}
}
