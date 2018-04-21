package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class Findleadpage extends ProjectMethods {

	public Findleadpage() {
		// TODO Auto-generated method stub
		PageFactory.initElements(driver,this);

	}
	@FindBy(how=How.XPATH,using="//label[text()='Lead ID:']/following::input[1]")
	private WebElement eleenterlead;
	@And("enterfindlead as (.*)")
	public Findleadpage enterfindlead(String data) {
		type(eleenterlead, data);
		return this;	

	}
	//Enter the First name
	@FindBy(how=How.XPATH,using="//label[text()='Lead ID:']/following::input[2]")
	private WebElement elefirstname;
	@And("enterfirstname as (.*)")
	public Findleadpage enterfirstname(String data) {
		type(elefirstname, data);
		return this;	

	}
	//Click on Phone number Tab
	@FindBy(how=How.XPATH,using="//span[text()='Phone']")
	private WebElement elephoneno;
	@When("clickphoneno")
	public Findleadpage clickphoneno() {
		click(elephoneno);
		return this;	

	}
	// Enter the Phone number
	@FindBy(how=How.XPATH,using="//input[@name='phoneNumber']")
	private WebElement elephonenumber;
	@And("enterphonenumber as (.*)")
	public Findleadpage enterphonenumber(String data) {
		type(elephonenumber, data);
		return this;	

	}
	//Click on Find lead Button
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleclickfindleads;
	@When("clickfindbutton")
	public Findleadpage clickfindleadbutton() throws InterruptedException {
		click(eleclickfindleads);
		Thread.sleep(2000);
		return this;	

	}
	//Click on Email Tab
	@FindBy(how=How.XPATH,using="//span[text()='Email']")
	private WebElement eleemail;
	@When("clickemail")
	public Findleadpage clickemail() {
		click(eleemail);
		return this;	

	}
	// Enter the Email ID
	@FindBy(how=How.XPATH,using="//input[@name='emailAddress']")
	private WebElement eleemailaddress;
	@And("enteremailaddress as (.*)")
	public Findleadpage enteremailaddress(String data) {
		type(eleemailaddress, data);
		return this;	

	}	

	@FindBy(how=How.XPATH,using="//div[text()='No records to display']")
	private WebElement eleverifyerrormsg;
	@Then("verifyerrormsg as (.*)")
	public Findleadpage verifyerrormsg(String data) {
		verifyPartialText(eleverifyerrormsg, data);
		return this;

	}
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")

	private WebElement elefirsteditlead;
	@When("clickfirstresulteditlead")
	public ViewLead clickfirstresulteditlead() throws InterruptedException {
		click(elefirsteditlead);
		return new ViewLead();

	}
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")

	private WebElement elegetfirsteditlead;
	public Findleadpage getfirstresulteditlead() throws InterruptedException {
		String fromlead = getText(elegetfirsteditlead);
		Thread.sleep(2000);
		return this;

	}

}
