import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC17 {

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
		
		driver.findElement(By.xpath("//mat-accordion[@class='mat-accordion']/mat-expansion-panel/mat-expansion-panel-header[@page-title='Metrics']")).click();

		
		Thread.sleep(2000);
		WebElement YestElement=	driver.findElement(By.xpath("//span[@class='mat-header-cell ng-star-inserted'][contains(text(),'Yesterday')]"));
			Point point = YestElement.getLocation();
			 int xcord = point.getX();
			 System.out.println("Position of the webelement from left side is "+xcord +" pixels");
			 int ycord = point.getY();
			 System.out.println("Position of the webelement from top side is "+ycord +" pixels");
			
			WebElement Evaluatedleads= driver.findElement(By.xpath("//span[contains(text(),'Evaluated Leads')]"));
			Actions ac=new Actions(driver);
			ac.moveByOffset(xcord, ycord).click();
			ac.moveToElement(Evaluatedleads).click().perform();
			
			
			
			driver.findElement(By.xpath("//span[@class='chart-type ng-star-inserted'][text()='FICO Chart']")).click();
	}

}
