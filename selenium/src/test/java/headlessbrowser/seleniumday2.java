package headlessbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class seleniumday2 {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\akash\\eclipse-workspace\\selenium\\src\\test\\resources\\chromedriver.exe");
		
		//Headless browser - their will be no UI to see
		ChromeOptions o = new ChromeOptions();
		o.setHeadless(true);
		
		
		WebDriver w = new ChromeDriver(o);

		w.get("https://www.instagram.com/?hl=en");
		
		w.manage().window().maximize();
		String s = w.getCurrentUrl();
		System.out.println(s);
		String s1 = w.getTitle();
		System.out.println(s1);
		
		
	}

}
