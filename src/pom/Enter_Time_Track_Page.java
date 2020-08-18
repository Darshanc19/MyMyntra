package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Enter_Time_Track_Page {

		@FindBy(id="logoutLink")
		private WebElement logout;

	public Enter_Time_Track_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickLogout() {
		logout.click();
	}
		
	

}
