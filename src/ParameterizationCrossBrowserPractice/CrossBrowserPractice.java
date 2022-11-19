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

public class CrossBrowserPractice {
	WebDriver driver;  //global variable
	
	@Parameters("browser")
	
	@Test(priority = 1)
	public void sample(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "G:\\Aishwarya\\Selenium All Jar files\\ChromeDriver_win32(104)\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "G:\\Aishwarya\\Selenium All Jar files\\geckodriver-v0.31.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else {
			System.out.println("Wrong browser selected");
		}
		
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority = 2)
	public void verifyCurrentUrl() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.instagram.com/accounts/login/");
	}
	
	@Test(priority = 3)
	public void verifyTitle() {
		Assert.assertEquals(driver.getTitle(), "Login • Instagram");
	}
	
	@Test(priority = 4)
	public void verifyUsername() {
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		Assert.assertTrue(username.isDisplayed());
		username.sendKeys("Aishwarya");
	}
	
	@Test(priority = 5)
	public void verifyPassword() {
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		Assert.assertTrue(password.isDisplayed());
		password.sendKeys("aish@123");
	}
	
	@Test(priority = 6)
	public void clickLoginBtn() {
		WebElement loginBtn = driver.findElement(By.xpath("//div[text()='Log In']"));
		Assert.assertTrue(loginBtn.isEnabled());
		loginBtn.click();
	}

}
