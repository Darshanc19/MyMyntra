package registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.fb.com");
		 driver.manage().window().maximize();

	}

}
