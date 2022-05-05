package scripts;

import org.testng.annotations.Test;

import genericlib.Baseclass;
import pomPagae.AddtowishlistPage;
import pomPagae.CorejavaPage;
import pomPagae.skillrayloginpage;

public class testcase3  extends Baseclass{
@Test
public void tc3() {
skillrayloginpage s=new skillrayloginpage(driver);
s.serachbtn(pdata.getPropertyfiledata("course"));
s.serachbtn();

CorejavaPage c=new CorejavaPage(driver);
c.corejavacourse();

AddtowishlistPage a=new AddtowishlistPage(driver);
driverUtilies.switchFrames(driver);
a.playButton();
a.pausebutton();
driverUtilies.switchBackFrame(driver);
a.addtowishlistbtn();
}
}
