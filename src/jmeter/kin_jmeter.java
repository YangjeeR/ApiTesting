package jmeter;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import org.openqa.selenium.JavascriptExecutor;


public class kin_jmeter {
	
	//@Test
	public void Setup() 
	{
		
		try
		{
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Acer\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("http://kinstaging.graphenecreative.co.uk/");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/header/div/div[1]/div[3]/div/a[2]")).click();// click on signup tab
	   //driver.findElement(By.xpath("//*[@id=\"loginModal\"]/div/div/div[3]/a")).click();//click on sign up link in form
	   
	   driver.findElement(By.id("first-name")).sendKeys("Test");
	   driver.findElement(By.id("last-name")).sendKeys("Test");
	   driver.findElement(By.id("username")).sendKeys("TestY");
	   driver.findElement(By.id("email")).sendKeys("Test@gmail.com");
	   driver.findElement(By.id("password")).sendKeys("Test");
	   driver.findElement(By.id("confirm-password")).sendKeys("Test");
	   ((JavascriptExecutor) driver).executeScript("scroll(0,500);");
	  
	   /*driver.findElement(By.id("upload-file-info")).click();
	  // driver.switchTo().activeElement().sendKeys("C:\\Users\\Acer\\Desktop\\newpark\\images\\crop1.jpg");
	   Robot r = new Robot();
	   r.keyPress(KeyEvent.VK_C);        // C
	   r.keyRelease(KeyEvent.VK_C);
	   r.keyPress(KeyEvent.VK_COLON);    // : (colon)
	   r.keyRelease(KeyEvent.VK_COLON);
	   r.keyPress(KeyEvent.VK_SLASH);    // / (slash)
	   r.keyRelease(KeyEvent.VK_SLASH);
	   // etc. for the whole file path

	   r.keyPress(KeyEvent.VK_ENTER);    // confirm by pressing Enter in the end
	   r.keyRelease(KeyEvent.VK_ENTER);
	   */
	   driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[2]/div/div[2]/form/div[7]/button")).click();
	   
	   if(driver.getTitle().equals("User Login :: Kilmainham Inchicore Network, Dublin, Ireland - KIN"))
	   {
		   System.out.println("User is successfully registered.");
	   }
	   else
	   {
		   System.out.println("User is not able to register.");
	   }
	   
	   
		
	}
	
		catch (Throwable ex) {
		    System.out.println(ex.getMessage());
		  

	}
		
	}
}
