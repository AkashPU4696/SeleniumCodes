package seleniumDay1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseChrome {

	public static void main(String[] args) {
		
		//How to set up the property - chrome driver 

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akash\\eclipse-workspace\\selenium\\src\\test\\resources\\chromedriver.exe");
		
		//Webdriver is the interface which we will pass to different drivers
		
		WebDriver drv = new ChromeDriver();
		
		drv.get("https://www.instagram.com/?hl=en");
		
		drv.manage().window().maximize();
		String s = drv.getTitle();
	    System.out.println(s);
	    
	    String s1 = drv.getCurrentUrl();
	    System.out.println(s1);
	    //Close - particular tab, Quit - Close entire chrome
	    
	    drv.get("https://www.youtube.com/");
	    String s2 = drv.getCurrentUrl();
	    System.out.println(s2);
	    String s3 = drv.getTitle();
	    System.out.println(s3);
	    drv.navigate().back();
		
	}

}
