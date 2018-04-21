package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class FindMergeLeads extends ProjectMethods {

	public FindMergeLeads() {
		// TODO Auto-generated method stub
		PageFactory.initElements(driver,this);

	}
	@FindBy(how=How.XPATH,using="//label[text()='Lead ID:']/following::input[1]")
	private WebElement eleenterlead;
	@And("enterlead as (.*)")
	public FindMergeLeads enterlead(String data) throws InterruptedException {
		type(eleenterlead, data);
		Thread.sleep(2000);
		return this;	

	}
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleclickfindleads;
	@When("clickfindleads")
	public FindMergeLeads clickfindleads() throws InterruptedException {
		clickWithNoSnap(eleclickfindleads);
		Thread.sleep(2000);
		return this;	

	}
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	
	private WebElement elefirstlead;
	@When("clickfirstresultleads")
	public MergeLead clickfirstresultlead() throws InterruptedException {
		clickWithNoSnap(elefirstlead);
		switchToWindow(0);
		Thread.sleep(2000);
		return new MergeLead();
		
	}


}
