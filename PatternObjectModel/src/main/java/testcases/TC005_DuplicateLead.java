package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DuplicateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC005_DuplicateLead";
		testDescription="login to LeafTaps And DuplicateLeaf";
		testNodes="Leads";
		category="Smoke";
		authors="Kishore T J";
		browserName="chrome";
		dataSheetName="TC005";
	}
	@Test(dataProvider="fetchData")
	public void duplicatelead(String uName,String pwd,String email,String fname) throws InterruptedException {
			new LoginPage()
			.enterUserName(uName)
			.enterPassword(pwd)
			.clickLogIn()
			.clickcrmsfa()
			.clickLeads()
			.clickfindlead()
			.clickemail()
			.enteremailaddress(email)
			.clickfindleadbutton()
			.clickfirstresulteditlead()
			.clickduplicate()
			.clickupate()
			.verifyusername(fname);
	}			
				
			
		

}
