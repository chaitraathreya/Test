package Sample2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyPasswordLabel {
	
	public static void main(String[] args){
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/selenium/newtours/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
	}

}
