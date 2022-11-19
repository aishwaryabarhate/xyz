package GroupingPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase2 {
	
	@BeforeClass(alwaysRun = true)
	public void OpenBrowser() {
		System.out.println("Browser is open");
	}
	
	@AfterClass(alwaysRun = true)
	public void CloseBrowser() {
		System.out.println("Browser is close");
	}
	
	@Test(groups = "Smoke")
	public void Test4() {
		System.out.println("Executing test 4");//eg: sanity/smoke test case
	}
	
	@Test(groups = "Functional")
	public void Test5() {
		System.out.println("Executing test 5"); //eg: functional Test case
	}
	
	@Test(groups = {"Functional","Regression"})
	public void Test6() {
		System.out.println("Executing test 6"); //eg: functional/Regression test case
	}


}
