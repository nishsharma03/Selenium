package loginScenrios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class logintestCases {

	public WebDriver driver= new ChromeDriver();
	
	  @Test
	  public void loginPositiveCase() {
		  
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Parmod@yopmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("4eogqkwym5");
		driver.findElement(By.xpath("//button[@class='MuiButton-label css-8xplcm-MuiButton-label']")).click();
		 String afterLogin = driver.findElement(By.xpath("//button[@class='w-100 flex-between-center css-1a8w37c']")).getText();
		 System.out.println("afterLogin="+afterLogin);
         Assert.assertEquals(afterLogin,"All Apps");
	  }
         
         @Test 
         public void Registration() {
        	 driver.findElement(By.xpath("//button[@class='MuiTypography-root MuiTypography-body1 MuiLink-root MuiLink-underlineNone MuiLink-button css-6gr88k-MuiTypography-root-MuiLink-root']")).click();
             driver.findElement(By.xpath("//input[@name='fullName']")).sendKeys("NishthaTWO");
             driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Nishthasharma@test2gmail.com");
             driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys("Nishtha PVT LTD");
            driver.findElement(By.xpath("demo-dialog-select")).click();
            driver.findElement(By.xpath("//Li[@data-value= '971']")).click();
             driver.findElement(By.xpath("//input[@name='phone_number']")).sendKeys("8979697959");
             WebElement city = driver.findElement(By.xpath("//input[@class='MuiOutlinedInput-input MuiInputBase-input MuiInputBase-inputAdornedEnd MuiAutocomplete-input MuiAutocomplete-inputFocused MuiAutocomplete-input MuiAutocomplete-inputFocused css-d2rydc-MuiInputBase-input-MuiOutlinedInput-input']"));
             city.sendKeys("Pune");
             //Thread.sleep(3000);
             city.sendKeys(Keys.ARROW_DOWN,Keys.RETURN);
             //Thread.sleep(3000);
             driver.findElement(By.xpath("//button[@class='MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButtonBase-root w-100 css-1jsa3jf-MuiButtonBase-root-MuiButton-root']")).click();
           WebElement AfterRegister = driver.findElement(By.xpath("//button[@class='MuiTypography-root MuiTypography-h6 MuiLink-root MuiLink-underlineNone MuiLink-button css-9e2fkj-MuiTypography-root-MuiLink-root']"));
             Assert.assertTrue(AfterRegister.isDisplayed(),"Sign-up failed");
         }	 
         
         @Test
         public void forgetPassword() {
        	 driver.findElement(By.xpath("//button[@class='MuiTypography-root MuiTypography-body1 MuiTypography-alignRight MuiLink-root MuiLink-underlineNone MuiLink-button w-auto css-5gf09p-MuiTypography-root-MuiLink-root']")).click();
        	 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Nishthasharma@test2gmail.com");
        	 driver.findElement(By.xpath("//button[@class='MuiButton-label css-8xplcm-MuiButton-label']")).click();
        	 
         }
          
         @Test
       	 public void Clockin() throws InterruptedException {
       		  
       		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Parmod@yopmail.com");
       		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("4eogqkwym5");
       		driver.findElement(By.xpath("//button[@class='MuiButton-label css-8xplcm-MuiButton-label']")).click();
       	    Thread.sleep(3000);
       	    driver.findElement(By.xpath("//button[@class='app-tab cursor-pointer']")).click();
       	    driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary css-y3g7zt-MuiButtonBase-root-MuiTab-root']")).click();
        	driver.findElement(By.xpath("//button[@class='MuiButton-label css-8xplcm-MuiButton-label']")).click();
         }       	
         
	  
	  
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Zimyo\\workspace\\Zimyo 2.0\\chromedriver_win32/chromedriver.exe");  
		 
	     // driver=new ChromeDriver();
	     // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	          driver.get("http://admin.zimyo.com");
	          
	          
	  }
         }
	      


