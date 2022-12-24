package day9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtbl {

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\akash\\eclipse-workspace\\selenium\\src\\test\\resources\\chromedriver.exe");
		WebDriver e = new ChromeDriver();
		e.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		

	}

}
