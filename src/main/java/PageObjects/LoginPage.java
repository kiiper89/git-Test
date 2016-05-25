package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;
	
	public void Loginpage(WebDriver driver){
		this.driver = driver;
	}
	
	@FindBy(id="Email")
	WebElement usernameField;
	
	@FindBy(id="next")
	WebElement nextButton;
	
	@FindBy(id="Passwd")
	WebElement passwordField;
	
	@FindBy(id="signIn")
	WebElement signInButton;
	
	public void logIn(String username, String password) throws InterruptedException {
		usernameField.sendKeys(username);
		nextButton.click();
		Thread.sleep(1000);
		passwordField.sendKeys(password);
		signInButton.click();
	}
}
