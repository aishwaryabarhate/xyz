package PomWithPageFactoryPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

	// Browser setup ==> validations apply ==> Browser close

	WebDriver driver;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver","G:\\Aishwarya\\Selenium All Jar files\\ChromeDriver_win32(104)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterClass
	public void teardown() {
		driver.close();
	}
	
	@Test
	public void FacebookLoginPageTest() {
		LoginPage lp = new LoginPage(driver);
		lp.VerifyFacebookLoginPageFBlogo();
		lp.VerifyFacebookLoginPageTitle();
		lp.VerifyFacebookLoginPageCreateNewAccount();
		lp.VerifyFacebookLoginPageForgotPassword();
		lp.VerifyFacebookLoginPageFooterLinksSize();
		lp.SetFacebookLoginPageEmailorMobno();
		lp.SetFacebookLoginPagePassword();
		lp.ClickFacebookLoginPageLoginButton();
		
	}

}
