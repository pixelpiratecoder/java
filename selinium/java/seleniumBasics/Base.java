package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	public void IntializeBrowser() {
		driver=new ChromeDriver();
		driver.get("https://www.java.com/en/");
	}
	public void BrowserCommands() {
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String src=driver.getPageSource();
		System.out.println(src);
		
	}
	public static void main(String[] args)
	{
		Base b=new Base();
		b.IntializeBrowser();
		b.BrowserCommands();
	}
	}

