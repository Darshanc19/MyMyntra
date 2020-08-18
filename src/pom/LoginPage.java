package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declaration
	@FindBy(id="loginButton")
	private WebElement loginBtn;
	
	@FindBy(name="username")
	private WebElement unameTxtBox;
	
	@FindBy(name="pwd")
	private WebElement pwdTxtBox;
	
	//initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void setUserName(String uname) {
		unameTxtBox.sendKeys(uname);
		
	}
	
	public void setPassword(String pword) {
		pwdTxtBox.sendKeys(pword);
		
	}
	public void clickLogin() {
		loginBtn.click();
	}

}
