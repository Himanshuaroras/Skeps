import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2 {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\New Workspace\\Dummy\\exe2files\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://3.132.178.8/dashboard/skeps/metrics");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("prakhar@skeps.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Password@12");
		
		
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//mat-accordion[@class='mat-accordion']/mat-expansion-panel[2]")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Search Partners']")).click();
		
//		if (driver.findElement(By.xpath("//div[text()='All']")).isDisplayed());
//		{
//			System.out.println("Element is present");
//		}
		
		
		if(driver.getPageSource().contains("All")){
			System.out.println("Text is present");
			}else{
			System.out.println("Text is absent");
			}
		
		
		driver.findElement(By.xpath("//span[contains(text(),'LENP_MERCHANT')]")).click();
		
		
		driver.findElement(By.xpath("//mat-icon[text()='close']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Search Partners']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(text(),'Buyers')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[contains(text(),'MICR')]")).click();

	}

}
