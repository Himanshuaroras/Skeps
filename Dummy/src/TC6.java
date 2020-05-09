import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC6 {

	public static void main(String[] args) throws InterruptedException {


		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\New Workspace\\Dummy\\exe2files\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("http://3.132.178.8/dashboard/skeps/invoice/update-lead-status");
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("prakhar@skeps.com");
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Password@12");
			
			
			
			driver.findElement(By.xpath("//button[text()='Login']")).click();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//mat-accordion[@class='mat-accordion']/mat-expansion-panel/mat-expansion-panel-header[@page-title='Invoice']")).click();
			
			
			driver.findElement(By.xpath("//strong[contains(text(),'Upload Invoice')]")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@placeholder='Start Date']/parent::div[@class='mat-form-field-infix']//following-sibling::div")).click();
			
			
			Thread.sleep(1000);
			
		    driver.findElement(By.xpath("//div[contains(text(),'16')]")).click();
			
			driver.findElement(By.xpath("//input[@placeholder='End Date']/parent::div[@class='mat-form-field-infix']//following-sibling::div")).click();
			
			driver.findElement(By.xpath("//div[@class='mat-calendar-body-cell-content mat-calendar-body-today']")).click();
			
			driver.findElement(By.xpath("//div[@class='mat-select-arrow-wrapper']")).click();
			
			driver.findElement(By.xpath("//span[contains(text(),'QRUM')]")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//strong[contains(text(),'Funded Leads')]/parent::div[@class='col']//following-sibling::div[@class='col text-right']/button[text()=' Invoice ']/fa-icon")).click();
			
			driver.findElement(By.xpath("//button[@class='button button-primary button-rounded button-vertical-padding button-extended']")).click();
			
	
	}

}
