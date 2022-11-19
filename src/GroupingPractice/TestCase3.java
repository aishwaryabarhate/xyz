package GroupingPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase3 {
	
	@BeforeClass(alwaysRun = true)
	public void OpenBrowser() {
		System.out.println("Browser is open");
	}
	
	@AfterClass(alwaysRun = true)
	public void CloseBrowser() {
		System.out.println("Browser is close");
	}
	
	@Test(groups = "Smoke")
	public void Test7() {
		System.out.println("Executing test 7");//eg: sanity/smoke test case
	}
	
	@Test(groups = "Functional")
	public void Test8() {
		System.out.println("Executing test 8"); //eg: functional Test case
	}
	
	@Test(groups = {"Functional","Regression"})
	public void Test9() {
		System.out.println("Executing test 9"); //eg: functional/Regression test case
	}


}
