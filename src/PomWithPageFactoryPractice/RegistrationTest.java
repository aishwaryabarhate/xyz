package PomWithPageFactoryPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegistrationTest {    //method calls //testCase
	
	//Browser setup ==> validations apply ==> Browser close
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "G:\\Aishwarya\\Selenium All Jar files\\ChromeDriver_win32(104)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void teardown() {
		//driver.close();
	}
	
	@Test
	public void FacebookRegistrationPageTest_Positive() {
		RegistrationPage rp = new RegistrationPage(driver);
		rp.ClickFacebookSignupLink();
		rp.VerifyFacebookRegistrationPageFblogo();
		rp.VerifyFacebookRegistrationPageAlreadyAccount();
		rp.SetFacebookRegistrationPageFirstname("abhngv");
		rp.SetFacebookRegistrationPageSurname("yuzc");
		rp.SetFacebookRegistrationPageMobileEmailAddress();
		rp.SetFacebookRegistrationPagePassword();
		rp.SetFacebookRegistrationPageBirthDay();
		rp.SetFacebookRegistrationPageBirthMonth();
		rp.SetFacebookRegistrationPageBirthYear();
		rp.SetFacebookRegistrationPageGender("Female");
		rp.ClickFacebookRegistrationPageSubmitBtn();
		rp.SetFacebookRegistrationPageMobileReEmailAddress();
	}
	
	

}
