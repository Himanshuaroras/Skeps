import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TC20 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\New Workspace\\Dummy\\exe2files\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://3.132.178.8/auth/login");
		
		//WebDriverWait wait1= new WebDriverWait(driver, 20);
		//wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/app-root/app-auth/div/div/div/div[2]/div/div/div/h1")));
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("prakhar@skeps.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Password@12");
		
		
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
        Thread.sleep(20000);
		
		driver.findElement(By.xpath("//mat-accordion[@class='mat-accordion']/mat-expansion-panel/mat-expansion-panel-header[@page-title='History']")).click();

		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='filter-icon float-right']//fa-icon[@class='ng-fa-icon']")).click();
		
		
	//System.out.println(s);
	
	
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
//	for (int i = 0; i <= args.length; i++) {
//		
//		js.executeScript("window.scrollBy(0,1000)");
//		
//	}
	
	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	
	Actions action = new Actions(driver);
	action.sendKeys(Keys.PAGE_DOWN).build().perform();
	
	Thread.sleep(10000);
	
	EventFiringWebDriver eventfiringwebdriver= new EventFiringWebDriver(driver);
	
	for (int i = 0; i <=20; i++) {
		
		Thread.sleep(3000);
		eventfiringwebdriver.executeScript("document.querySelector('mat-accordion[class=\"mat-table mat-accordion mat-accordion-multi\"]').scrollTop=30000");

		
	}
	
	
	Thread.sleep(10000);
	
	List<WebElement> transactions=driver.findElements(By.xpath("//mat-accordion[@class='mat-table mat-accordion mat-accordion-multi']/mat-expansion-panel"));

	System.out.println(transactions.size());
	
//String s=	transactions.get(0).getText();
		
//		for (WebElement temp : transactions) {
//            System.out.println(temp);
//		}
	}

}
