package pages;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class AcceptAlert extends ProjectMethods {

	public AcceptAlert() {
		// TODO Auto-generated method stub
		PageFactory.initElements(driver,this);

	}
	@When("acceptalerts")
	public MyLeads acceptalerts() {
		// TODO Auto-generated method stub
		acceptAlert();
		return new MyLeads();

	}

}
