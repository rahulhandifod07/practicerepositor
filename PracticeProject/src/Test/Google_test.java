package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_test {

	public static void main(String[] args) throws InterruptedException {
		 String color;
		System.setProperty("webdriver.chrome.driver", "D:\\Git Repo New\\PracticeProject\\Drivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 WebElement ele= driver.findElement(By.xpath("//input[@name='q']"));
		 WebElement ele1= driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/descendant::input[@name='btnK' and @class='gNO89b']"));
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 //here we use send key from js
		// js.executeScript("arguments[0].value='automation';", ele);
		 Thread.sleep(2000);
		 //here we use click on element using js executor
		// js.executeScript("arguments[0].click()", ele1);
			//here we apply border to particular element 
//		 js.executeScript("arguments[0].style.border='3px solid red'", ele1);
//	
//		 String bgcolour =ele1.getCssValue("backgroundColor");
//		 for(int i=1;i<500;i++)
//		 {
//			
//			 if(i%2==0)
//			 {
//				 color=bgcolour;
//				 Thread.sleep(1000);
//			 }
//			 else
//			 {
//				 color="#000000";
//				 Thread.sleep(1000);
//			 }
//		
//		//here we change the background color 
//			js.executeScript("arguments[0].style.backgroundColor=' "+color+"'", ele1);
		 
			String Title= js.executeScript("return document.title;").toString();
			System.out.println(Title);
			//alart using js
			try
			{
			js.executeScript("alert('yeee browser launch')");
			}
			catch(Exception e)
			{
			System.out.println("alert open");
			}
			driver.switchTo().alert().accept();
			//this is for refresh page
			js.executeScript("arguments[0].value='book';", ele);
			Thread.sleep(1000);
			//js.executeScript("history.go(0)");
			js.executeScript("arguments[0].click()", ele1);
			WebElement elementtoview=driver.findElement(By.xpath("//div[@class='Kav30b diAzE']/descendant::span[@class='q8U8x']"));
			//js for  scroll to that element 
			js.executeScript("arguments[0].scrollIntoView(true);",elementtoview );
			js.executeScript("arguments[0].style.border='3px solid red'",elementtoview );
			js.executeScript("arguments[0].style.backgroundColor='#48abc7'", elementtoview);
		 }
		
	
		
		
		
		
		
		 
		 
	}


