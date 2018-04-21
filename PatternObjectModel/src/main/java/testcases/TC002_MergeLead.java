package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_MergeLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC002_MergeLead";
		testDescription="login to LeafTaps And MergeLeaf";
		testNodes="Leads";
		category="Smoke";
		authors="Kishore T J";
		browserName="chrome";
		dataSheetName="TC002";
	}
	@Test(dataProvider="fetchData")
	public void mergeLead(String uName,String pwd,String fromleadid,String toleadid,String errormsg) {

		try {
			new LoginPage()
			.enterUserName(uName)
			.enterPassword(pwd)
			.clickLogIn()
			.clickcrmsfa()
			.clickLeads()
			.clickmergelead()
			.clicknearfromlead()
			.enterlead(fromleadid)
			.clickfindleads()
			.clickfirstresultlead()
			.clickneartolead()
			.enterlead(toleadid)
			.clickfindleads()
			.clickfirstresultlead()
			.clickmerge()
			.acceptalerts()
			.clickfindlead()
			.enterfindlead(fromleadid)
			.clickfindleadbutton()
			.verifyerrormsg(errormsg);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

}
}
