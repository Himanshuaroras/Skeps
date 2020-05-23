import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddPartnerRequestinLendingPoint {

	public static void main(String[] args) throws InterruptedException {
		
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\git\\mylocalrepository\\Partnership\\exe2files\\chromedriver.exe");
		
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
        
        WebElement NotificationIcon= driver.findElement(By.xpath("//fa-icon[@class='notification-bell ng-fa-icon']"));
        NotificationIcon.click();

      //Taking latest time of latest message from notification 
        
       List<WebElement> notifylistTime= driver.findElements(By.xpath("//div[@class='dropdown-menu dropdown-menu-right notification-box show']//div[@class='content-box ng-star-inserted']/div[1]/following-sibling::div[text()='Partner request from Service Finance (Seller)']/preceding-sibling::div[1]/div[@class='message-date']"));
       
       
       int listsize=notifylistTime.size();
       System.out.println(notifylistTime.get(0).getText());
       
       
     //Taking latest message of latest time from notification 
     List<WebElement> notifylistText  =driver.findElements(By.xpath("//div[@class='dropdown-menu dropdown-menu-right notification-box show']//div[@class='content-box ng-star-inserted']/div[1]/following-sibling::div[text()='Partner request from Service Finance (Seller)']"));

     System.out.println(notifylistText.get(0).getText());
     
     // Partnership request action accepted from notification
     
     
     
     
     //Click on messages inbox
        
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
	      WebElement AddpartnerMessage=    driver.findElement(By.xpath("//div[text()=\"Partner request from Service Finance (Seller) \"]/preceding-sibling::div[@class='partner-name-wrap']//span[text()='SERF ']"));
	      
	      action.moveToElement(AddpartnerMessage).click().perform();
	      
	 	 String SERFAddpartnerMessage= driver.findElement(By.xpath("//span[text()=' SERF ']/../following-sibling::div[1]//div[text()=' Partner request from Service Finance (Seller). Please accept our request to partner with you. ']")).getText();
		 
		 System.out.println(SERFAddpartnerMessage);

	}

}
