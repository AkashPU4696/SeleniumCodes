package day4sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathloc {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akash\\eclipse-workspace\\selenium\\src\\test\\resources\\chromedriver.exe");

		WebDriver drive1 = new ChromeDriver();
		drive1.get("https://www.saucedemo.com/");
		drive1.manage().window().maximize();
		String U = "standard_user";
		String P = "secret_sauce";
		WebElement user = drive1.findElement(By.xpath("//input[@id='user-name']"));
		user.sendKeys(U);
		WebElement pass = drive1.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys(P);
		if(user.equals(U) && pass.equals(P) )
		{
		WebElement Login = drive1.findElement(By.xpath("//input[@id='login-button']"));
		Login.click();
		System.out.println("Logged in Successfully");
		}
		else
		{
			System.out.println("Invalid Login credentials");
		}
	} 

}
