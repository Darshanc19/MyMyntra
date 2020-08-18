package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class LoginTest {
	
	WebDriver driver;
	
	@Test
	
	public void validateTest() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=st7qi26gooeh");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoginPage lp=new LoginPage(driver);
		lp.setUserName("admin");
		lp.setPassword("manager");
		lp.clickLogin();
		Enter_Time_Track_Page ep = new Enter_Time_Track_Page(driver);
		ep.clickLogout();
		lp.setUserName("admin");
		lp.setPassword("manager");
		lp.clickLogin();
		ep.clickLogout();
		

	}

}
