import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CancelRequest {

	public static void main(String[] args) throws InterruptedException {
		
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\git\\Skeps\\Partnership\\exe2files\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		 Thread.sleep(1000);
		  
		  driver.get("http://3.13.0.189/auth/login");
		  
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("support@skeps.com");
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Password@12");
			
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        Thread.sleep(20000);
        
        
        /************************Click on Sell Leads***************************/
  	  WebElement sellleads= driver.findElement(By.xpath("//mat-expansion-panel-header[@page-title='Sell Leads']"));
  	     sellleads.click();
  	     
  	   //  Thread.sleep(1000);
  	     
  	     /**********wait for buyer element ***********************/
  	     
  	     WebDriverWait wait= new WebDriverWait(driver, 20);
  			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//mat-expansion-panel-header[@page-title='Buyers']")));
  	     
  	     WebElement BUYERS=driver.findElement(By.xpath("//mat-expansion-panel-header[@page-title='Buyers']"));
  	     BUYERS.click();
		
        if(driver.getPageSource().contains("LENP"))
        {
        	
        	System.out.println("Lending point is displayed");
        	
        

              // Find the tootip icon at the top right of the header		
       WebElement tootip = driver.findElement(By.xpath("//span[text()='LENP']/../../following-sibling::span[4]/span/span"));	

             //get the value of the "title" attribute of the tooltip icon		
       String actualTooltip = tootip.getAttribute("mattooltip");

            // Assert the tooltip's value is as expected 		
       System.out.println("Actual Title of Tool Tip "+actualTooltip);
       
       
       if(actualTooltip.equals("Add Partner"))
       {
       	WebElement AddPartner=driver.findElement(By.xpath("//span[contains(text(),'LENP')]/../../following-sibling::span[@class='mat-cell action-col']//span[@mattooltip='Add Partner']"));
       	 AddPartner.click();
		      
		      WebElement AddPartnerSubmit=driver.findElement(By.xpath("//button[text()='Submit']"));
		      AddPartnerSubmit.click();
		      
		      WebDriverWait waitforCancelRequest= new WebDriverWait(driver, 20);
		      waitforCancelRequest.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//mat-expansion-panel-header[@page-title='Buyers']")));
		      
		      WebElement tootip2 = driver.findElement(By.xpath("//span[text()='LENP']/../../following-sibling::span[4]/span/span"));
		      
		    //get the value of the "title" attribute of the tooltip icon		
		       String actualTooltipAfterChange = tootip2.getAttribute("mattooltip");

		            // Assert the tooltip's value is as expected 		
		       System.out.println("Actual Title of Tool Tip "+actualTooltipAfterChange);
		       
		       if(actualTooltipAfterChange.equals("Cancel Request"))
		       {
		      
		      WebElement CancelRequest=driver.findElement(By.xpath("//span[contains(text(),'LENP')]/../../following-sibling::span[@class='mat-cell action-col']//span[@mattooltip='Cancel Request']"));
		      CancelRequest.click();
		      
		       }
		       
		       else
		       {
		    	   
		    	   if(actualTooltipAfterChange.equals("Remove Partner"))
		         		 
		         		 System.out.println("Remove Partner option is there");
		         	 
		    	   else
		    	   {
		    		   System.out.println("Add Partner option is there");
		    	   }
		    	   
		       }
		      
       }
       
       
       else
       	
       {
       	
       	 if(actualTooltip.equals("Remove Partner"))
       		 
       		 System.out.println("Remove Partner option is there");
       	 
       	 else
       	 System.out.println("Cancel Request option is there");
       }
    
        }
        
        else
        {
        	System.out.println("Lending Point is not displayed");
        }

	}

}
