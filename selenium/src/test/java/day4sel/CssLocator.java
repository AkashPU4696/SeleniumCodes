package day4sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akash\\eclipse-workspace\\selenium\\src\\test\\resources\\chromedriver.exe");
		
		WebDriver drive = new ChromeDriver();
		
		drive.get("https://www.saucedemo.com/");
		
		drive.manage().window().maximize();
		
		WebElement user = drive.findElement(By.cssSelector("input[id='user-name']"));
		user.sendKeys("problem_user");
		
		WebElement pass = drive.findElement(By.cssSelector("input[name='password']"));
		pass.sendKeys("secret_sauce");
		
		WebElement Login = drive.findElement(By.cssSelector("input[name='login-button']"));
		Login.click();
		
		drive.manage().window().minimize();
	}

}
