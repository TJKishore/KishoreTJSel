package homeworkwithsemethods;
import org.testng.annotations.Test;
import wemethods.ProjectMethods;

public class DeleteLeadwithSemethods extends ProjectMethods {
	@Test
	public void deletelead() throws InterruptedException {
		// TODO Auto-generated method stub
		
		click(locateElement("linktext", "Leads"));
		click(locateElement("linktext", "Find Leads"));		
		click(locateElement("xpath", "//span[text()='Phone']"));
		type(locateElement("xpath", "//input[@name='phoneNumber']"), "99");
		click(locateElement("xpath", "//button[text()='Find Leads']"));		
		Thread.sleep(2000);
		String fromlead=getText(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		System.out.println(fromlead);
		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		click(locateElement("linktext", "Delete"));
		click(locateElement("linktext", "Find Leads"));
		type(locateElement("xpath", "//label[text()='Lead ID:']/following::input[1]"), fromlead);
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(2000);
		String exceptedmsg="No records to display";
		verifyPartialText(locateElement("xpath", "//div[text()='No records to display']"), exceptedmsg);
		
	}

}
