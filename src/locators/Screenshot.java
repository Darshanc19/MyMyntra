package locators;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		 TakesScreenshot sh = (TakesScreenshot)driver;
		  File ran = sh.getScreenshotAs(OutputType.FILE);
		  File ijh = new File("E://scrnst.jpeg");
		  FileHandler.copy(ran, ijh);
		  
		  driver.close();
		  

}
}
