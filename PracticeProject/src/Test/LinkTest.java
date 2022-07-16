package Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Git Repo New\\PracticeProject\\Drivers\\chromedriver.exe");
		 WebDriver obj=new ChromeDriver();
		  obj.manage().window().maximize();
		  obj.get("https://demoqa.com/broken");
		  List<WebElement> linkset = obj.findElements(By.tagName("a"));
		 
		  
		  for(int i=0;i<linkset.size();i++)
		  {
			  WebElement ele=linkset.get(i);
			  String url=ele.getAttribute("href");
			  System.out.println(url);
			  verifyLinkActive(url);
		  }
	}

	
	
		public static void verifyLinkActive(String link)
		{
			
			   
				try {
					URL url = new URL(link);
					HttpURLConnection httpURLConnection=(HttpURLConnection)url.openConnection();
					httpURLConnection.setConnectTimeout(3000);
					httpURLConnection.connect();
					if(httpURLConnection.getResponseCode()==200)
					{
						System.out.println(link+"-"+httpURLConnection.getResponseMessage());
					}
					if(httpURLConnection.getResponseCode()>400)
					{
						System.out.println(link+"-"+httpURLConnection.getResponseMessage()+"-"+httpURLConnection.HTTP_NOT_FOUND);
					}
				} catch (IOException e) {
					System.out.println(link+ "link is broken");
				}
				
			
			
}}
