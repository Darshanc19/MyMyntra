package registration;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key="webdriver.gecko.driver";//pre-conditions
		String value="./software/geckodriver.exe";
        System.setProperty(key, value);
        
        new FirefoxDriver();
	
	}
}

