import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC9 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\New Workspace\\Dummy\\exe2files\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("http://3.132.178.8/dashboard/skeps/manage-network/blockchain");
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("prakhar@skeps.com");
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Password@12");
			
			
			
			driver.findElement(By.xpath("//button[text()='Login']")).click();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//mat-accordion[@class='mat-accordion']/mat-expansion-panel/mat-expansion-panel-header[@page-title='Manage Network']")).click();
			
			driver.findElement(By.xpath("//strong[contains(text(),'Metrics')]")).click();
			
			WebElement selseller=driver.findElement(By.xpath("//input[@placeholder='Select Seller']"));
			
			selseller.click();
			selseller.sendKeys("LENP");
			
			//Select s=new Select(driver.findElement(By.xpath("//div[@role='listbox']")));
			
			// s.selectByVisibleText(" LENP ");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/mat-option[1]/span[1]")).click();
			//driver.findElement(By.xpath("//div[@role='listbox']//mat-option[@class='mat-option mat-focus-indicator ng-star-inserted mat-selected']/span[text()=' LENP ']")).click();
			
			
			driver.findElement(By.xpath("//input[@placeholder='Select Buyer']")).click();
			
			driver.findElement(By.xpath("//div[@role='listbox']//mat-option[@class='mat-option mat-focus-indicator ng-star-inserted']/span[text()=' MICR ']")).click();

	}

}
