package GroupingPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@BeforeTest(alwaysRun = true)
	public void OpenDB() {
		System.out.println("Open Database");
	}
	
	@AfterTest(alwaysRun = true)
	public void CloseDB() {
		System.out.println("Close Database");
	}
	
	@BeforeClass(alwaysRun = true)
	public void OpenBrowser() {
		System.out.println("Browser is open");
	}
	
	@AfterClass(alwaysRun = true)
	public void CloseBrowser() {
		System.out.println("Browser is close");
	}
	
	@Test(groups = "Smoke")
	public void Test1() {
		System.out.println("Executing test 1"); //eg: sanity/smoke test case
	}
	
	@Test(groups = "Functional")
	public void Test2() {
		System.out.println("Executing test 2"); //eg: functional Test case
	}
	
	@Test(groups = {"Functional","Regression"})
	public void Test3() {
		System.out.println("Executing test 3"); //eg: functional/Regression test case
	}

}
