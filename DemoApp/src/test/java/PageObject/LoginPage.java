package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Log In']")
	WebElement btnLogin;
	
	@FindBy(xpath="//a[text()='Log Out']")
	WebElement btnLogout;
	
	public void setusername(String uname)
	{
		username.clear();
		username.sendKeys(uname);
	}
	public void setpassword(String pd)
	{
		password.clear();
		password.sendKeys(pd);
	}
	public void clicklogin()
	{
		btnLogin.click();
	}
	public void clicklogout()
	{
		btnLogout.click();
	}
}
	
	
	
	


