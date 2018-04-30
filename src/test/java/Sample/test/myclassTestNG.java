
package Sample.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
 
public class myclassTestNG implements TestInterface {
 
	@Test
    public void verifyLoginPageTest() {
        // declaration and instantiation of objects/variables
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\chaitra\\workspace\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://newtours.demoaut.com";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";
 
        // launch Firefox and direct it to the Base URL
        driver.get(baseUrl);
 
        // get the actual value of the title
        actualTitle = driver.getTitle();
 
        /*
         * compare the actual title of the page witht the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
        	Assert.assertTrue(true);
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
            Assert.assertTrue(false);
        }
        
        //close Firefox
       // driver.close();
        
        // exit the program explicitly
        //System.exit(0);
    }
	
	//@Test
	public void verifyWebResources(){
		WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://www.seleniumframework.com/Practiceform/";
    
        // launch Firefox and direct it to the Base URL
        driver.get(baseUrl);
        
        Map<String, Integer> items = new HashMap<String, Integer>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);
        // ForEach and Map.Entry
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
        	System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
        }
        
        // Iterator and Map.entry
        Iterator<Map.Entry<String, Integer>> ierator = items.entrySet().iterator();
        while (ierator.hasNext()) {
            Map.Entry<String, Integer> pair = ierator.next();
            System.out.println(pair.getKey() + pair.getValue());
        }
        
        // using keyset and iterator
        Set<String> keys = items.keySet();
    	Iterator<String> itr = keys.iterator();
    	while(itr.hasNext()){
    		String key = itr.next();
    	}
    	List<String> a = new ArrayList<String>();
    	List<String> b = new ArrayList<String>();
    	
    	a.add("Chaitra");
    	a.add("Akshath");
    	
    	b.add("Akshath");
    	b.add("Chaitra");
    	
    	Collections.sort(a);
    	Collections.sort(b);
    	
    	if(a.equals(b)){
    		System.out.println("list are same");
    	}
    	
    	System.out.println(a.toString());
    	System.out.println(b.toString());
	}

	public void add(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println(var);
	}
 
	
	
	
	
}