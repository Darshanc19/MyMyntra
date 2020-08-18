package pom;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Test {
	
	@test
	public void validateTest() {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://localhost/login.do");
		Login_Page lp=new Login_Page(driver);
		lp.clickLogin();
		driver.navigate().refresh();
		lp.clickLogin();
		driver.navigate().refresh();
		driver.close();
 
		
	}
	
	

}
