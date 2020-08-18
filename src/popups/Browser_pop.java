package popups;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_pop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		Thread.sleep(20000);
		Set<String> opts = driver.getWindowHandles();
		for (String str : opts) {
			driver.switchTo().window(str);
			String title = driver.getTitle();
			if (title.contains("HSBC")) {
				driver.close();
				
			}
			
		}

	}

}
