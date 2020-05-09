import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\New Workspace\\Dummy\\exe2files\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://3.132.178.8:8081/auth/login");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("agent@skeps.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Password@12");
		
		
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		
	//	String sharedleads= driver.findElement(By.xpath("//mat-expansion-panel-header[@id='mat-expansion-panel-header-3']//span[@class='ng-star-inserted'][contains(text(),'1')]")).getText();
		
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		WebDriverWait wait= new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//mat-expansion-panel-header[@id='mat-expansion-panel-header-11']//span[@class='mat-content']")));
		
		//driver.findElement(By.xpath("//mat-expansion-panel-header[@id='mat-expansion-panel-header-11']//span[@class='mat-content']")).click();
		
		
		driver.findElement(By.xpath("//mat-expansion-panel-header[@id='mat-expansion-panel-header-13']//fa-icon[@class='menu-icon ng-fa-icon collapsed']//*[local-name()='svg']")).click();;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@class='filter-icon float-right']//fa-icon[@class='ng-fa-icon']//*[local-name()='svg']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//input[@placeholder='Date Range']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@class='active'][text()='Today']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
//		for (int i = 0; i <= args.length; i++) {
//			
//			js.executeScript("window.scrollBy(0,1000)");
//			
//		}
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	//	js.executeScript("window.scrollBy(0,1000)");
		
		
		List<WebElement> leads= driver.findElements(By.xpath("//*[starts-with(@id,'mat-expansion-panel-header-')]"));
		
		int i=leads.size();
		
		 String todaycount= leads.get(0).getText();
		
		
		
		
		
	}

}
