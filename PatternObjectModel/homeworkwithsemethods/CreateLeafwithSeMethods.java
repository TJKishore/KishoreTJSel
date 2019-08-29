package homeworkwithsemethods;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import wemethods.ProjectMethods;
public class CreateLeafwithSeMethods extends ProjectMethods {
	@Test(dataProvider="fetchdata")
	public  void createleaf(String Companyname,String fname,String lname,String email,String phoneno) 
	{
		// TODO Auto-generated method stuasas
		click(locateElement("linktext", "Leads"));
		click(locateElement("linktext", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), Companyname);
		type(locateElement("id", "createLeadForm_firstName"), fname);
		type(locateElement("id", "createLeadForm_lastName"), lname);
		type(locateElement("id", "createLeadForm_primaryEmail"), email);
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), phoneno);
		click(locateElement("class", "smallSubmit"));	
	}
	@DataProvider(name="fetchdata")
	public Object[][] getdata()
	{
		Object[][] data=new Object[2][5];
		data[0][0]="TestLeaf";
		data[0][1]="Guru";
		data[0][2]="rajan";
		data[0][3]="Guru@testleaf.com";
		data[0][4]="8978593999";
		data[1][0]="TestLeaf";
		data[1][1]="Kishoreaaa";
		data[1][2]="TJ";
		data[1][3]="kishoretj@testleaf.com";
		data[1][4]="8978593997";
		return data;					
	}

}
