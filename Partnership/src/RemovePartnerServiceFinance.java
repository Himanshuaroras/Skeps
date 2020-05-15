import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RemovePartnerServiceFinance {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\git\\mylocalrepository\\Partnership\\exe2files\\chromedriver.exe");
		
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
        
       WebElement NotificationIcon= driver.findElement(By.xpath("//fa-icon[@class='notification-bell ng-fa-icon']"));
       NotificationIcon.click();

     
       
      List<WebElement> notifylistTime= driver.findElements(By.xpath("//div[@class='dropdown-menu dropdown-menu-right notification-box show']//div[@class='content-box ng-star-inserted']/div[1]/following-sibling::div[text()='You have been removed as a Seller']/parent::div[1]//div[text()='LENP']/following-sibling::div[@class='message-date']"));
      
      
      int listsize=notifylistTime.size();
      System.out.println(notifylistTime.get(0).getText());
      
    List<WebElement> notifylistText  =driver.findElements(By.xpath("//div[@class='dropdown-menu dropdown-menu-right notification-box show']//div[@class='content-box ng-star-inserted']/div[1]/following-sibling::div[text()='You have been removed as a Seller']/parent::div[1]//div[text()='LENP']"));

    System.out.println(notifylistText.get(0).getText());
    
    List<WebElement> NotifyRemovePartnerText=driver.findElements(By.xpath("//div[@class='dropdown-menu dropdown-menu-right notification-box show']//div[@class='content-box ng-star-inserted']/div[1]/div[text()='LENP']/parent::div[1]/following-sibling::div[text()='You have been removed as a Seller']"));
   
    if(NotifyRemovePartnerText.get(0).getText().contains("You have been removed as a Seller"))
    {
    System.out.println(" Notification Text verified");
    }
    else
    {
    	System.out.println(" Notification  Text is not verified");
    }
    //      for (WebElement webElement : notifylist) {
//		
//	}
    
    
	 WebElement sellleads= driver.findElement(By.xpath("//mat-expansion-panel-header[@page-title='Sell Leads']"));
     sellleads.click();
     
   //  Thread.sleep(1000);
     
     /**********wait for buyer element ***********************/
     
     WebDriverWait wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//mat-expansion-panel-header[@page-title='Buyers']")));
     
     WebElement BUYERS=driver.findElement(By.xpath("//mat-expansion-panel-header[@page-title='Buyers']"));
     BUYERS.click();
    
     /**********Store the LENP status in string ***********************/
       String lenpStatus= driver.findElement(By.xpath("//span[text()='LENP']/../../following-sibling::span[1]/following-sibling::span[1]")).getText();
     
    if(lenpStatus.equals(" Inactive"))
   
    {
    	System.out.println("LENP is inactive");
	}
    
    else
    {
    	
    	if (lenpStatus.equals("Pending"))
    	{
    		System.out.println("Pending request for LENP ");
    		
    		 // Find the tooltip icon at the top right of the header		
            WebElement tooltip = driver.findElement(By.xpath("//span[text()='LENP']/../../following-sibling::span[4]/span/span[1]"));	
            
            //get the value of the "title" attribute of the tooltip icon		
            String actualTooltip = tooltip.getAttribute("mattooltip");	
            
            //Assert the tooltip's value is as expected 		
            System.out.println("Actual Title of Tool Tip"+actualTooltip);
    		
    		
    		
    	}
    	
    	else {
    		System.out.println("LENP is active");
    	
    	}
    }
    
    Thread.sleep(1000);
	Actions action = new Actions(driver);
	
	WebElement MESSAGES=driver.findElement(By.xpath("//mat-expansion-panel-header[@page-title='Messages']"));
	action.moveToElement(MESSAGES).perform();
	
	Thread.sleep(1000);
	
	action.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
	action.moveToElement(MESSAGES).click().perform();

	//Messages.click();
	
	action.moveToElement(MESSAGES).perform();
	Thread.sleep(1000);
	
	WebElement ServiceFinanceInbox=driver.findElement(By.xpath("//mat-expansion-panel-header[@page-title=\"Inbox\"]/span/p"));
	ServiceFinanceInbox.click();
	
	   Thread.sleep(3000);
	   
	   driver.navigate().refresh();
	      
	
	 Thread.sleep(2000);
     WebElement LENPRemoveSellerMessage=    driver.findElement(By.xpath("//div[text()='You have been removed as a Seller ']/preceding-sibling::div[@class='partner-name-wrap']//span[text()='LENP ']"));
     
     action.moveToElement(LENPRemoveSellerMessage).click().perform();
     
     
     String InboxLENPRemoveSellerMessage=driver.findElement(By.xpath("//span[@class='partner-name'][contains(text(),'LENP')]/../following-sibling::div[1]//div[contains(text(),'Lending Point')]")).getText();
    
    System.out.println(InboxLENPRemoveSellerMessage);
    
   String date =driver.findElement(By.xpath("//span[@class='partner-name'][contains(text(),'LENP')]/../following-sibling::div[1]//div[contains(text(),'Lending Point')]/preceding-sibling::div[1]/p/span[1]")).getText();
   
   System.out.println(date);
	}
	
	
	


}
