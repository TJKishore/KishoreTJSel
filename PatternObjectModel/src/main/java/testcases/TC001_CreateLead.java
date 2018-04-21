package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC001_CreateLead";
		testDescription="login to LeafTaps And CreateLeaf";
		testNodes="Leads";
		category="Smoke";
		authors="Kishore T J";
		browserName="chrome";
		dataSheetName="TC001";
	}
	@Test(dataProvider="fetchData")
	public void createLead(String uName,String pwd,String companyname,String fname,String lname) {

		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickcrmsfa()
		.clickLeads()
		.clickcreatelead()
		.enterCompanyname(companyname)
		.enterFirstname(fname)
		.eleLastname(lname)
		.clicksubmit()
		.verifyusername(fname);
	}	




}
