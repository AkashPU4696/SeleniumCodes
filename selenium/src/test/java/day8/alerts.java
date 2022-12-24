package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class alerts {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\akash\\eclipse-workspace\\selenium\\src\\test\\resources\\chromedriver.exe");
		WebDriver i = new ChromeDriver();
		i.get("https://html-shark.com/JavaScripts/PopupBox.htm");
		i.manage().window().maximize();
		
		Actions c = new Actions(i);
		WebElement T = i.findElement(By.xpath("//button[@onclick='promptFunction()']"));//button[@onclick='promptFunction()']
		 T.click();
		 System.out.println(i.switchTo().alert().getText());
		 i.switchTo().alert().sendKeys("Hi, This is Akash");
		 i.switchTo().alert().accept();
		 
		 WebElement M = i.findElement(By.xpath("//div[@id = \"TextString\" ]"));
		System.out.println(M.getText());
		
		i.manage().window().minimize();		 

	}

}
