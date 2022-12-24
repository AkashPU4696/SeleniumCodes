package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascrptexecutor {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akash\\eclipse-workspace\\selenium\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chromedriver.chromium.org/downloads");
	
		
		// Why We are using JS executor , if ur css selcector and xpath
		// Failed and getting Not interactable exception
		// Last option is JS executor 
		
		JavascriptExecutor js = ((JavascriptExecutor)driver) ;
		
		//Scroll the windows
		//js.executeS
		Thread.sleep(5000);
		
		
		WebElement linke = driver.findElement(By.xpath("//*[@id='h.p_ID_574_l']/div/span/a/strong"));
		//wait.until(ExpectedConditions.visibilityOf(linke));
		js.executeScript("arguments[0].click();", linke);

	}

}
