package Sample2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.internal.PropertiesFile;


public class uploadFile {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chaitra\\workspace\\Drivers\\chromedriver.exe");
		String baseUrl = "http://demo.guru99.com/selenium/upload/";
		WebDriver driver = new ChromeDriver();

		//Approach 1
		driver.get(baseUrl);
		/*WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

		// enter the file path onto the file-selection input field
		uploadElement.sendKeys("C:\\TESTDATA\\newFile.txt");

		// check the "I accept the terms of service" check box
		driver.findElement(By.id("terms")).click();

		// click the "UploadFile" button
		driver.findElement(By.name("send")).click();*/

		//Appraoch 2


		Robot robot;
		try {
			robot = new Robot();

			//example to read data from properties file ..
    		String srcDir = System.getProperty("user.dir") +File.separator+"src\\test\\java\\testData\\config.properties";
    		System.out.println(srcDir);
    		File file = new File(srcDir);
    		FileInputStream fp = new FileInputStream(file);
    		
    		Properties prop = new Properties();
    		prop.load(fp);
    		
    		baseUrl	= prop.getProperty("BaseUrl")	;
    		
 //http://demo.automationtesting.in/Register.html
			driver.get(baseUrl);
			driver.findElement(By.id("imagesrc")).click();

			robot.setAutoDelay(2000);

			StringSelection selection = new StringSelection("C:\\TESTDATA\\newFile.txt");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);

			robot.setAutoDelay(1000);

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);

			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);

			robot.setAutoDelay(1000);

			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
