package homeworkwithsemethods;
import org.junit.Test;

import wemethods.ProjectMethods;


public class EditLeadwithSemethods extends ProjectMethods {
	@Test
	public void editlead() throws InterruptedException 
	{
		// TODO Auto-generated method stub
		click(locateElement("linktext", "Leads"));
		click(locateElement("linktext", "Find Leads"));
		type(locateElement("xpath", "//label[text()='Lead ID:']/following::input[2]"), "K");
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(2000);
		String fromlead=getText(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		System.out.println(fromlead);
		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		String exceptedtitle="View Lead";
		verifyExactText(locateElement("xpath", "//div[text()='View Lead']"), exceptedtitle);
		click(locateElement("linktext", "Edit"));
		clear(locateElement("xpath", "//input[@id='updateLeadForm_companyName']"));
		type(locateElement("xpath", "//input[@id='updateLeadForm_companyName']"), "TCS");
		click(locateElement("xpath", "//Input[@class='smallSubmit'][1]"));
		String exceptedcompany="TCS";
		verifyExactText(locateElement("xpath", "//span[@id='viewLead_companyName_sp']"), exceptedcompany);
		
	}

}
