package homeworkwithsemethods;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import wemethods.SeMethods;

public class LearnWebtablewithSemethods extends SeMethods {
@Test
	public void erail() {
		// TODO Auto-generated method stub
		startApp("chrome", "https://erail.in/");
		typeandtab(locateElement("id", "txtStationFrom"), "MS");
		typeandtab(locateElement("id", "txtStationTo"), "MDU");
		verifySelected(locateElement("id", "chkSelectDateOnly"));
		click(locateElement("id", "chkSelectDateOnly"));
		WebElement table = locateElement("xpath", "//table[@class='DataTable TrainList']");
		webTable(table, 1);
	
	}

}
