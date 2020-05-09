import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC19 {

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
		
		
		//WebDriverWait wait2= new WebDriverWait(driver, 20000);
		//wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//mat-accordion[@class='mat-accordion']/mat-expansion-panel/mat-expansion-panel-header[@page-title='Metrics']")));
		
		Thread.sleep(20000);
		
		driver.findElement(By.xpath("//mat-accordion[@class='mat-accordion']/mat-expansion-panel/mat-expansion-panel-header[@page-title='History']")).click();

		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='filter-icon float-right']//fa-icon[@class='ng-fa-icon']")).click();
		

//		driver.findElement(By.xpath("//mat-select[@aria-label='Search By Funded']")).click();
//		
//		driver.findElement(By.xpath("//span[text()=' Yes ']")).click();
//		
	//	driver.findElement(By.xpath("//span[text()='Price Range']")).click();
		
		
//		driver.findElement(By.xpath("//span[text()='Search FICO']")).click();
//		
//	WebElement SelectFICO=driver.findElement(By.xpath("//span[contains(text(),'Super Prime')]"));
//	SelectFICO.click();
//
//
//		
//		driver.findElement(By.xpath("//span[text()='Search Sellers']")).click();
//		
//		WebElement sellersel=driver.findElement(By.xpath("//span[text()=' SERF ']"));
//		sellersel.click();
//		
//		driver.findElement(By.xpath("//span[text()='Search Buyers']")).click();
//		
//		WebElement Buyersel=driver.findElement(By.xpath("//span[text()=' QRUM ']"));
//		Buyersel.click();
//		
//		driver.findElement(By.xpath("//input[@placeholder='Date Range']")).click();
//		
//		driver.findElement(By.xpath("//button[contains(text(),'Yesterday')]")).click();
//		
//		WebElement dropdown=driver.findElement(By.xpath("//div[@class='md-drppicker drops-down-auto ltr shown double show-ranges']"));
//		
//		Select s=new Select(dropdown);
//		s.selectByVisibleText("Yesterday");
//		
	//	driver.findElement(By.xpath("//span[contains(text(),'Search By Shared')]")).click();
		
	//	WebElement Selectsharedstatus=driver.findElement(By.xpath("//span[contains(text(),' Yes ')]"));
	//	Selectsharedstatus.click();
		
		WebElement QueryID=driver.findElement(By.xpath("//input[@placeholder='Search ID']"));
		QueryID.sendKeys("2940343326336259");
		
		WebElement Pointcode=driver.findElement(By.xpath("//input[@placeholder='Search Point Code']"));
		Pointcode.sendKeys("TEST-AL323EXIS-221");
		
		WebElement Appidentifier=driver.findElement(By.xpath("//input[@placeholder='Search App Identifier']"));
		Appidentifier.sendKeys("1");
		
	//	Thread.sleep(1000);
		
		
		
		
		
		
	}

}
