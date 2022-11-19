package TestAnnotationPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@BeforeTest
	public void openDB() {
		System.out.println("Database is opened.");
	}
	
	@AfterTest
    public void closeDB() {
		System.out.println("Database is closed.");
	}
	
	@BeforeClass
	public void openBrowser() {
		System.out.println("Browser is open");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Browser is close");
	}
	
	@Test
	public void m1() {
		System.out.println("Method 1");
	}
	
	@Test
	public void m2() {
		System.out.println("Method 2");
	}
	
	@Test
	public void m3() {
		System.out.println("Method 3");
	}

}
