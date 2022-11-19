package PomWithPageFactoryPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AmazonRegistrationPage {
	
	//declaration of webElements
	
		@FindBy(xpath="value") private WebElement Mainamazonlogo;
		@FindBy(xpath="value") private WebElement LangSetting;
		@FindBy(xpath="value") private WebElement new_customer;
		@FindBy(xpath="value") private WebElement RegistrationAmazonLogo;
		@FindBy(xpath="value") private WebElement already_acc;
		@FindBy(xpath="value") private WebElement your_name;
		@FindBy(xpath="value") private WebElement mob_dropdown;
		@FindBy(xpath="value") private WebElement mob_number;
		@FindBy(xpath="value") private WebElement email;
		@FindBy(xpath="value") private WebElement password;
		@FindBy(xpath="value") private WebElement submitbtn;
		@FindBy(xpath="value") private WebElement signupLink;
		
		//initialization
		
		public AmazonRegistrationPage(WebDriver driver) {  //constructor with parameter
			PageFactory.initElements(driver, this);
		}
		
		//usage
		
		public void VerifyAmazonRegistrationPageMainAmazonLogo() {
			Assert.assertTrue(Mainamazonlogo.isDisplayed(), "Amazon logo is not available on main amazon page");
		}
		
		public void SelectAmazonRegistrationPageLanguage() {
			Assert.assertTrue(LangSetting.isDisplayed(), "Language setting option is not visible on amazon page");
			Assert.assertFalse(LangSetting.isSelected(), "Language is selected initially" );
		}
		
		public void ScrollAmazonPageTillSignUP() {
			WebDriver driver = null;
			Assert.assertTrue(signupLink.isEnabled(), "scroll down is not working on page");
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].scrollIntoView(true);", signupLink);
			signupLink.click();
		}
		
		public void ClickAmazonRegistrationPageSignUp() {
			Assert.assertTrue(new_customer.isDisplayed(), "Sign Up option is not available on page");
			new_customer.click();
		}
		
		public void VerifyAmazonRegistrationPageRegistrationAmazonLogo() {
			Assert.assertTrue(RegistrationAmazonLogo.isDisplayed(), "Amazon logo is not available on main amazon page");
		}
		
		public void VerifyAmazonRegistrationPageAlreadyAccount() {
			Assert.assertTrue(already_acc.isDisplayed(), "Already account option is not available on main amazon page");
		}
		
		public void SetAmazonRegistrationPageYourName() {
			Assert.assertTrue(your_name.isDisplayed(), "Username option is not available on amazon page");
			your_name.sendKeys("makar");
		}
		
		public void SetAmazonRegistrationPageMobDropDown() {
			Assert.assertTrue(mob_dropdown.isDisplayed(), "Drop Down option is not available on amazon Registration page");
			Assert.assertFalse(mob_dropdown.isSelected(), "Country code is selected on registration page initially");
			Select md = new Select(mob_dropdown);
			md.selectByVisibleText("IN +91");
		}
		
		public void SetAmazonRegistrationPageMob_Number() {
			Assert.assertTrue(mob_number.isDisplayed(), "Mobile Number option is not visible on registration page");
			mob_number.sendKeys("5656565656");
		}
		
		public void SetAmazonRegistrationPageEmail() {
			Assert.assertTrue(email.isDisplayed(), "Email option is not visible on registration page");
			email.sendKeys("hsgfh123@gmail.com");
		}
		
		public void SetAmazonRegistrationPagePassword() {
			Assert.assertTrue(password.isDisplayed(), "password option is not visible on registration page");
			email.sendKeys("hsgfh123@");
		}
		
		public void ClickAmazonRegistrationPageContinue() {
			Assert.assertTrue(submitbtn.isDisplayed(), "submitbtn option is not visible on registration page");
			submitbtn.click();
		}

}
