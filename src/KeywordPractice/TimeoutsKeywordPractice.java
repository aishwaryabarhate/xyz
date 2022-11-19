package KeywordPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TimeoutsKeywordPractice {
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Browser is launched");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Browser is closed");
	}
	
	@BeforeMethod
	public void Login() {
		System.out.println("Logged in to the application");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logout from the application");
	}
	
	@Test(priority = 1, timeOut = 5000) //timeout is used to wait for some time before it fails
	public void homepage() throws InterruptedException {
		System.out.println("Clicked on homepage");
		Thread.sleep(6000);
	}
	
	@Test(priority = 2, invocationCount = 5) 
	public void notification() {
		System.out.println("Clicked on Notification page");
	}


}
