package testscript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utlities.Screenshootutilities;


public class Base {
	public WebDriver driver;
	@BeforeMethod
	public void intializeBrower(){
		
		driver=new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		
	}
	
	@AfterMethod(alwaysRun=true) 
 	public void driverQuit(ITestResult itestresult) throws IOException 
 	{ 
 		if(itestresult.getStatus()==ITestResult.FAILURE) 
 		{ 
 			Screenshootutilities screenshot=new Screenshootutilities(); 
 			screenshot.getScreenshot(driver,itestresult.getName()); 
 		} 
 	//	driver.quit(); 
 			 
 	}
}

