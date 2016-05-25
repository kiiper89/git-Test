
//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageFactory.BrowserFactory;

import PageObjects.GmailHeader;
import PageObjects.LoginPage;

public class HeaderTests {
	/*
	@Test
	public void checkTheHeaderIcon() throws InterruptedException {
		WebDriver driver = BrowserFactory.startBrowser("Firefox",
				"https://accounts.google.com/ServiceLogin?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1#identifier");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.logIn("test2ideo", "Secret_123");

		GmailHeader gmailHeader = PageFactory.initElements(driver, GmailHeader.class);
		gmailHeader.searchWithClick("gergo nagy");
		gmailHeader.clickOnHomePageLogo();
		BrowserFactory.quitBrowser(driver);

	}

	@Test
	public void checkTheSearchFieldWithSubmit() throws InterruptedException {
		WebDriver driver = BrowserFactory.startBrowser("Firefox",
				"https://accounts.google.com/ServiceLogin?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1#identifier");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.logIn("test2ideo", "Secret_123");

		GmailHeader gmailHeader = PageFactory.initElements(driver, GmailHeader.class);
		gmailHeader.searchWithClick("gergo nagy");
		BrowserFactory.quitBrowser(driver);
	}

	@Test
	public void checkAllApps() throws InterruptedException {
		WebDriver driver = BrowserFactory.startBrowser("Firefox",
				"https://accounts.google.com/ServiceLogin?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1#identifier");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.logIn("test2ideo", "Secret_123");

		GmailHeader gmailHeader = PageFactory.initElements(driver, GmailHeader.class);
		gmailHeader.openTheApps("searchApp");
		
		BrowserFactory.quitBrowser(driver);

	}
	
	@Test
	public void checkTheNotifications() throws InterruptedException {
		WebDriver driver = BrowserFactory.startBrowser("Firefox",
				"https://accounts.google.com/ServiceLogin?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1#identifier");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.logIn("test2ideo", "Secret_123");

		GmailHeader gmailHeader = PageFactory.initElements(driver, GmailHeader.class);
		gmailHeader.checkTheNotifications();
		
		BrowserFactory.quitBrowser(driver);
	}
	
	@Test
	public void checkTheOwnProfile() throws InterruptedException {
		WebDriver driver = BrowserFactory.startBrowser("Firefox",
				"https://accounts.google.com/ServiceLogin?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1#identifier");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.logIn("test2ideo", "Secret_123");

		GmailHeader gmailHeader = PageFactory.initElements(driver, GmailHeader.class);
		gmailHeader.checkOwnProfile();
		
		BrowserFactory.quitBrowser(driver);
	}*/
	
	@Test
	public void checkAValidLoginAndLogout() throws InterruptedException {
		WebDriver driver = BrowserFactory.startBrowser("Firefox",
				"https://accounts.google.com/ServiceLogin?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1#identifier");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.logIn("test2ideo", "Secret_123");

		GmailHeader gmailHeader = PageFactory.initElements(driver, GmailHeader.class);
		gmailHeader.checkOwnProfile();
		gmailHeader.logOut();
		
		BrowserFactory.quitBrowser(driver);
	}
}
