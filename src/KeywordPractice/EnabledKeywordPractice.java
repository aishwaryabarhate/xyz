package KeywordPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EnabledKeywordPractice {
	
	private static final boolean False = false;

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
	
	@Test(priority = 1)
	public void homepage() {
		System.out.println("Clicked on homepage");
	}
	
	@Test(priority = 2, invocationCount = 5, enabled = false) //enabled=false is used to skip the test case purposefully
	public void notification() {
		System.out.println("Clicked on Notification page");	
	}
	
	@Test(enabled = false)
	public void Settingpagetest() {
		System.out.println("Check the setting page of application");
	}


}
