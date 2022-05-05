package genericlib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
public WebDriver driver;
public propertyFile pdate=new propertyFile();
public WebDriverUtilies driverUtilies=new WebDriverUtilies();


@BeforeMethod
public void openApp() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
}
@AfterMethod
public void closeApp(ITestResult result) throws IOException {
	int status=result.getStatus();
	String name=result.getName();
		if(status==2) {
			photo p=new photo();
			p.getphoto(driver,name);
			}
		driver.quit();
}
}
