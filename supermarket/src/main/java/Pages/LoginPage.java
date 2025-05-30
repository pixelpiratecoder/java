package Pages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class LoginPage {
		WebDriver driver;
		public LoginPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
		@FindBy(xpath="//input[@name='username']") WebElement userNameField;
		@FindBy(xpath="//input[@name='password']")WebElement passwordField;
		@FindBy(xpath="//button[text()='Sign In']") WebElement signInButton;
		@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")WebElement alertMessage;
		public void EnterUserName(String username) {
			userNameField.sendKeys(username);	
		}
		public void EnterPassword(String password) {
			passwordField.sendKeys(password);
		}
		public void clickonSignInButton()
		{
			signInButton.click();
		}
		public boolean isAlertDisplayed() {
			 return alertMessage.isDisplayed();
			
		}
		

	}

