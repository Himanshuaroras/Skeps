import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CancelRequestLendingPoint {

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

	}

}
