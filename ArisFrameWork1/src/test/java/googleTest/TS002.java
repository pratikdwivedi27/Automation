package googleTest;

import googlePageObject.GoogleHomePage;
import googlePageObject.GoogleResultPage;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TS002 extends Base {

	@Test
    public void STEP01() throws IOException, InterruptedException
    {
        driver=BrowserCall();
        driver.get(prop.getProperty("URL"));
        driver.manage().window().maximize();
        Thread.sleep(4000);
        // Enter the search key.
        GoogleHomePage gh=new GoogleHomePage(driver);
        gh.FSearchBox().sendKeys("Aris Global");
        Thread.sleep(2000);
        gh.FSearchButton().click();
        
        //Capture the results
        GoogleResultPage GRP=new GoogleResultPage(driver);
		String vRes=GRP.FResultStat().getText();
		System.out.println(vRes);
        
        
        
        
    }
	
	@AfterMethod
	public void tearDownMethod	(){
		driver.close();
	}
	
/*	@AfterTest
	public void tearDown(){
		driver.close();
	}*/
	
}
