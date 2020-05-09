import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TC14 {

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
		
		Thread.sleep(10000);
		
		
	//	WebDriverWait wait= new WebDriverWait(driver, 200);
	//	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//mat-accordion[@class='mat-accordion']/mat-expansion-panel/mat-expansion-panel-header[@page-title='Metrics']")));
		
		driver.findElement(By.xpath("//mat-accordion[@class='mat-accordion']/mat-expansion-panel/mat-expansion-panel-header[@page-title='Metrics']")).click();
//		List<WebElement> ls=driver.findElements(By.xpath("//mat-accordion[@class='mat-accordion']/mat-expansion-panel"));
//		
//		System.out.println(ls.size());
//		for (WebElement we : ls)
//		{
//			System.out.println("test   "+we.getText() );
//		}
		//driver.findElement(By.xpath("//mat-accordion[@class='mat-accordion']/mat-expansion-panel[2]")).click();
		
		
		
		
		
		
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
		
		Boolean s1=driver.findElement(By.xpath("//span[@class='chart-type active'][text()='Time Chart']")).isDisplayed();
		
		if(s1==true)
		{
			System.out.println("Time chart is displayed and test case is passed");
		}
		
		else
		{
			System.out.println("Time chart is not displayed and test case is failed");
		}
		
		String t1=driver.findElement(By.xpath("//span[@class='chart-type active'][text()='Time Chart']")).getText();
		
	
		Assert.assertEquals(t1, "Time Chart","Timehart test case failed");
	System.out.println("Time chart Test case passed");
	
		//Evaluatedleads.click();
		
	}

}
