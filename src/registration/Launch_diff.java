package registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_diff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
        new ChromeDriver();
        new FirefoxDriver();
        
        WebDriver driver= new ChromeDriver();
        driver.getCurrentUrl();
        
        
	}

}
