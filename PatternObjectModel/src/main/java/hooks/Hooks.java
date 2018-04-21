package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hooks extends SeMethods {
	public String browserName;
	@Before
	public void before(){
		startResult();
		startTestModule("Mergelead", "Merge Lead Description");
		test = startTestCase("Mergelead");
		test.assignCategory("smoke");
		test.assignAuthor("Kishore");
		startApp("chrome");	
	}
	
	@After
	public void afterSuite(){
		endResult();
		closeAllBrowsers();
	}
}