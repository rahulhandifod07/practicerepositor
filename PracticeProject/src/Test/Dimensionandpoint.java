package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Dimensionandpoint {

	public static void main(String[] args) throws InterruptedException {
	
//		System.setProperty("webdriver.chrome.driver", "D:\\Git Repo New\\PracticeProject\\Drivers\\chromedriver.exe");
////		ChromeOptions op=new ChromeOptions();
////		op.addArguments("--incognito");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.flipkart.com/search?q=books&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off");
//		Thread.sleep(3000);
//		String bookName="Rich Dad Poor Dad";
//		String price=driver.findElement(By.xpath("//a[@title='"+bookName+"']/following-sibling::a/descendant::div[@class='_30jeq3']")).getText();
//        System.out.println(price);
		//		driver.navigate().to("https://www.yahoo.com");
//		Thread.sleep(3000);
//		driver.navigate().back();
//		Thread.sleep(3000);
//		driver.navigate().forward();
//		Dimension d=new Dimension(500,900);
//		driver.manage().window().setSize(d);
//		Point p=new Point(800,300);
//		driver.manage().window().setPosition(p);
		
		
		//resize 
	System.setProperty("webdriver.chrome.driver", "D:\\Git Repo New\\PracticeProject\\Drivers\\chromedriver.exe");
	
	
//	driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
//	Thread.sleep(3000);
//	Actions a=new Actions(driver);
//	WebElement ele=driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
//	a.dragAndDropBy(ele,200,200).build().perform();
//	String BookName="Std 10th History And Political Science Important Question Bank (IQB) Book | English Medium | Most Likely Questions With Solutions | SSC Maharashtra State Board | New Paper Pattern";
//	driver.get("https://www.flipkart.com/search?q=history%20book%2010th&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
//    Thread.sleep(3000);
//    WebElement ele=driver.findElement(By.xpath("//a[@title='"+BookName+"']/following-sibling::a[@class='_8VNy32']/descendant::div[@class='_30jeq3']"));
//    System.out.println(ele.getText());
	WebDriver driver=new ChromeDriver();
	//driver.get("https://www.flipkart.com/search?q=book&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
	driver.get("file:///F:/IT%20sector/Front%20end%20developer/First%20website/Temp1.html");
	//	boolean a=true;
//	while(a)
//	{
//    try 
//    {
//    	driver.findElement(By.xpath("//input[@id='DOB']")).sendKeys("22/02/2022");
//    	break;
//    }
//	catch(Exception e)
//    {
//		System.out.println("not in this frame");
//		driver.switchTo().frame(0);
//    }
//	}
	WebElement ele1=driver.findElement(By.xpath("//button[text()='click me']"));
	//System.out.println(ele1.getText());
	System.out.println(ele1.isEnabled());
	
	}

}
