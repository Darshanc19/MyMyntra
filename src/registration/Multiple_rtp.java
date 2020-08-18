package registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_rtp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	     System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.close();
	     WebDriver driver1= new FirefoxDriver();
	     driver1.quit();

	}

}
