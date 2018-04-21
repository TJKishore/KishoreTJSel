package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class DuplicateLead extends ProjectMethods{

	public DuplicateLead() {
		// TODO Auto-generated method stub
		PageFactory.initElements(driver,this);
	}
	//Enter the CompanyName
	@FindBy(how=How.XPATH,using="//input[@id='updateLeadForm_companyName']")
	private WebElement elecompanyname;

	public DuplicateLead entercompanyname(String data) {	
		clear(elecompanyname);
		type(elecompanyname, data);
		return this;
	}
	//Click On Update
	@FindBy(how=How.XPATH,using="//Input[@class='smallSubmit'][1]")
	private WebElement eleupdate;
	@When("clickupate")
	public ViewLead clickupate() {
		click(eleupdate);
		return new ViewLead();		
	}
	
	
}
