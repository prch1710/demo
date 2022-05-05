package scripts;

import org.testng.annotations.Test;

import genericlib.Baseclass;
import pomPagae.AddtoCart;
import pomPagae.SkillarrayDemoApp;
import pomPagae.skillrayloginpage;

public class Testcase extends Baseclass{
	@Test
	public void tc1() {
		 skillrayloginpage s=new skillrayloginpage(driver);
		s.gerasButton();
		s.skillrarydemoapplication();
		
		 SkillarrayDemoApp sd=new SkillarrayDemoApp(driver);
		driverUtilies.switchingTabs(driver);
		driverUtilies.mouseHove(driver,sd.getCousetab());
		sd.seleniumtrainingbtn();
		
		AddtoCart a=new AddtoCart(driver);
	driverUtilies.doubleClick(driver, a.getAdd());
		a.addtocart();
	}

}
