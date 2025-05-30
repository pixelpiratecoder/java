package seleniumBasics;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class selenium1 {
		
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("https://selenium.qabible.in/simple-form-demo.php");
			driver.findElement(By.xpath("//input[@id='single-input-field']")).sendKeys("Hai");
			driver.findElement(By.xpath("//input[@id='single-input-field']")).click();
			
			
		}
	}



