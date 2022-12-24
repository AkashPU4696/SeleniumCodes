package day3locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
	
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\akash\\eclipse-workspace\\selenium\\src\\test\\resources\\chromedriver.exe");
		
		WebDriver drvr = new ChromeDriver();
		
		drvr.get("https://www.saucedemo.com/");
		drvr.manage().window().maximize();
		WebElement username = drvr.findElement(By.id("user-name"));
		username.sendKeys("problem_user");
		WebElement password = drvr.findElement(By.name("password"));
		password.sendKeys("secret_sauce");
		
		WebElement Login = drvr.findElement(By.id("login-button"));
		Login.click();
		
		WebElement Face = drvr.findElement(By.linkText("Facebook"));
		Face.click();
		
		
	}

}
