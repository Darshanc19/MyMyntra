package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Staled_Pgm {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		WebElement ele = driver.findElement(By.id("email"));
		ele.click();
		driver.navigate().refresh();
		ele.click();
		driver.navigate().refresh();
		
	}

}
