package day5selxpath;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class xpathtypes {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akash\\eclipse-workspace\\selenium\\src\\test\\resources\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.get("https://www.saucedemo.com/");
		w.manage().window().maximize();
		
		WebElement user = w.findElement(By.xpath("//input[contains(@id, 'user')]"));
		user.sendKeys("standard_user");
		
		WebElement pass = w.findElement(By.xpath("//input[starts-with(@data-test, 'pass')]"));
		pass.sendKeys("secret_sauce");
		
		WebElement Log = w.findElement(By.xpath("//input[@class='submit-button btn_action']"));
		Log.click();
		
		WebElement drop = w.findElement(By.xpath("//select[contains(@data-test, 'product')]"));
		
		Select down = new Select(drop);
		//down.selectByIndex(2);
		
		//Collection conecpt 
		List<WebElement> dd =  down.getOptions();
		for (WebElement e : dd)
		{
			System.out.println(e.getText());
		}


		
		
		// starts with x path is used for dynamic xpath - eg - clicked on start to login tht button chnags to stop to logged of
		//WebElement text = w.findElement(By.xpath("//a[text()='LinkedIn']"));
		//text.click();
	}

}
