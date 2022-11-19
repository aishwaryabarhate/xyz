package PomWithPageFactoryPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AmazonRegistrationTest {
	
	//method call //testCases
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "G:\\Aishwarya\\Selenium All Jar files\\ChromeDriver_win32(104)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void teardown() {
		//driver.close();
	}

	@Test
	public void AmazonRegistrationPageTest(){
		AmazonRegistrationPage arp = new AmazonRegistrationPage(driver);
		
		arp.VerifyAmazonRegistrationPageMainAmazonLogo();
		arp.SelectAmazonRegistrationPageLanguage();
		arp.ClickAmazonRegistrationPageSignUp();
		arp.VerifyAmazonRegistrationPageMainAmazonLogo();
		arp.VerifyAmazonRegistrationPageAlreadyAccount();
		arp.SetAmazonRegistrationPageYourName();
		arp.SetAmazonRegistrationPageMobDropDown();
		arp.SetAmazonRegistrationPageMob_Number();
		arp.SetAmazonRegistrationPageEmail();
		arp.SetAmazonRegistrationPagePassword();
		arp.ClickAmazonRegistrationPageContinue();
	}
	
}
