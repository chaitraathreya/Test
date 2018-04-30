package Sample2;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DownloadChromeFile {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chaitra\\workspace\\Drivers\\chromedriver.exe");
		String downloadFilepath = "c:\\download";

		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadFilepath);
		ChromeOptions options = new ChromeOptions();
		
		options.setExperimentalOption("prefs", chromePrefs);
		options.addArguments("--test-type");
		options.addArguments("--disable-extensions"); //to disable browser extension popup

		DesiredCapabilities cap = DesiredCapabilities.chrome();
		//cap.setCapability(ChromeOptions.CAPABILITY, chromeOptionsMap);
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = new ChromeDriver(cap);  
		driver.get("http://www.seleniumhq.org/download/");
		driver.findElement(By.linkText("32 bit Windows IE")).click();

		int count[] = {34, 22,10,60,30,22};
		Set<Integer> integersSet = new HashSet<Integer>();
		for(int i = 0; i < 5; i++) {
			integersSet.add(count[i]);
		}
		System.out.println(integersSet);
		
		TreeSet<Integer> sortedSet = new TreeSet<Integer>(integersSet);
        System.out.println("The sorted list is:");
        System.out.println(sortedSet);
        
        System.out.println("The First element of the set is: "+ (Integer)sortedSet.first());
        System.out.println("The last element of the set is: "+ (Integer)sortedSet.last());

        Set<String> strinset = new TreeSet<String>();
        strinset.add("Zimbabwe");
        strinset.add("Chaitra");
        strinset.add("Zebra");
        strinset.add("Denmark");
        strinset.add("Prayag");
        System.out.println("The sorted list is:");
        System.out.println(strinset);
        

	}
}
