package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods {

	public CreateLead() {
		// TODO Auto-generated method stub
		PageFactory.initElements(driver,this);
	}
	//Enter CompanyName
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyname;
	@And("enter the Companyname as (.*)")
	public CreateLead enterCompanyname(String data) {
		type(eleCompanyname, data);
		return this;
	}
	//Enter FirstName
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstname;
	@And("enter the Firstname as (.*)")
	public CreateLead enterFirstname(String data) {
		type(eleFirstname, data);
		return this;
	}
	//Enter LastName
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastname;
	@And("enter the LastName as (.*)")
	public CreateLead eleLastname(String data) {
		type(eleLastname, data);
		return this;
	}
	//Click Submit Button
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleSubmit;
	@When("Clickcreatebutton")
	public ViewLead clicksubmit() {
		click(eleSubmit);
		return new ViewLead();			
	}

}

