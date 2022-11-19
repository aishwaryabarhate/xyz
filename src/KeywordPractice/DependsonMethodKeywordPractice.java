package KeywordPractice;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsonMethodKeywordPractice {
	
	@Test(priority = 1)
	public void OpenUrl() {
		System.out.println("URL is opened");
		Assert.fail();
	}
	
	@Test(priority = 2, dependsOnMethods = "OpenUrl") //dependsOnMethods is used to create dependency between two method
	public void Login() {
		System.out.println("Logged in to the application");
	}
	
	@Test(priority = 3, dependsOnMethods = {"OpenUrl","Login"}) //curly braces is used to provide more than 1 method name
	public void Logout() {
		System.out.println("Loggeed out from the application");
	}
	

}
