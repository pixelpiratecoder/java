package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;

public class logintest extends Base {
	@Test
	public void verifyUserloginwithValidCredential() 
	{
		LoginPage log=new LoginPage(driver);
		log.EnterUserName("admin");
		log.EnterPassword("admin");
		log.clickonSignInButton();
		//home page
		HomePage home=new HomePage(driver);
		boolean expectedresult=true;
		boolean actualResult=home.ishomepage();
		Assert.assertEquals(expectedresult,actualResult ,"login faild");
				
	}
	@Test
	public void verifyUserloginwithinvalidpassword() 
	{
		LoginPage log=new LoginPage(driver);
		log.EnterUserName("admin");
		log.EnterPassword("adm123");
		//log.clickonSignInButton();
		//home page
		boolean isAlertpressent=log.isAlertDisplayed();
		Assert.assertTrue(isAlertpressent ,"alert is not displayed");
				
	} 
	@Test
	public void verifyUserloginwithinValidusername() 
	{
		LoginPage log=new LoginPage(driver);
		log.EnterUserName("123");
		log.EnterPassword("admin");
		log.clickonSignInButton();
		//home page
		boolean isAlertpressent=log.isAlertDisplayed();
		Assert.assertTrue(isAlertpressent ,"alert is not displayed");
	}
	@Test
	public void verifyUserloginwithinValidCredential() 
	{
		LoginPage log=new LoginPage(driver);
		log.EnterUserName("admin12");
		log.EnterPassword("admin25");
		log.clickonSignInButton();
		//home page
		boolean isAlertpressent=log.isAlertDisplayed();
		Assert.assertTrue(isAlertpressent ,"alert is not displayed");
				
	}
	

}
