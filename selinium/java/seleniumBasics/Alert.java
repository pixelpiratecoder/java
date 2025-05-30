package seleniumBasics;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
public class Alert {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/javascript-alert.php");

		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		
		driver.switchTo().alert().sendKeys("hello world");
		driver.switchTo().alert().accept();
		
	}

}

