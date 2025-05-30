package Pages;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Category {
	WebDriver driver;
	public Category(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newbutton;
	@FindBy(xpath="//input[@id='category']")WebElement entertext;
	@FindBy(xpath="//li[@id='134-selectable']")WebElement discount;
	@FindBy(xpath="//input[@id='main_img']")WebElement image;
	@FindBy(xpath="//button[@class='btn btn-danger']")WebElement savebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alertmessage;
	
	
	public void addNewCategory() {
		newbutton.click();
		entertext.sendKeys("Vegetables"+generateCurrentDateAndTime());
		discount.click();
		image.sendKeys("C:\\Users\\Hp\\eclipse-workspace\\supermarket\\src\\main\\resources\\download.jpg");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", savebutton);
		
	}
	public boolean isAlertDisplayed() {
		return alertmessage.isDisplayed();
	}
	public String generateCurrentDateAndTime() {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyhhmmss");
		return formatter.format(date);
	}

}
