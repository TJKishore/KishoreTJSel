package homeworkwithsemethods;


import org.testng.annotations.Test;

import wemethods.ProjectMethods;

public class DuplicateLeadwithSemethods extends ProjectMethods {
@Test
	public void duplicatemethod() throws InterruptedException {
		// TODO Auto-generated method stub
	click(locateElement("linktext", "Leads"));
	click(locateElement("linktext", "Find Leads"));	
	click(locateElement("xpath", "//span[text()='Email']"));
	//input[@name="emailAddress"]
	type(locateElement("xpath", "//input[@name='emailAddress']"), "kishoret@gmail.com");
	click(locateElement("xpath", "//button[text()='Find Leads']"));		
	Thread.sleep(2000);
	String fromlead=getText(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
	System.out.println(fromlead);
	click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
	click(locateElement("linktext", "Duplicate Lead"));
	getText(locateElement("id", "sectionHeaderTitle_leads"));
	String firstname=getText(locateElement("xpath", "//input[@id='createLeadForm_firstName']"));
	click(locateElement("class", "smallSubmit"));
	verifyPartialText(locateElement("xpath", "//span[@id='viewLead_firstName_sp']"), firstname);
	}

}
