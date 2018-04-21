package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_DeleteLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC004_DeleteLead";
		testDescription="login to LeafTaps And DeleteLeaf";
		testNodes="Leads";
		category="Smoke";
		authors="Kishore T J";
		browserName="chrome";
		dataSheetName="TC004";
	}
	@Test(dataProvider="fetchData")
	public void deleteLead(String uName,String pwd,String phoneno,String fromlead,String erroremsg) throws InterruptedException {
			new LoginPage()
			.enterUserName(uName)
			.enterPassword(pwd)
			.clickLogIn()
			.clickcrmsfa()
			.clickLeads()
			.clickfindlead()
			.clickphoneno()
			.enterphonenumber(phoneno)
			.clickfindleadbutton()
			.clickfirstresulteditlead()
			.clickdelete()
			.clickfindlead()
			.enterfindlead(fromlead)
			.clickfindleadbutton()
			.verifyerrormsg(erroremsg);
			
			
			
			
			
			
	}			
				
			
		

}
