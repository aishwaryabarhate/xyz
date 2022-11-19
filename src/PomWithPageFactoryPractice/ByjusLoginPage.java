package PomWithPageFactoryPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ByjusLoginPage  {
	
	@FindBy(xpath="//input[@name='name']") private WebElement username;
	@FindBy(xpath="//input[@name='mobile']") private WebElement mob_no;
	@FindBy(xpath="//input[@name='email']") private WebElement mailid;
	@FindBy(xpath="//select[@name='state']") private WebElement state;
	@FindBy(xpath="//button[contains(text(),'Free Class')]") private WebElement schduleclass;
	
	public ByjusLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void SetByjusLoginPageUsername() {
		username.sendKeys("Aishwarya");
	}
	
	public void SetByjusLoginPageMobNo() {
		Assert.assertFalse(true, "Test case passed");;
	}
	
	public void SetByjusLoginPageMailId() {
		mailid.sendKeys("aishwaryabarhate0312@gmail.com");
	}
	
	public void SelectByjusLoginPageState() {
		Select s= new Select(state);
		s.selectByVisibleText("Bihar");
	}
	
	public void ClickByjusLoginPageSchduleClass() {
		schduleclass.click();
	}

}
