package testscript;

	

	import org.testng.Assert;
	import org.testng.annotations.Test;

	
	import Pages.Category;
	import Pages.HomePage;
	import Pages.LoginPage;

	public class Catagorytest extends Base {
	  @Test
	  public void verifyAddNewCategoryWithValidDetails() {		  
		  LoginPage log=new LoginPage(driver);
			log.EnterUserName("admin");
			log.EnterPassword("admin");
			log.clickonSignInButton();
			HomePage home=new HomePage(driver);
			//home.clickOnCategory();
			Category category=new Category(driver);
			category.addNewCategory();
			boolean isAlertDisplayed=category.isAlertDisplayed();
			Assert.assertTrue(isAlertDisplayed, "Alert is not displayed sucessfully");
			
			
	  }
	}

