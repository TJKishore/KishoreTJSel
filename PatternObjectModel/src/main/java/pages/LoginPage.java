package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class LoginPage extends ProjectMethods{
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	//Login Enter the UserName
	@FindBy(how=How.ID,using="username")
	private WebElement eleUserName;
	@And("enter the user name as (.*)")
	public LoginPage enterUserName(String data) {
		type(eleUserName, data);
		return this;
	}
	
	//Login Enter the Password
	@FindBy(how=How.ID,using="password")
	private WebElement elePassword;
	@And("enter the password as (.*)")
	public LoginPage enterPassword(String data) {
		type(elePassword, data);
		return this;
	}
	
	//Click Login Button
	@FindBy(how=How.XPATH,using="//input[@class='decorativeSubmit']")
	private WebElement eleLogin;
	@When("click on loginbutton")
	public HomePage clickLogIn() {
		click(eleLogin);
		return new HomePage();		
	}
	//Login for Failure
	public LoginPage clickLogInForFailer() {
		click(eleLogin);
		return this;		
	}
	//Error Message Validation
	@FindBy(how=How.ID,using="errorDiv")
	private WebElement eleErrorMsg;
	
	public LoginPage verifyErrorMsg(String data) {
	verifyPartialText(eleErrorMsg, data);
		return this;		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
