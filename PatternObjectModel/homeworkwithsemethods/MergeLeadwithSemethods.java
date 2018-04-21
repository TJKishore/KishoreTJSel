package homeworkwithsemethods;

import org.junit.Test;

import wemethods.ProjectMethods;
public class MergeLeadwithSemethods extends ProjectMethods 
{
@Test
	public void mergelead() throws InterruptedException 
{
	click(locateElement("linktext", "Leads"));
	click(locateElement("linktext", "Merge Leads"));
	click(locateElement("xpath", "(//img[@alt='Lookup'])[1]"));
	switchToWindow(1);
	type(locateElement("xpath", "//label[text()='Lead ID:']/following::input[1]"), "10049");
	click(locateElement("xpath", "//button[text()='Find Leads']"));
	Thread.sleep(2000);
	String fromlead=getText(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
	System.out.println(fromlead);
	click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
	switchToWindow(0);
	Thread.sleep(2000);
	click(locateElement("xpath", "(//img[@alt='Lookup'])[2]"));
	switchToWindow(1);
	type(locateElement("xpath", "//label[text()='Lead ID:']/following::input[1]"), "10055");
	click(locateElement("xpath", "//button[text()='Find Leads']"));
	Thread.sleep(2000);
	String tolead=getText(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
	System.out.println(tolead);
	click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
	switchToWindow(0);
	click(locateElement("linktext", "Merge"));
	acceptAlert();
	click(locateElement("linktext", "Find Leads"));
	type(locateElement("xpath", "//label[text()='Lead ID:']/following::input[1]"), fromlead);
	click(locateElement("xpath", "//button[text()='Find Leads']"));
	String error="No records to display";
	verifyPartialText(locateElement("xpath", "//div[text()='No records to display']']"), error);
	}

}
