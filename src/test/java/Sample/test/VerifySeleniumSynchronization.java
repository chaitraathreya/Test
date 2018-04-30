package Sample.test;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class VerifySeleniumSynchronization {

	@Test
    public void verifyLoginPageTest() {
        // declaration and instantiation of objects/variables
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://newtours.demoaut.com";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";
        
        PageFactory.initElements(driver, verifyAbstract.class);
 
        // launch Firefox and direct it to the Base URL
        driver.get(baseUrl);
 
        // get the actual value of the title
        actualTitle = driver.getTitle();
        
        WebElement ele = driver.findElement(By.name("userName"));
        
        //FluentWait
        Wait<WebDriver> wait = new FluentWait<>(driver).
        		withTimeout(10, TimeUnit.SECONDS).
        		pollingEvery(500, TimeUnit.MILLISECONDS).ignoring(StaleElementReferenceException.class, NoSuchElementException.class);
        //using EcpectedConditions
        wait.until(ExpectedConditions.elementToBeClickable(ele));
        
        //using Expected Condition overriding apply
        ExpectedCondition<WebElement> condition = new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver driver) {
				// TODO Auto-generated method stub
				return driver.findElement(By.name("userName"));
			}
		};
		wait.until(condition);
	}      
}
