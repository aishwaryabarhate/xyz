package TestNGBasics;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassAnnotationsPractice {

	@BeforeClass
	public void login() {
		System.out.println("Logged in to the Application");
		Reporter.log("Logged in to the Application");
	}
	
	@AfterClass
	public void logout() {
		System.out.println("Logged out from the Application");
		Reporter.log("Logged out from the Application");
	}
	
	@Test(priority = 1)
	public void homepage() {
		System.out.println("Checking the homepage");
		Reporter.log("Checking the homepage");
	}
	
	@Test(priority = 3)
	public void profilepage() {
		System.out.println("Checking the profilepage");
		Reporter.log("Checking the profilepage");
	}
	
	@Test(priority = 2)
	public void notificationpage() {
		System.out.println("Checking the notificationpage");
		Reporter.log("Checking the notificationpage");
	}
}


