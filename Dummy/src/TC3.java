import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC3 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
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
			
			driver.findElement(By.xpath("//div[@class='mat-select-arrow']")).click();
			
			 Thread.sleep(1000);
			
			driver.findElement(By.xpath("//span[contains(text(),'FUND')]")).click();
			
			driver.findElement(By.xpath("//button[@class='button theme-button button-outline button-light-blue button-rounded button-extended']")).click();
			
			Thread.sleep(1000);
			
			StringSelection strSel = new StringSelection("C:\\Users\\PC\\Desktop\\Upload\\UploadStatus");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSel, null);
			
			
			Robot robot = new Robot();
			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			
			
			driver.findElement(By.xpath("//button[@class='button button-light-blue button-outline button-elongated button-rounded ng-star-inserted'][text()=' Update ']")).click();

			
			WebDriverWait wait= new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='button button-primary button-rounded button-vertical-padding button-extended'][text()='Yes']")));
			
			driver.findElement(By.xpath("//button[@class='button button-primary button-rounded button-vertical-padding button-extended'][text()='Yes']")).click();
			
		}

	

}
