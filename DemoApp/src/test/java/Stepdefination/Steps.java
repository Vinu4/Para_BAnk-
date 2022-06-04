package Stepdefination;


import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import PageObject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Steps  {
	public WebDriver driver;
	public LoginPage lp;
	
		

	
	@Given("Launch the browser")
	public void launch_the_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\703317451\\Downloads\\New folder\\Demo\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		 lp=new LoginPage(driver);
		 
	}
	@When("Navigate the URL")
	public void navigate_the_url() {
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
	}
	@When("User enters name as {string} and password as {string}")
	public void user_enters_name_as_and_password_as(String uname, String pd) {
	    lp.setusername(uname);
	    lp.setpassword(pd);
	}
	@When("Click on the login")
	public void click_on_the_login() throws InterruptedException{
	   lp.clicklogin();
	   
	   Thread.sleep(3000);
	  
	   
	   
	}
	@Then("User able to see an error as {string}")
	public void user_able_to_see_an_error_as(String string) {
		if(driver.getPageSource().contains(string))
		{
			driver.close();
			Assert.assertTrue(true);
		}
		
		}
	   
	@Then("Page title should be {string}")
	public void page_title_should_be(String title) throws InterruptedException {

			Assert.assertEquals(title, driver.getTitle());
		
		
		}
	
	    
	
	@When("User Click on the Logout link")
	public void user_click_on_the_logout_link() throws InterruptedException {
		lp.clicklogout();
		Thread.sleep(2000);
	
	   
	}
	
	
	@Then("Close the Browser")
	public void close_the_browser(){
		
	  driver.quit();
	}
	    // Open new Account
	

@Then("Click on the open new account link")
public void click_on_the_open_new_account_link() {
     driver.findElement(By.xpath("//a[text()='Open New Account']")).click();
    String actualTitle = "ParaBank | Open Account";
    String expectedTitle = driver.getTitle();
    System.out.println("Expect Titlee::"+expectedTitle);
    Assert.assertEquals(expectedTitle, actualTitle);
}
@Then("Select the account type either checking or saving")
public void select_the_account_type_either_checking_or_saving() {
	Select se=new Select(driver.findElement(By.id("type")));
    se.selectByVisibleText("SAVINGS");
}
@Then("Select the existing account number to trasnfer fund to new account")
public void select_the_existing_account_number_to_trasnfer_fund_to_new_account() {
	WebElement web=driver.findElement(By.id("fromAccountId"));
	web.click();
	 Select se=new Select(web);
	    se.selectByValue("13344");
}
@Then("Click on the open new account button")
public void click_on_the_open_new_account_button() {
    driver.findElement(By.xpath("//input[@value='Open New Account']")).click();
   
}


    // Transfer Fund

@Then("Click on the Transfer Funds")
public void click_on_the_transfer_funds() {
	driver.findElement(By.xpath("//a[text()='Transfer Funds']")).click();
	
}
@Then("Page title shouldbe {string}")
public void page_title_shouldbe(String string)throws InterruptedException {
    Assert.assertEquals(driver.getTitle(), string);
    Thread.sleep(2000);
}
@Then("User Enter amount as {string}")
public void user_enter_amount_as(String string) {
    driver.findElement(By.id("amount")).sendKeys(string);
    
}
@Then("Select from as {string}")
public void select_from_as(String string)throws InterruptedException {
	Thread.sleep(3000);
	Select se=new Select(driver.findElement(By.id("fromAccountId")));
    se.selectByVisibleText(string);
		}
@Then("To Account as {string}")
public void to_account_as(String string) {
	Select se=new Select(driver.findElement(By.id("toAccountId")));
    se.selectByVisibleText(string);
		}
@Then("Click on Transfer")
public void click_on_transfer() {
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    
}

      // Bill PAy

@Then("Click on Bill Pay")
public void click_on_bill_pay() {
   driver.findElement(By.xpath("//a[text()='Bill Pay']")).click();
}


@When("User enter Enter Payeename as {string} and Address as {string} and City as {string} and State as {string} and Zipcode as {string} and Phoneno as {string}")
public void user_enter_enter_payeename_as_and_address_as_and_city_as_and_state_as_and_zipcode_as_and_phoneno_as(String string, String string2, String string3, String string4, String string5, String string6) {
    driver.findElement(By.name("payee.name")).sendKeys(string);
    driver.findElement(By.name("payee.address.street")).sendKeys(string2);
    driver.findElement(By.name("payee.address.city")).sendKeys(string3);
    driver.findElement(By.name("payee.address.state")).sendKeys(string4);
    driver.findElement(By.name("payee.address.zipCode")).sendKeys(string5);
    driver.findElement(By.name("payee.phoneNumber")).sendKeys(string6);
}
@When("User Enter Account as {string}")
public void user_enter_account_as(String string) {
   driver.findElement(By.name("payee.accountNumber")).sendKeys(string);
}
@Then("User Enter CofirmAccount as {string}")
public void user_enter_cofirm_account_as(String string) {
    driver.findElement(By.name("verifyAccount")).sendKeys(string);
}
@Then("User Enter payAmount as {string}")
public void user_enter_pay_amount_as(String string) {
    driver.findElement(By.name("amount")).sendKeys(string);
}
@Then("User select the from Account as {string}")
public void user_select_the_from_account_as(String string) {
	Select se=new Select(driver.findElement(By.name("fromAccountId")));
    se.selectByVisibleText(string);
}
@Then("Click on send payment")
public void click_on_send_payment() {
   driver.findElement(By.xpath("//input[@type='submit']")).click();
   String actualTitle = "ParaBank | Bill Payment Complete";
   String expectedTitle = driver.getTitle();
   System.out.println("Expect Titlee::"+expectedTitle);
}




    // update Mobile Number

@Then("User click on update_contact Info")
public void user_click_on_update_contact_info() {
    driver.findElement(By.xpath("//a[text()='Update Contact Info']")).click();
}
@Then("User enter the update info Phoneno as {string}")
public void user_enter_the_update_info_phoneno_as(String string) {
   driver.findElement(By.name("customer.firstName")).sendKeys("Lee");
   driver.findElement(By.name("customer.lastName")).sendKeys("marcus");
   driver.findElement(By.name("customer.address.street")).sendKeys("Paris");
   driver.findElement(By.name("customer.address.city")).sendKeys("USA");
   driver.findElement(By.name("customer.address.state")).sendKeys("America");
   driver.findElement(By.name("customer.address.zipCode")).sendKeys("581401");
   driver.findElement(By.name("customer.phoneNumber")).sendKeys(string);
}
@Then("click on update profile")
public void click_on_update_profile() {
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    


}


}










