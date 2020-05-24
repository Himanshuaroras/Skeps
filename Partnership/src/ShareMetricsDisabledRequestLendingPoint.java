import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShareMetricsDisabledRequestLendingPoint {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\git\\Skeps\\Partnership\\exe2files\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		driver.get("http://3.132.156.194/dashboard/home/partners");
		
        Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("support+1@skeps.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Password@12");
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
        Thread.sleep(20000);
        
        
        WebElement Buyleads=driver.findElement(By.xpath("//mat-expansion-panel-header[@page-title='Buy Leads']"));
		Buyleads.click();
		
        /******Click on Decline flow under Buy  leads*******/
		
		WebElement BuyleadsDeclineflow=driver.findElement(By.xpath("//mat-expansion-panel-header[@page-title='Buy Leads']//following-sibling::div[1]//mat-expansion-panel-header[@page-title='Decline Flow']"));
		BuyleadsDeclineflow.click();
		
        /******Click on Sellers under Decline flow*******/
		WebElement Sellersclick=driver.findElement(By.xpath("//mat-expansion-panel-header[@page-title='Buy Leads']//following-sibling::div[1]//mat-expansion-panel-header[@page-title='Decline Flow']//following-sibling::div[1]//div[@class='side-nav-sub-menu ng-star-inserted']//mat-expansion-panel-header[@page-title='Sellers']"));
		Sellersclick.click();
		
        
        
        if(driver.getPageSource().contains("SERF"))
        {
        	
        	System.out.println("Service Finance is displayed");
        	
        	String MetricText=driver.findElement(By.xpath("//span[text()='SERF']/../../following-sibling::span[2]")).getText();
        	
        	 if(MetricText.contains("Metrics:"))
        	 {
        		 System.out.println("Metrics is displayed");
        		 
        		 Thread.sleep(2000);
        		String statusCheck= driver.findElement(By.xpath("//span[contains(text(),'SERF')]/../../following-sibling::span[2]/span[2]/span/following-sibling::span[1]/span")).getText();
        		if(statusCheck.equals("(Disabled)"))
        		{
        			System.out.println("Share Metrics is disabled");
        			
        			Boolean checkboxstatus=driver.findElement(By.xpath("//span[contains(text(),'SERF')]/../../following-sibling::span[2]/span[2]/span/span")).isSelected();
        			
        			if(checkboxstatus==true)
        			{
        				System.out.println("Checkbox is selected");
        				
                        Thread.sleep(2000);
        				
        				//Selecting the checkbox
        				WebElement CheckboxSelect=driver.findElement(By.xpath("//span[contains(text(),'SERF')]/../../following-sibling::span[2]/span[2]/span"));
        				CheckboxSelect.click();
        				
        				Thread.sleep(1000);
        				WebElement submitbutton=driver.findElement(By.xpath("//button[text()='Submit']"));
        				submitbutton.click();
        				
        				  SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm");

        			       Date now = new Date();

        			      String strTime = sdfTime.format(now);

        			      System.out.println("Time: " + strTime);
        			      
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
        					WebElement sent=driver.findElement(By.xpath("//mat-expansion-panel-header[@page-title=\"Sent\"]/span/p"));
        					sent.click();
        			      
        					Thread.sleep(3000);
        					 driver.navigate().refresh();
        				      
        				      Thread.sleep(2000);
        				      
        				      //Share Metrics disabled message
        				      
        				      
        				      WebElement ShareMetricsMessage=    driver.findElement(By.xpath("//div[text()='Share Metrics has been requested by Lending Point (Buyer) ']/preceding-sibling::div[@class='partner-name-wrap']//span[text()='SERF ']"));
        				  	//  WebElement RemovepartnerMessage= driver.findElement(By.xpath("//div[text()='You have been removed as a Seller ']/parent::div[1]//span[text()='SERF ']//div[text()='You have been removed as a Seller ']/parent::div[1]//span[text()='SERF ']"));
        				  	  
        				  	  action.moveToElement(ShareMetricsMessage).click().perform();
        				  	 // RemovepartnerMessage.click();    
        				  	  
        				  	  
        				  String ShareMetricsEnableMessage=	  driver.findElement(By.xpath("//span[text()=' Lending Point ']/../following-sibling::div[1]//div[text()=' Share Metrics has been requested by Lending Point (Buyer).  ']")).getText();
        				  	 
        				  System.out.println(ShareMetricsEnableMessage);
        				
        			}
        			
        			else
        			{
        				System.out.println("Checkbox is Unselected");
        				
        				
        				  	
        				      
        			}
        		}
        	
        		else
        		{
        			System.out.println("Share Metrics is enabled");
        		}
        	 }
        	 
        	 else
        	 {
        		 System.out.println("Metrics is not displayed");
        	 }
        }
        
        else
        {
        	System.out.println("Service Finance is not displayed");
        }
		
	}

	

}
