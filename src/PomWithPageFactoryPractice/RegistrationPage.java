package PomWithPageFactoryPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegistrationPage {
	
	//Declaration ==> WebElements
	
	@FindBy(xpath="//img[@alt='Facebook']") private WebElement reg_fblogo;
	@FindBy(xpath="//a[text()='Already have an account?']") private WebElement already_acc;
	@FindBy(xpath="//a[@title='Sign up for Facebook']") private WebElement signuplink;
	@FindBy(name="firstname") private WebElement firstname;
	@FindBy(name="lastname") private WebElement surname;
	@FindBy(name="reg_email__") private WebElement mob_email;
	@FindBy(name="reg_email_confirmation__") private WebElement reEnter_email;
	@FindBy(name="reg_passwd__") private WebElement password;
	@FindBy(name="birthday_day") private WebElement birthdate;
	@FindBy(name="birthday_month") private WebElement birthmonth;
	@FindBy(name="birthday_year") private WebElement birthyear;
	@FindBy(xpath="//input[@value='1']") private WebElement gender_male;
	@FindBy(xpath="//input[@value='1']") private WebElement gender_female;
	@FindBy(name="websubmit") private WebElement submitbtn;
	
	//Initialization
	
	public RegistrationPage(WebDriver driver) {  //constructor with parameter
		PageFactory.initElements(driver, this);
	}
	
	//Usage
	
	public void ClickFacebookSignupLink() {
		signuplink.click();
	}
	
	public void VerifyFacebookRegistrationPageFblogo() {
		Assert.assertTrue(reg_fblogo.isDisplayed(), "The facebook logo on registration page is not displayed");
	}
	
	public void VerifyFacebookRegistrationPageAlreadyAccount() {
		Assert.assertTrue(already_acc.isDisplayed(), "The already having an account option on registration page ia not displayed");
		
		Assert.assertEquals(already_acc.getText(), "Already have an account?");
	}
	
	public void SetFacebookRegistrationPageFirstname(String fn) {
		Assert.assertTrue(firstname.isDisplayed(), "The first name option is not displayed on registration page");
		firstname.sendKeys(fn);
	}
	
	public void SetFacebookRegistrationPageSurname(String sn) {
		Assert.assertTrue(surname.isDisplayed(), "The surname option is not displayed on registration page");
		surname.sendKeys(sn);
	}
	
	public void SetFacebookRegistrationPageMobileEmailAddress() {
		Assert.assertTrue(mob_email.isDisplayed(), "Mobile or Email Address option is not display on Registration page");
		mob_email.sendKeys("abc12@gmail.com");
	}
	
	public void SetFacebookRegistrationPageMobileReEmailAddress() {
		Assert.assertTrue(reEnter_email.isDisplayed(), "Re-enter Email Address option is not display on Registration page");
		reEnter_email.sendKeys("abc12@gmail.com");
	}
	
	
	
	public void SetFacebookRegistrationPagePassword() {
		Assert.assertTrue(password.isDisplayed(), "The password option is not display on Registration page");
		password.sendKeys("UvtY7766!");
	}
	
	public void SetFacebookRegistrationPageBirthDay() {
		Assert.assertTrue(birthdate.isDisplayed(), "Birth Date dropdown is not available on website");
		Assert.assertFalse(birthdate.isSelected(), "Birth date is selected on Registration page initially");
		Select bday =new Select(birthdate);
		bday.selectByVisibleText("3");
	}
	
	public void SetFacebookRegistrationPageBirthMonth() {
		Assert.assertTrue(birthmonth.isDisplayed(), "Birth Month dropdown is not available on website");
		Assert.assertFalse(birthmonth.isSelected(), "Birth month is selected on Registration page initially");
		Select bmonth =new Select(birthmonth);
		bmonth.selectByVisibleText("Mar");
	}
	
	public void SetFacebookRegistrationPageBirthYear() {
		Assert.assertTrue(birthyear.isDisplayed(), "Birth Year dropdown is not available on website");
		Assert.assertFalse(birthyear.isSelected(), "Birth year is selected on Registration page initially");
		Select byear =new Select(birthyear);
		byear.selectByVisibleText("1998");
	}
	
	public void SetFacebookRegistrationPageGender(String gender) {
		if(gender.equalsIgnoreCase("male")) {
			gender_male.click();
		}else if(gender.equalsIgnoreCase("female")) {
			gender_female.click();
		}else {
			System.out.println("Please select valid input");
		}
	}
	
	public void ClickFacebookRegistrationPageSubmitBtn() {
		submitbtn.click();
	}
	
	
	

}
