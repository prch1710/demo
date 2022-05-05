package pomPagae;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	@FindBy(xpath="(//a[text()='Selenium Training'])")
	private WebElement seleniumtaring;
	
	@FindBy(id="mycart")
	private WebElement cart;
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebook;
	
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getSeleniumtaring() {
		return seleniumtaring;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getFacebook() {
		return facebook;
	}
	public void facebookicon() {
		facebook.click();
	}

}
