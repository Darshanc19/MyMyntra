package locators;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokens {
	
	public static void verifylink(String link) {
		// TODO Auto-generated method stub
		try
		{
			URL url =new URL(link);
			HttpURLConnection httpCon=(HttpURLConnection) url.openConnection();
			httpCon.connect();
			
			if(httpCon.getResponseCode()==200) {
				System.out.println(link+" - "+httpCon.getResponseMessage());
				
			}
			else {
				System.out.println(link+" - "+httpCon.getResponseMessage());
			}
		}
			catch (Exception e) {
				System.out.println("handled");
			}
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		List<WebElement> links= driver.findElements(By.xpath("//a"));
		for(WebElement we:links)
		{
			 String url = we.getAttribute("href");
			 verifylink(url);

	    }

}

}