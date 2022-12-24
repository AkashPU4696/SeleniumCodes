package day4sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\akash\\eclipse-workspace\\selenium\\src\\test\\resources\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.saucedemo.com/");
				
				driver.manage().window().maximize();
	
				WebElement username =  driver.findElement(By.id("user-name"));
				username.sendKeys("standard_user");
	
				WebElement password = driver.findElement(By.name("password"));
				password.sendKeys("secret_sauce");
				
				WebElement login =  driver.findElement(By.name("login-button"));
				login.click();
				
				String parent = "https://www.saucedemo.com/" ;
				String current = driver.getCurrentUrl();
				
				if(current.contentEquals(parent))
				{
					System.out.println("Login Successfull");
				}
				else 
				{
					System.out.println("Login Failure");
				}
				
			

	}

}
