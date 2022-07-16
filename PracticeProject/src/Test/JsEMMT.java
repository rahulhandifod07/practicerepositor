package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsEMMT {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Git Repo New\\PracticeProject\\Drivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.makemytrip.com/");
		 WebElement fromCity=driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']"));
		 WebElement fromCityOption=driver.findElement(By.xpath("//label[@for='fromCity']/child::span[@class='lbl_input latoBold  appendBottom5']"));
	
		 WebElement toCity=driver.findElement(By.id("toCity"));
		
		 WebElement search=driver.findElement(By.xpath("//a[contains(text(),'Search')]"));
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click()",fromCityOption);
		 Thread.sleep(3000);
		 js.executeScript("arguments[0].value='mumbai';", fromCity);
		 
//		 js.executeScript("arguments[0].value='Delhi';", toCity);
//		 js.executeScript("arguments[0].click()",search);
		 

	}

}



a.amend(





