package PageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.PageFactory.WaitABit;

public class GmailHeader {

	WebDriver driver;
	
	@FindBy(css="[class='gb_Rb']")
	WebElement homepageIcon;
	
	@FindBy(id="gbqfq")
	WebElement searchField;
	
	@FindBy(id="gbqfb")
	WebElement searchButton;
		
	@FindBy(css=".gb_b.gb_Rb")
	WebElement appsButton;
	
		@FindBy(id="gb192")
		WebElement ownAccountApp;
		
		@FindBy(id="gb1")
		WebElement searchApp;
		
		@FindBy(id="gb8")
		WebElement mapApp;
		
		@FindBy(id="gb36")
		WebElement youtubeApp;
		
		@FindBy(id="gb5")
		WebElement newsApp;
		
		@FindBy(id="gb23")
		WebElement gmailApp;
		
		@FindBy(id="gb49")
		WebElement driveApp;
		
		@FindBy(id="gb24")
		WebElement calendarApp;
		
		@FindBy(id="gb119")
		WebElement googlePlusApp;
		
		@FindBy(id="gb51")
		WebElement translateApp;
		
		@FindBy(id="gb31")
		WebElement picturesApp;
		
		@FindBy(css=".gb_qc.gb_rc.gb_Rb")
		WebElement notificationButton;
		
		@FindBy(css=".gb_3a.gbii")
		WebElement ownProfile;
		
		@FindBy(css="a[id='gb_71']")
		WebElement logOutButton;
	
	
	public GmailHeader(WebDriver driver){
		this.driver = driver;
	}
	
	public void clickOnHomePageLogo() {
		homepageIcon.click();
	}
	
	public void searchWithClick(String whatSearchFor){
		WebDriverWait wait = new WebDriverWait(driver, 2);
		wait.until(ExpectedConditions.elementToBeClickable(searchField));
		searchField.sendKeys(whatSearchFor);
		searchButton.click();
	}
	
	public void searchWithSubmit(String whatSearchFor) {
		searchField.sendKeys(whatSearchFor);
		searchField.submit();
	}
	
	public void openTheApps(String appName){
		
		List<String> parameterList = new ArrayList<String>();
		parameterList.add("ownAccountApp");
		parameterList.add("searchApp");
		parameterList.add("mapApp");
		parameterList.add("newsApp");
		parameterList.add("gmailApp");
		parameterList.add("driveApp");
		parameterList.add("calendarApp");
		parameterList.add("googlePlusApp");
		parameterList.add("translateApp");
		parameterList.add("picturesApp");
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.elementToBeClickable(appsButton));
		WaitABit.waitABit(driver, appsButton, 2);
		appsButton.click();
		switch (appName) {
		case "ownAccountApp":
			ownAccountApp.click();
			break;
		case "searchApp":
			searchApp.click();
			break;
		case "mapApp":
			mapApp.click();
			break;
		case "newsApp": 
			newsApp.click();
			break;
		case "gmailApp":
			gmailApp.click();
			break;
		case "driveApp":
			driveApp.click();
			break;
		case "calendarApp":
			calendarApp.click();
			break;
		case "googlePlusApp":
			googlePlusApp.click();
			break;
		case "translateApp":
			translateApp.click();
			break;
		case "picturesApp":	
			picturesApp.click();
			break;
		default:
			System.out.println("No match, please choose a string as a parameter from the following list: " + parameterList);
			break;
		}
	}
	
	public void checkTheNotifications() {
		WaitABit.waitABit(driver, notificationButton, 2);
		notificationButton.click();
	}
	
	public void checkOwnProfile() {
		WaitABit.waitABit(driver, ownProfile, 2);
		ownProfile.click();
	}
	
	public void logOut() {
		WaitABit.waitABit(driver, logOutButton, 2);
		logOutButton.click();
	}
}
