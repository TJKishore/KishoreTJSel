package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class MergeLead extends ProjectMethods {

	public MergeLead() {
		// TODO Auto-generated method stub
		PageFactory.initElements(driver,this);

	}
	@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])[1]")
	private WebElement eleclicknearfromlead;
	@When("clicknearfromlead")
	public FindMergeLeads clicknearfromlead() {
		clickWithNoSnap(eleclicknearfromlead);
		switchToWindow(1);
		return new FindMergeLeads();		
	}
	@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])[2]")
	private WebElement eleclickneartolead;
	@When("clickneartolead")
	public FindMergeLeads clickneartolead() {
		clickWithNoSnap(eleclickneartolead);
		switchToWindow(1);
		return new FindMergeLeads();		
	}
	@FindBy(how=How.LINK_TEXT,using="Merge")
	private WebElement eleclickmerge;
	@When("clickmerge")
	public AcceptAlert clickmerge() {
		clickWithNoSnap(eleclickmerge);
		return new AcceptAlert();		
	}
	
}
