package day7;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\akash\\eclipse-workspace\\selenium\\src\\test\\resources\\chromedriver.exe");
		WebDriver e = new ChromeDriver();
		e.get("https://www.amazon.in/");
		
		TakesScreenshot T = (TakesScreenshot) e;
		File src = T.getScreenshotAs(OutputType.FILE);
		File trg = new File("C:\\Users\\akash\\OneDrive\\Pictures\\Saved Pictures\\src.png");
		FileHandler.copy(src, trg);
	}

}
