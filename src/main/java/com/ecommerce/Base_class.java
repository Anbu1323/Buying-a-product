package com.ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_class {
	static WebDriver test;
	static Actions ac;
	static Select s;
	public static WebDriver launchbrowser(String browsername) {
		
		if(browsername.equalsIgnoreCase("chrome")) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\White_Devil\\eclipse-workspace\\Buying_product\\Webdriver\\chromedriver.exe");
	 test = new ChromeDriver();
	 test.manage().window().maximize();
	 
		}else if(browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\White_Devil\\eclipse-workspace\\Buying_product\\Webdriver\\chromedriver.exe");
			 test = new FirefoxDriver();
			 test.manage().window().maximize();
		}
		return test;	
	}
	
	public static void getURL(String URL) {
		test.get(URL);
			
	}
	
	public static void Username(WebElement element , String username) {
		 ac = new Actions(test); 
		 ac.sendKeys(element, username).build().perform();
		
	}
	public static void Password(WebElement element, String password) {
		ac = new Actions(test);
		ac.sendKeys(element, password).build().perform();
		
	}
	
	public static void ClickLogin(WebElement element , String login) {
		if(login.equalsIgnoreCase("click")) {
			ac.click(element).build().perform();
		}
		
	}
	
	public static void ClickMenu(WebElement element , String menu) {
		if(menu.equalsIgnoreCase("click")) {
			ac = new Actions(test);
			ac.click(element).build().perform();
		}
	}
	public static void CloseMenu(WebElement element, String closemenu) {
		if(closemenu.equalsIgnoreCase("close")) {
			ac = new Actions(test);
			ac.click(element).build().perform();
			}
			
}
	public static void AddFilters(WebElement element, String showfilters) {
		s = new Select(element);
		s.selectByVisibleText(showfilters);
		
		}
	
	public static void SelectAnyProduct(WebElement elements, String allproducts) {
		test.findElements(By.xpath(allproducts));
		ac = new Actions(test);
		ac.click(elements).build().perform();
	}
	
	
	
	
	
	

}
