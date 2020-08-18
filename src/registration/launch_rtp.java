package registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_rtp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com");
		WebElement path = driver.findElement(By.xpath("//h2[.='Best of Appliances ']"));
		String tooltip = path.getAttribute("title");
		System.out.println(tooltip);
		String url = path.getAttribute("href");
		System.out.println(url);
	}

}
