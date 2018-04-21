package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods {

	public MyLeads() {
		// TODO Auto-generated method stub
		PageFactory.initElements(driver,this);
	}
	//Click On CreateLead Link
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement elecreatelead;
	@When("Click on Create Lead")
	public CreateLead clickcreatelead() {
		click(elecreatelead);
		return new CreateLead();		
	}
	//Click On Find Link
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement elefindlead;
	@When("Click on find Lead")
	public Findleadpage clickfindlead() {
		click(elefindlead);
		return new Findleadpage();		
	}
	//Click On Merge Link
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement elemergelead;
	@When("Click on merge Lead")
	public MergeLead clickmergelead() {
		click(elemergelead);
		return new MergeLead();		
	}



}

