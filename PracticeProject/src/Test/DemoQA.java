package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQA {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Git Repo New\\PracticeProject\\Drivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demoqa.com");
		 Thread.sleep(2000);
		 Thread.sleep(2000);//new change
		 Thread.sleep(2000);//new changecommit
		
		  for(int i=1;i<=6;i++)
		  {
			  try
				 {
				  driver.findElement(By.id("close-fixedban")).click();
				 }
				 catch(Exception e)
				 {
					 System.out.println("popup element not available");
				 }
//			  WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
//			  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='card-body']/h5)[\"+i+\"]")));
			  //wait.until(ExpectedConditions.el(By.xpath("(//div[@class='card-body']/h5)[\"+i+\"]")));
			   
			  WebElement ele1=driver.findElement(By.xpath("(//div[@class='card-body'])["+i+"]"));
			  JavascriptExecutor js = (JavascriptExecutor)driver;
			  js.executeScript("arguments[0].click()", ele1);
		     
		      System.out.println("Path first : (//div[@class='card-body'])["+i+"]");
		      Thread.sleep(6000);
		      driver.navigate().back();
		      Thread.sleep(3000);
		  }
	}

}
