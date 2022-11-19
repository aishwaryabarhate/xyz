package ParameterizationCrossBrowserPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AllBrowsers {
	
	WebDriver driver; //global variable
	@Parameters("browser")
	@Test      //here I haven't given priority , by default priority will be 0 , will execute first
	public void CrossBrowserTesting(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "G:\\Aishwarya\\Selenium All Jar files\\ChromeDriver_win32(104)\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "G:\\Aishwarya\\Selenium All Jar files\\geckodriver-v0.31.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();	
		}else {
			System.out.println("Wrong browser name selected");
		}
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		}
	
	@Test(priority = 1)
	public void VerifyCurrentUrl() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
	}
	
	@Test(priority = 2)
	public void VerifyPageTitle() {
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
	}
	
	@Test(priority = 3)
	public void VerifyUsernameField() {
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		Assert.assertTrue(username.isDisplayed());
		username.sendKeys("Aishwarya");
	}
	
	@Test(priority = 4)
	public void VerifyPasswordField() {
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		Assert.assertTrue(password.isDisplayed());
		password.sendKeys("aish@123");
	}
	
	@Test(priority = 5)
	public void VerifyLoginBtn() {
		WebElement LoginBtn = driver.findElement(By.xpath("//button[text()='Log in']"));
		Assert.assertTrue(LoginBtn.isEnabled());
		LoginBtn.click();
	}
		

	}


