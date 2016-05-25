package com.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitABit {
	
	static WebDriver driver;
	
	public static void waitABit(WebDriver driver, WebElement elementName, int waitSec) {
		WebDriverWait wait = new WebDriverWait(driver, waitSec);
		wait.until(ExpectedConditions.elementToBeClickable(elementName));

	}
}
