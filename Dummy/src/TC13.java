import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC13 {

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
		
		driver.findElement(By.xpath("//mat-accordion[@class='mat-accordion']/mat-expansion-panel/mat-expansion-panel-header[@page-title='Metrics']")).click();
		
		
		System.out.println("Evaluated leads  status :- ");
		
		WebElement EvaTodayleads= driver.findElement(By.xpath("//span[contains(text(),'Evaluated Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[1]/span[1]"));
		
		
		System.out.println("Today Evaluated leads "+EvaTodayleads.getText());     
		
		
		WebElement EvaYesterdayLeads= driver.findElement(By.xpath("//span[contains(text(),'Evaluated Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[2]/span[1]"));
		
		System.out.println("Yesterday Evaluated leads "+EvaYesterdayLeads.getText());
		
		
		
	    WebElement ApproveTodayleads= driver.findElement(By.xpath("//span[contains(text(),'Approved Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[1]/span[1]"));
			
			
		System.out.println("Today Approved leads "+ApproveTodayleads.getText());  
			
			
	    WebElement ApproveYesterdayLeads= driver.findElement(By.xpath("//span[contains(text(),'Approved Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[2]/span[1]"));
			
	    System.out.println("Yesterday Approved leads "+ApproveYesterdayLeads.getText());
	    
	    
	    int i=Integer.parseInt(EvaYesterdayLeads.getText());
	    
	    int j= Integer.parseInt(ApproveYesterdayLeads.getText());
	    
	  int a= ( (i-j)*121)/100;
			
	  System.out.println(a);

	}

}
