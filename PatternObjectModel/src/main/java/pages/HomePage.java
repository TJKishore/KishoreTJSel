package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods{
	
	public HomePage() {		
		PageFactory.initElements(driver,this);
	}	
	//Click Logout Button
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogOut;
	
	public LoginPage clickLogOut() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogOut);
		return new LoginPage();		
	}
	//Verify welcome page after Login
	@FindBy(how=How.XPATH,using="//h2[text()[contains(.,'Welcome')]]")
	private WebElement eleLoggedName;
	
	public HomePage verifyLoggedName(String data) {
	verifyPartialText(eleLoggedName, data);
		return this;		
	}
	//Click On CRM/SFA
	@FindBy(how=How.LINK_TEXT,using="CRM/SFA")
	private WebElement elecrmsfa;
	@When("Click on CRM/SFA")
	public MyHome clickcrmsfa() {
		click(elecrmsfa);
		return new MyHome();		
	}
	
	
	
	
	

}
