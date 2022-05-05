package scripts;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericlib.Baseclass;
import pomPagae.SkillarrayDemoApp;
import pomPagae.TestingPage;
import pomPagae.skillrayloginpage;

public class Testcase2  extends Baseclass{
	@Test
	public void tc2() {
	skillrayloginpage s=new skillrayloginpage(driver);
		s.gerasButton();
		s.skillrarydemoapplication();
		
		SkillarrayDemoApp sd=new SkillarrayDemoApp(driver);
		driverUtilies.switchingTabs(driver);
		driverUtilies.dropDown(sd.getAddressdd(),pdata.getPropertyfiledata("dropdown"));
		
		TestingPage t=new TestingPage(driver);
		driverUtilies.draganddrop(driver,t.getSeleniumtaring(),t.getCart());
		Point loc=t.getCart().getLocation();
		int x=loc.getX();
		int y=loc.getY();
		driverUtilies.scrollBar(driver,x,y);
	}

}
