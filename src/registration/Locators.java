package registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {


		public static void main(String[] args) {
			 System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
			 driver.get("https://www.fb.com");
			 
			WebElement ele = driver.findElement(By.id("u_0_m"));
			ele.sendKeys("1111111");
	}

}
