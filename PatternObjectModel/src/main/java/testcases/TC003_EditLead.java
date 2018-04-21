package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_EditLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_EditLead";
		testDescription="login to LeafTaps And EditLeaf";
		testNodes="Leads";
		category="Smoke";
		authors="Kishore T J";
		browserName="chrome";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	public void editLead(String uName,String pwd,String fname,String title,String cname) throws InterruptedException {
			new LoginPage()
			.enterUserName(uName)
			.enterPassword(pwd)
			.clickLogIn()
			.clickcrmsfa()
			.clickLeads()
			.clickfindlead()
			.enterfirstname(fname)
			.clickfindleadbutton()
			.clickfirstresulteditlead()
			.verifytitle(title)
			.clickedit()
			.entercompanyname(cname)
			.clickupate()
			.verifycompanyname(cname);
			
			
			
	}			
				
			
		

}
