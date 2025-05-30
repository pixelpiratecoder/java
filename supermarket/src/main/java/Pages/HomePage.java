package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//p[text()='Manage Category']")WebElement category;

		
		public void clickOnCategory() {
			category.click();	
		}


	public boolean ishomepage() {
		boolean homepageisdisplayed=true;
		return homepageisdisplayed;
	}

}
