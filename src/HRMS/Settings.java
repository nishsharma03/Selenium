package HRMS;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;


public class Settings {
	
	 public static void main(String[] args) throws InterruptedException
	 {
		 
		 
	        System.setProperty("webdriver.chrome.driver","C:/Users/Zimyo/workspace/Zimyo 2.0/latest/chromedriver.exe");  
	 
	        WebDriver driver=new ChromeDriver();
	        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	           
	        driver.get("http://bharatglass.nijomeeapps.com/login.aspx");
	        WebElement Loginfield = driver.findElement(By.xpath("//input[@name='user']"));
	        Loginfield.sendKeys("anshu.bhatla@fabframe.in");
	         driver.findElement(By.xpath("//input[@name='password']")).sendKeys("anshu@2017");
	         driver.findElement(By.xpath("//input[@name='btnLogin']")).clear();
	        
	         
		 
		 
		 
	 }

}
