package registration;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_browser {

	public static void main(String[] args) {
	
		String key="webdriver.chrome.driver";//pre-conditions
		String value="./software/chromedriver.exe";
        System.setProperty(key, value);
        
        new ChromeDriver();
	}
}
