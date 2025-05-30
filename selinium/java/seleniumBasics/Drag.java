package seleniumBasics;
	import java.awt.Desktop.Action;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Drag {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/drag-drop.php");
		Actions act=new Actions(driver);
		WebElement source=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement source1=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
		WebElement source2=driver.findElement(By.xpath("//span[text()='Draggable n°3']"));
		WebElement source3=driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
		WebElement target=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		act.dragAndDrop(source, target).perform();
		act.dragAndDrop(source1, target).perform();
		act.dragAndDrop(source2, target).perform();
		act.dragAndDrop(source3, target).perform();
		
	}

}
