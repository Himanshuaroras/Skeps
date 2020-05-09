import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC10 {

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
			
			driver.findElement(By.xpath("//strong[contains(text(),'Blockchain Files')]")).click();
			
			WebElement selpartner=driver.findElement(By.xpath("//span[@class='dropdown-btn']/span[2]/span"));
			selpartner.click();
			
			driver.findElement(By.xpath("//div[contains(text(),'SERF')]")).click();
			
			
			driver.findElement(By.xpath("//button[text()='Browse']")).click();
			
//			WebElement DropDown = driver.findElement(By.xpath("//div[@class='dropdown-list']"));  
//			Select dropdown = new Select(DropDown);  
//			dropdown.selectByVisibleText("SERF");
			
	}

}
