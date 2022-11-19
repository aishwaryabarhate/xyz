package PomWithPageFactoryPractice;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPage {
	
	//webelement declaration
	
	@FindBy(xpath="//img[@alt='Facebook']") private WebElement loginFB_logo;
	@FindBy(xpath="//h2[starts-with(text(),'Facebook helps you connect')]") private WebElement login_fbtagline;
	@FindBy(xpath="//a[text()='Create New Account']") private WebElement create_new_acc;
	@FindBy(xpath="//a[text()='Forgotten password?']") private WebElement forgotten_password;
	@FindBy(xpath="//input[@name='email']") private WebElement email_mobno;
	@FindBy(xpath="//input[@name='pass']") private WebElement password;
	@FindBy(xpath="//button[@type='submit']") private WebElement Login_btn;
	@FindBys({@FindBy(xpath="//div[@id='pageFooterChildren']//li")}) private List<WebElement> footerlinks;
	
	//initialization
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//usage
	
	public void VerifyFacebookLoginPageFBlogo() {
		Assert.assertTrue(loginFB_logo.isDisplayed(), "The FB logo is not present on facebook login page");
		Reporter.log("VerifyFacebookLoginPageFBlogo",true);
	}
	
	public void VerifyFacebookLoginPageTitle() {
		Assert.assertEquals(login_fbtagline.getText(), "Facebook helps you connect and share with the people in your life.");
		Reporter.log("VerifyFacebookLoginPageTitle",true);
	}
	
	public void VerifyFacebookLoginPageCreateNewAccount() {
		Assert.assertTrue(create_new_acc.isDisplayed(), "Create new account option is not available on facebook login page");
		Assert.assertEquals(create_new_acc.getText(), "Create New Account");
		Reporter.log("VerifyFacebookLoginPageCreateNewAccount",true);
	}
	
	public void VerifyFacebookLoginPageForgotPassword() {
		Assert.assertTrue(forgotten_password.isDisplayed(), "The forgot password option is not available on facebook login page");
		Assert.assertEquals(forgotten_password.getText(), "Forgotten password?");
		forgotten_password.click();
		Reporter.log("VerifyFacebookLoginPageForgotPassword",true);
	}
	
	public void VerifyFacebookLoginPageFooterLinksSize() {
		Assert.assertEquals(footerlinks.size(), 31);
		Reporter.log("VerifyFacebookLoginPageFooterLinksSize",true);
	}
	
	public void SetFacebookLoginPageEmailorMobno() {
		Assert.assertTrue(email_mobno.isEnabled(), "The username text box is not enabled on facebook login page");
		email_mobno.sendKeys("ghjkl");
		Reporter.log("SetFacebookLoginPageEmailorMobno",true);
	}
	
	public void SetFacebookLoginPagePassword() {
		Assert.assertTrue(password.isEnabled(), "The password option is not enabled on facebook login page");
		password.sendKeys("tyu@1234");
		Reporter.log("SetFacebookLoginPagePassword",true);
	}
	
	public void ClickFacebookLoginPageLoginButton() {
		Login_btn.click();
		Reporter.log("ClickFacebookLoginPageLoginButton",true);
	}
	
	


}
