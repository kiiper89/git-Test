package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BrowserFactory {

	static WebDriver driver;
	
	public static WebDriver startBrowser(String browser, String url) {
		
		if (browser.equals("Firefox")) {
			driver = new FirefoxDriver();
		}
		else if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "d:\\EPAM\\BrowserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browser.equals("IE")) {
			System.setProperty("webdriver.chrome.driver", "d:\\EPAM\\BrowserDrivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else {
			System.out.println("No match, try with Firefox, Chrome or IE keywords");
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
		
	}
	
	public static void quitBrowser(WebDriver driver){
		driver.quit();
	}
}
