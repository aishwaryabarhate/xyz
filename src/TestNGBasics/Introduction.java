package TestNGBasics;

import org.testng.annotations.Test;

public class Introduction {
	
	@Test(priority = 1)
	public void OpenUrl(){
		System.out.println("URL is opened in website");
	}
	
	@Test(priority = 2)
	public void Login() {
		System.out.println("Logged in to website");
	}
	
	@Test(priority = 3)
	public void LogOut() {
		System.out.println("Logged out from website");
	}

}
