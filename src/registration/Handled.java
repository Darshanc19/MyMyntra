package registration;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Handled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		String ty = driver.getWindowHandle();
		System.out.println(ty);
		Thread.sleep(6000);
		Set<String> tr = driver.getWindowHandles();
		System.out.println(tr);
		
		

	}

}
																																																																		