import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class RemovePartner {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\New Workspace\\Partnership\\exe2files\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		driver.get("http://3.132.156.194/dashboard/home/partners");
		
        Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("aditi@skeps.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Skeps@12");
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		
		
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
        Thread.sleep(20000);
        
//        driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL + "t");
//        
//      driver.get("http://3.13.0.189/auth/login");
		
		WebElement Buyleads=driver.findElement(By.xpath("//mat-expansion-panel-header[@page-title='Buy Leads']"));
		Buyleads.click();
		
		WebElement BuyleadsDeclineflow=driver.findElement(By.xpath("//mat-expansion-panel-header[@page-title='Buy Leads']//following-sibling::div[1]//mat-expansion-panel-header[@page-title='Decline Flow']"));
		BuyleadsDeclineflow.click();
		
		WebElement Sellersclick=driver.findElement(By.xpath("//mat-expansion-panel-header[@page-title='Buy Leads']//following-sibling::div[1]//mat-expansion-panel-header[@page-title='Decline Flow']//following-sibling::div[1]//div[@class='side-nav-sub-menu ng-star-inserted']//mat-expansion-panel-header[@page-title='Sellers']"));
		Sellersclick.click();
		
		Thread.sleep(3000);
		
		
//		if (driver.findElement(By.xpath("//span[text()='SERF']/parent::span[1]/parent::span[1]"
//				+ "/parent::span[1]//span[@class='mat-cell']//span[@mattooltip='Remove Partner']"))!=null) {
//			
//			
//			System.out.println("Element is present");
//		}
//		else
//		{
//			System.out.println("Element is absent");
//			
//		}
		
		Boolean Removepartnerelement;
		try {
		Removepartnerelement=driver.findElement(By.xpath("//span[text()='SERF']/parent::span[1]/parent::span[1]"
				+ "/parent::span[1]//span[@class='mat-cell']//span[@mattooltip='Remove Partner']")).isDisplayed();
			
		System.out.println("1");
//		  if(Removepartnerelement==true)
//		  {
			  System.out.println("2");
			  WebElement RemovePartner=driver.findElement(By.xpath("//span[text()='SERF']/parent::span[1]/parent::span[1]/parent::span[1]//span[@class='mat-cell']//span[@mattooltip='Remove Partner']"));
		      RemovePartner.click();
		      System.out.println("3");
		      WebElement RemovePartneraccept=driver.findElement(By.xpath("//button[text()=\"Yes\"]"));
		      RemovePartneraccept.click();
		      System.out.println("4");
		//  }
		}
//		  else
//		  {
			  
		 // }
		//}
		catch (NoSuchElementException e) {
			 Removepartnerelement=false;
			 
			 System.out.println("5");
			  System.out.println("Add partner option present");
			//System.out.println(e);
		}
		
		
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
		
//		Date d = new Date();
//	      SimpleDateFormat simpDate;
//	      simpDate = new SimpleDateFormat("kk:mm:ss");
//	      System.out.println(simpDate.format(d));
	      
	      SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm");

	      Date now = new Date();

	      String strTime = sdfTime.format(now);

	      System.out.println("Time: " + strTime);
	      
	      
	      Thread.sleep(3000);
	    //  driver.findElement(By.xpath("//div[contains(text(),'Welcome')]")).click();
	    //  driver.navigate().to("http://3.132.156.194/dashboard/messages/sent");
	      driver.navigate().refresh();
	  WebElement RemovepartnerMessage= driver.findElement(By.xpath("//div[text()='You have been removed as a Seller ']/parent::div[1]//span[text()='SERF ']//div[text()='You have been removed as a Seller ']/parent::div[1]//span[text()='SERF ']"));
	  
	  action.moveToElement(RemovepartnerMessage).click().perform();
	  RemovepartnerMessage.click();    
	  
	  Thread.sleep(1000);
	  
	  driver.get("http://3.13.0.189/auth/login");

//	String InsideremoveMessage=driver.findElement(By.xpath("//div[text()=' Partner request from Lending Point (Buyer). Please accept our request to partner with you. ']")).getText();
//		
//	System.out.println(InsideremoveMessage);
	}

}