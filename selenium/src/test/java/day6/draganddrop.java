package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\akash\\eclipse-workspace\\selenium\\src\\test\\resources\\chromedriver.exe");
		WebDriver v = new ChromeDriver();
		v.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		//Action class madndotory methods build and perform
		Actions c = new Actions(v);
		WebElement src = v.findElement(By.xpath("//div[@id='box1']"));
		WebElement des = v.findElement(By.xpath("//div[@id='box104']"));
		c.dragAndDrop(src, des).build().perform();
		
		WebElement src1 = v.findElement(By.xpath("//div[@id='box1']"));
		WebElement des1 = v.findElement(By.xpath("//div[@id='capitals']"));
		c.dragAndDrop(src1, des1).build().perform();

	}

}
