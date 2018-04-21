package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class MyHome extends ProjectMethods {

	public MyHome() {
		// TODO Auto-generated method stub
		PageFactory.initElements(driver,this);
	}
	//Click On Leads Link
	@FindBy(how=How.LINK_TEXT,using="Leads")
	private WebElement eleLead;
	@When("Click on Leads")
	public MyLeads clickLeads() {
		click(eleLead);
		return new MyLeads();		
	}

}

