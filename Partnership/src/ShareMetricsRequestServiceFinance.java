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

public class ShareMetricsRequestServiceFinance {

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
        WebElement NotificationIcon= driver.findElement(By.xpath("//fa-icon[@class='notification-bell ng-fa-icon']"));
        NotificationIcon.click();

      
        
       List<WebElement> notifylistTime= driver.findElements(By.xpath("//div[@class='dropdown-menu dropdown-menu-right notification-box show']//div[@class='content-box ng-star-inserted']/div[1]/following-sibling::div[text()='Share Metrics has been requested by Lending Point (Buyer)']/parent::div[1]//div[text()='Deactivated']/following-sibling::div[@class='message-date']"));
       
       
       int listsize=notifylistTime.size();
       System.out.println(notifylistTime.get(0).getText());
       
     List<WebElement> notifylistText  =driver.findElements(By.xpath("//div[@class='dropdown-menu dropdown-menu-right notification-box show']//div[@class='content-box ng-star-inserted']/div[1]/following-sibling::div[text()='Share Metrics has been requested by Lending Point (Buyer)']/parent::div[1]//div[text()='Deactivated']"));

     System.out.println(notifylistText.get(0).getText());
     
     
     Thread.sleep(1000);
		Actions action = new Actions(driver);
		
		WebElement Messages=driver.findElement(By.xpath("//mat-expansion-panel-header[@page-title='Messages']"));
		action.moveToElement(Messages).perform();
		
		Thread.sleep(1000);
		
		action.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		action.moveToElement(Messages).click().perform();
	
		//Messages.click();
		
		action.moveToElement(Messages).perform();
		Thread.sleep(1000);
		WebElement Inbox=driver.findElement(By.xpath("//mat-expansion-panel-header[@page-title=\"Inbox\"]/span/p"));
		Inbox.click();
		
		Thread.sleep(3000);
		
		 driver.navigate().refresh();
		 
		 Thread.sleep(2000);
	     WebElement LENPShareMetricsMessage=    driver.findElement(By.xpath("//div[text()='Share Metrics has been requested by Lending Point (Buyer) ']/preceding-sibling::div[@class='partner-name-wrap']//span[text()='Deactivated ']"));
	     
	     action.moveToElement(LENPShareMetricsMessage).click().perform();
	     
	     
	     String InboxLENPShareMetricsMessage=driver.findElement(By.xpath("//span[@class='partner-name'][contains(text(),' Deactivated ')]/../following-sibling::div[1]//div[contains(text(),'Lending Point')]")).getText();
	    
	    System.out.println(InboxLENPShareMetricsMessage);
	    
	   String date =driver.findElement(By.xpath("//span[@class='partner-name'][contains(text(),' Deactivated ')]/../following-sibling::div[1]//div[contains(text(),'Lending Point')]/preceding-sibling::div[1]/p/span[1]")).getText();
	   
	   System.out.println(date);
	   
	   //Share metrics request acceptance
	   
	//  WebElement ShareMetricsAcceptance= driver.findElement(By.xpath("//span[@class='partner-name'][contains(text(),' Deactivated ')]/../following-sibling::div[1]//div[contains(text(),'Lending Point')]/preceding-sibling::div[1]/p/span[1]/..//span[2]/span/fa-icon[@mattooltip='Accept']"));
	 // ShareMetricsAcceptance.click();     
	  
	  
     
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
	        	
	        	System.out.println("Lending Point is displayed");
	        }
	     
	     else
	     {
	    	 System.out.println("Lending Point is not  displayed");
	     }

	}

}
