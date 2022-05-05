package pomPagae;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillrayloginpage {

	@FindBy(xpath="//a[text()=' GEARS ']")
	private  WebElement gearsbt;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo App ']")
	private WebElement sikllraydemoapp;
	
	@FindBy(name="q")
	private WebElement serachtextbox;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement gobtn;
	
	public  skillrayloginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void serachtextbox(String courseName) {
	serachtextbox.sendKeys(courseName);
	}
	public void serachbtn() {
		gobtn.click();
	}
	
	public void gerasButton() {
		gearsbt.click();
	}
	public void skillrarydemoapplication() {
		sikllraydemoapp.click();
	}
}
