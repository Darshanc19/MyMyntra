package popups;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Disable_Popups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.hdfc.com");
		driver.close();

	}

}
