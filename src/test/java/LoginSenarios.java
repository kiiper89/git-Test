//import org.testng.annotations.Test;
import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.PageFactory.BrowserFactory;

import PageObjects.LoginPage;

public class LoginSenarios {
	
	
	@Test
	public void checkValidLogin() throws InterruptedException{
		
		WebDriver driver = BrowserFactory.startBrowser("Firefox", "https://accounts.google.com/ServiceLogin?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1#identifier");
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		loginPage.logIn("kiiperabb0", "THrustno1");
		assertEquals("Gmail", driver.getTitle());
		
		BrowserFactory.quitBrowser(driver);
	}
	
}
