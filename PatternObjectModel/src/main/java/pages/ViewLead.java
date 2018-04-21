package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{

	public ViewLead() {
		// TODO Auto-generated method stub
		PageFactory.initElements(driver,this);
	}
	//Verify FirstName
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleverifyfirstname;
	@Then("verifyfirstname as (.*)")
	public ViewLead verifyusername(String data) {
		verifyPartialText(eleverifyfirstname, data);
		return this;
	}
	//Verify View lead Title
	@FindBy(how=How.XPATH,using="//div[text()='View Lead']")
	private WebElement eleverifytitle;
	@Then("verifytitle as (.*)")
	public ViewLead verifytitle(String data) {
		verifyPartialText(eleverifytitle, data);
		return this;
	}
	//Click Delete Button
	@FindBy(how=How.LINK_TEXT,using="Delete")
	private WebElement eledelete;
	@When("clickdelete")
	public MyLeads clickdelete() {
		click(eledelete);
		return new MyLeads();		
	}
	//Click Edit Button
	@FindBy(how=How.XPATH,using="//a[text()='Edit']")
	private WebElement eleedit;
	@When("clickEdit")
	public EditLead clickedit() throws InterruptedException {
		Thread.sleep(2000);
		click(eleedit);
		return new EditLead();		
	}
	//Click Delete Button
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement eleduplicate;
	@When("clickduplicate")
	public DuplicateLead clickduplicate() {
		click(eleduplicate);
		return new DuplicateLead();		
	}	

	//Verify CompanyName
	@FindBy(how=How.XPATH,using="//span[@id='viewLead_companyName_sp']")
	private WebElement eleverifycompanyname;
	@Then("verifycompanyname as (.*)")
	public ViewLead verifycompanyname(String data) {
		verifyPartialText(eleverifycompanyname, data);
		return this;
	}
}
