import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Prescreenflow1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\git\\Skeps\\Dummy\\exe2files\\chromedriver.exe");

System.setProperty("webdriver.chrome.silentOutput", "true");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("http://3.132.178.8/dashboard/skeps/metrics");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("prakhar@skeps.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Password@12");
		
		
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(20000);
		
		//Click on metrics
		
		driver.findElement(By.xpath("//mat-accordion[@class='mat-accordion']/mat-expansion-panel/mat-expansion-panel-header[@page-title='Metrics']")).click();
		
		//driver.findElement(By.xpath("//strong[contains(text(),'Metrics')]")).click();
		
		driver.findElement(By.xpath("//mat-accordion[@class='mat-accordion']/mat-expansion-panel/mat-expansion-panel-header[@page-title='Prescreen Metrics']")).click();
		
		
		/***********************Today Evaluated leads *************************/
        System.out.println("Today Evaluated leads  status :- ");
		
		WebElement EvaTodayleads= driver.findElement(By.xpath("//span[contains(text(),'Evaluated Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[1]/span[1]"));
		
		
		System.out.println("Today Evaluated leads "+EvaTodayleads.getText());     
		
		/***********************Yesterday Evaluated leads *************************/
		WebElement EvaYesterdayLeads= driver.findElement(By.xpath("//span[contains(text(),'Evaluated Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[2]/span[1]"));
		
		System.out.println("Yesterday Evaluated leads "+EvaYesterdayLeads.getText());
		
		
		/***********************This week Evaluated leads *************************/
		
	WebElement Evathisweekleads = driver.findElement(By.xpath("//span[contains(text(),'Evaluated Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[3]/span[1]"));
		
		System.out.println("This week Evaluated leads "+Evathisweekleads.getText());
		
		
		//Thread.sleep(1000);
		
		/***********************This month Evaluated leads *************************/
		
		WebElement Evathismonthleads = driver.findElement(By.xpath("//span[contains(text(),'Evaluated Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[4]/span[1]"));
		
		System.out.println("This month Evaluated leads "+Evathismonthleads.getText());
		
		WebDriverWait wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Evaluated Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]")));
		
		/***********************This Quarter Evaluated leads *************************/
		
		WebElement Evathisquaterleads=driver.findElement(By.xpath("//span[contains(text(),'Evaluated Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]"));
		
		System.out.println("This quarter Evaluated leads "+Evathisquaterleads.getText());
		
		System.out.println("\n");
		
		/***********************Today Approved leads *************************/
		
		 WebElement ApproveTodayleads= driver.findElement(By.xpath("//span[contains(text(),'Approved Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[1]/span[1]"));
		
		System.out.println("Today Approved leads "+ApproveTodayleads.getText());  
		
		/***********************Yesterday Approved leads *************************/
		
	    WebElement ApproveYesterdayLeads= driver.findElement(By.xpath("//span[contains(text(),'Approved Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[2]/span[1]"));
			
	    System.out.println("Yesterday Approved leads "+ApproveYesterdayLeads.getText());
	    
	    /***********************This week Approved leads *************************/
	    
 WebElement Approvethisweekleads = driver.findElement(By.xpath("//span[contains(text(),'Approved Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[3]/span[1]"));
		
		System.out.println("This week Approved leads "+Approvethisweekleads.getText());
		
		
        Thread.sleep(1000);
		
        
        /***********************This month Approved leads *************************/
		WebElement Approvethismonthleads = driver.findElement(By.xpath("//span[contains(text(),'Approved Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[4]/span[1]"));
		
		System.out.println("This month Approved leads "+Approvethismonthleads.getText());
		
		
		WebDriverWait wait2= new WebDriverWait(driver, 20);
		wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Approved Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]")));
	
		
		/***********************This Quarter Approved leads *************************/
	 WebElement Approvethisquaterleads=driver.findElement(By.xpath("//span[contains(text(),'Approved Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]"));
		
		System.out.println("This quarter Approved leads "+Approvethisquaterleads.getText());
		
		
		
		System.out.println("\n");
		
		System.out.println("Shared leads status  :-     ");
		
		
		/***********************Today Shared leads *************************/
		
	       WebElement SharedTodayleads= driver.findElement(By.xpath("//span[contains(text(),'Shared Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[1]/span[1]"));
			
			
			System.out.println("Today Shared leads "+SharedTodayleads.getText());  
			
			
			/***********************Yesterday Shared leads *************************/
			WebElement SharedYesterdayLeads= driver.findElement(By.xpath("//span[contains(text(),'Shared Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[2]/span[1]"));
			
			System.out.println("Yesterday Shared leads "+SharedYesterdayLeads.getText());
			
			
			/***********************This Week Shared leads *************************/
			
			WebElement Sharedthisweekleads = driver.findElement(By.xpath("//span[contains(text(),'Shared Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[3]/span[1]"));
			
			System.out.println("This week Shared leads "+Sharedthisweekleads.getText());
			
			
			Thread.sleep(1000);
			
			/***********************This month Shared leads *************************/
			WebElement Sharedthismonthleads = driver.findElement(By.xpath("//span[contains(text(),'Shared Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[4]/span[1]"));
			
			System.out.println("This month Shared leads "+Sharedthismonthleads.getText());
			
			

			WebDriverWait wait3= new WebDriverWait(driver, 20);
			wait3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Shared Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]")));
			
			/***********************This Quarter Shared leads *************************/
		 WebElement Sharedthisquaterleads=driver.findElement(By.xpath("//span[contains(text(),'Shared Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]"));
			
			System.out.println("This quarter Shared leads "+Sharedthisquaterleads.getText());
			
		
			System.out.println("\n");
			
			System.out.println("Funded leads status  :-     ");
			
			/***********************Today Funded leads *************************/
		       WebElement FundedTodayleads= driver.findElement(By.xpath("//span[contains(text(),'Funded Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[1]/span[1]"));
				
				
				System.out.println("Today Funded leads "+FundedTodayleads.getText()); 
				
				/***********************Yesterday Funded leads *************************/
				
				WebElement FundedYesterdayLeads= driver.findElement(By.xpath("//span[contains(text(),'Funded Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[2]/span[1]"));
				
				System.out.println("Yesterday Funded leads "+FundedYesterdayLeads.getText());
				
				/***********************This week Funded leads *************************/
				WebElement Fundedthisweekleads = driver.findElement(By.xpath("//span[contains(text(),'Funded Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[3]/span[1]"));
				
				System.out.println("This week Funded leads "+Fundedthisweekleads.getText());
				
				
				Thread.sleep(1000);
				
				/***********************This month Funded leads *************************/
				WebElement Fundedthismonthleads = driver.findElement(By.xpath("//span[contains(text(),'Funded Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[4]/span[1]"));
				
				System.out.println("This month Funded leads "+Fundedthismonthleads.getText());
				
				

				WebDriverWait wait4= new WebDriverWait(driver, 20);
				wait4.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Funded Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]")));
				
				/***********************This quarter Funded leads *************************/
			 WebElement Fundedthisquaterleads=driver.findElement(By.xpath("//span[contains(text(),'Funded Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]"));
				
				System.out.println("This quarter Funded leads "+Fundedthisquaterleads.getText());
		
		
				System.out.println("\n");
				
				System.out.println("Approval Rate status  :-     ");
				
				/***********************Today Approval Rate *************************/
				
			       WebElement ApprovalrateToday= driver.findElement(By.xpath("//span[contains(text(),'Approval Rate')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[1]/span[1]"));
					
					
					System.out.println("Today Approval Rate "+ApprovalrateToday.getText()); 
					
					/***********************Yesterday Approval Rate *************************/
					WebElement ApprovalrateYesterday= driver.findElement(By.xpath("//span[contains(text(),'Approval Rate')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[2]/span[1]"));
					
					System.out.println("Yesterday Approval Rate "+ApprovalrateYesterday.getText());
					
					
					/***********************This week Approval Rate *************************/
					WebElement Approvalratethisweek = driver.findElement(By.xpath("//span[contains(text(),'Approval Rate')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[3]/span[1]"));
					
					System.out.println("This week Approval Rate "+Approvalratethisweek.getText());
					
				
					Thread.sleep(1000);
					
					/***********************This month Approval Rate *************************/
					WebElement Approvalratethismonth = driver.findElement(By.xpath("//span[contains(text(),'Approval Rate')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[4]/span[1]"));
					
					System.out.println("This month Approval Rate "+Approvalratethismonth.getText());
					
					

					WebDriverWait wait5= new WebDriverWait(driver, 20);
					wait5.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Approval Rate')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]")));
					
					
					/***********************This Quarter Approval Rate *************************/
				 WebElement Approvedratethisquater=driver.findElement(By.xpath("//span[contains(text(),'Approval Rate')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]"));
					
					System.out.println("This quarter Approved rate "+Approvedratethisquater.getText());
			
				
					System.out.println("\n");
					
					
					
					
					System.out.println("Shared Rate status  :-     ");
					
					/***********************Today Share Rate *************************/
				       WebElement SharedrateToday= driver.findElement(By.xpath("//span[contains(text(),'Shared Rate')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[1]/span[1]"));
						
						
						System.out.println("Today Shared Rate "+SharedrateToday.getText()); 
						
						/***********************Yesterday Share Rate *************************/
						
						WebElement SharedrateYesterday= driver.findElement(By.xpath("//span[contains(text(),'Shared Rate')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[2]/span[1]"));
						
						System.out.println("Yesterday Shared Rate "+SharedrateYesterday.getText());
						
						/***********************This week Share Rate *************************/
						
						WebElement Sharedratethisweek = driver.findElement(By.xpath("//span[contains(text(),'Shared Rate')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[3]/span[1]"));
						
						System.out.println("This week Shared Rate "+Sharedratethisweek.getText());
						
						

						Thread.sleep(1000);
						
						/***********************This month Share Rate *************************/
						WebElement Sharedratethismonth = driver.findElement(By.xpath("//span[contains(text(),'Shared Rate')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[4]/span[1]"));
						
						System.out.println("This month Shared Rate "+Sharedratethismonth.getText());
						
						

						WebDriverWait wait6= new WebDriverWait(driver, 20);
						wait6.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Shared Rate')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]")));
						
						
						/***********************This Quarter Share Rate *************************/
					 WebElement Sharedratethisquater=driver.findElement(By.xpath("//span[contains(text(),'Shared Rate')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]"));
						
						System.out.println("This quarter Shared rate "+Sharedratethisquater.getText());
						
						
						System.out.println("\n");
						
						System.out.println("Funded Rate status  :-     ");
						
						/***********************Today Funded Rate *************************/
						
					       WebElement FundedrateToday= driver.findElement(By.xpath("//span[contains(text(),'Funded Rate')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[1]/span[1]"));
							
							
							System.out.println("Today Funded Rate "+FundedrateToday.getText()); 
							
							/***********************Yesterday Funded Rate *************************/
							
							WebElement FundedrateYesterday= driver.findElement(By.xpath("//span[contains(text(),'Funded Rate')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[2]/span[1]"));
							
							System.out.println("Yesterday Funded Rate "+FundedrateYesterday.getText());
							
							
							/***********************This week Funded Rate *************************/
							WebElement Fundedratethisweek = driver.findElement(By.xpath("//span[contains(text(),'Funded Rate')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[3]/span[1]"));
							
							System.out.println("This week Funded Rate "+Fundedratethisweek.getText());
							
							

							Thread.sleep(1000);
							
							/***********************This month Funded Rate *************************/
							WebElement Fundedratethismonth = driver.findElement(By.xpath("//span[contains(text(),'Funded Rate')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[4]/span[1]"));
							
							System.out.println("This month Funded Rate "+Fundedratethismonth.getText());
							
							

							WebDriverWait wait7= new WebDriverWait(driver, 20);
							wait7.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Funded Rate')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]")));
							
							/***********************This Quarter Funded Rate *************************/
						 WebElement Fundedratethisquater=driver.findElement(By.xpath("//span[contains(text(),'Funded Rate')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]"));
							
							System.out.println("This quarter Funded rate "+Fundedratethisquater.getText());
							
				
						
							
							System.out.println("\n");
							
							System.out.println("Shared Loan Amount status  :-     ");
							
							/***********************Today Share Loan Amount *************************/
						       WebElement SharedLoanamountToday= driver.findElement(By.xpath("//span[text()='Shared Loan Amount']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[1]/span[1]"));
								
								
								System.out.println("Today Shared Loan Amount "+SharedLoanamountToday.getText()); 
								
								/***********************Yesterday Share Loan Amount *************************/
								WebElement SharedLoanAmountYesterday= driver.findElement(By.xpath("//span[text()='Shared Loan Amount']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[2]/span[1]"));
								
								System.out.println("Yesterday Shared Loan Amount "+SharedLoanAmountYesterday.getText());
								
								
								/***********************This week Share Loan Amount *************************/
								WebElement SharedLoanAmountthisweek = driver.findElement(By.xpath("//span[text()='Shared Loan Amount']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[3]/span[1]"));
								
								System.out.println("This week Shared Loan Amount "+SharedLoanAmountthisweek.getText());
								
								
								Thread.sleep(1000);
								
								/***********************This month Share Loan Amount *************************/
								WebElement SharedLoanAmountthismonth = driver.findElement(By.xpath("//span[text()='Shared Loan Amount']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[4]/span[1]"));
								
								System.out.println("This month Shared Loan Amount "+SharedLoanAmountthismonth.getText());
								
								

								WebDriverWait wait8= new WebDriverWait(driver, 20);
								wait8.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Shared Loan Amount']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]")));
								
								/***********************This Quarter Share Loan Amount *************************/
							 WebElement SharedLoanAmountthisquater=driver.findElement(By.xpath("//span[text()='Shared Loan Amount']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]"));
								
								System.out.println("This quarter Shared Loan Amount "+SharedLoanAmountthisquater.getText());
								
								
								
								
								System.out.println("\n");
								
								System.out.println("Average Shared Loan Amount status  :-     ");
								
								/***********************Today Average Shared Loan Amount *************************/
							       WebElement AverageSharedLoanamountToday= driver.findElement(By.xpath("//span[text()='Average Shared Loan Amount']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[1]/span[1]"));
									
									
									System.out.println("Today Average Shared Loan  Amount "+SharedLoanamountToday.getText()); 
									
									/***********************Yesterday Average Shared Loan Amount *************************/
									WebElement AverageSharedLoanAmountYesterday= driver.findElement(By.xpath("//span[text()='Average Shared Loan Amount']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[2]/span[1]"));
									
									System.out.println("Yesterday Average Shared Loan Amount "+AverageSharedLoanAmountYesterday.getText());
									
									
									/***********************This week Average Shared Loan Amount *************************/
									WebElement AverageSharedLoanAmountthisweek = driver.findElement(By.xpath("//span[text()='Average Shared Loan Amount']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[3]/span[1]"));
									
									System.out.println("This week Average Shared Loan Amount "+AverageSharedLoanAmountthisweek.getText());
									
									
									Thread.sleep(1000);
									
									/***********************This month Average Shared Loan Amount *************************/
									
									WebElement AverageSharedLoanAmountthismonth = driver.findElement(By.xpath("//span[text()='Average Shared Loan Amount']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[4]/span[1]"));
									
									System.out.println("This month Average Shared Loan Amount "+AverageSharedLoanAmountthismonth.getText());
									
									

									WebDriverWait wait9= new WebDriverWait(driver, 20);
									wait9.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Average Shared Loan Amount']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]")));
									
									
									/***********************This Quarter Average Shared Loan Amount *************************/
								 WebElement AverageSharedLoanAmountthisquater=driver.findElement(By.xpath("//span[text()='Average Shared Loan Amount']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]"));
									
									System.out.println("This quarter Average Shared Loan Amount "+AverageSharedLoanAmountthisquater.getText());
									
				
									
									
									System.out.println("\n");
									
									System.out.println("Funded Loan Amount status  :-     ");
									
									
								       WebElement FundedLoanAmountToday= driver.findElement(By.xpath("//span[text()='Funded Loan Amount']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[1]/span[1]"));
										
										
										System.out.println("Today Funded Loan Amount "+FundedLoanAmountToday.getText()); 
										
										WebElement FundedLoanAmountYesterday= driver.findElement(By.xpath("//span[text()='Funded Loan Amount']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[2]/span[1]"));
										
										System.out.println("Yesterday Funded Loan Amount "+FundedLoanAmountYesterday.getText());
										
										
										WebElement FundedLoanAmountthisweek = driver.findElement(By.xpath("//span[text()='Funded Loan Amount']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[3]/span[1]"));
										
										System.out.println("This week Funded Loan Amount "+FundedLoanAmountthisweek.getText());
										
										
										Thread.sleep(1000);
										
										WebElement FundedLoanAmountthismonth = driver.findElement(By.xpath("//span[text()='Funded Loan Amount']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[4]/span[1]"));
										
										System.out.println("This month Funded Loan Amount "+FundedLoanAmountthismonth.getText());
										
										

										WebDriverWait wait10= new WebDriverWait(driver, 20);
										wait10.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Funded Loan Amount']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]")));
										
									 WebElement FundedLoanAmountthisquater=driver.findElement(By.xpath("//span[text()='Funded Loan Amount']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]"));
										
										System.out.println("This quarter Funded Loan Amount "+FundedLoanAmountthisquater.getText());
										
									
										System.out.println("\n");
										
										System.out.println("Average Funded Loan Amount status  :-     ");
										
										
									       WebElement AverageFundedLoanAmountToday= driver.findElement(By.xpath("//span[text()='Average Funded Loan Amount']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[1]/span[1]"));
											
											
											System.out.println("Today Average Funded Loan Amount "+AverageFundedLoanAmountToday.getText()); 
											
											WebElement AverageFundedLoanAmountYesterday= driver.findElement(By.xpath("//span[text()='Average Funded Loan Amount']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[2]/span[1]"));
											
											System.out.println("Yesterday Average Funded Loan Amount "+AverageFundedLoanAmountYesterday.getText());
											
											
											WebElement AverageFundedLoanAmountthisweek = driver.findElement(By.xpath("//span[text()='Average Funded Loan Amount']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[3]/span[1]"));
											
											System.out.println("This week Average Funded Loan Amount "+AverageFundedLoanAmountthisweek.getText());
											
											
											Thread.sleep(1000);
											
											WebElement AverageFundedLoanAmountthismonth = driver.findElement(By.xpath("//span[text()='Average Funded Loan Amount']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[4]/span[1]"));
											
											System.out.println("This month Average Funded Loan Amount "+AverageFundedLoanAmountthismonth.getText());
											
											

											WebDriverWait wait11= new WebDriverWait(driver, 20);
											wait11.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Average Funded Loan Amount']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]")));
											
										 WebElement AverageFundedLoanAmountthisquater=driver.findElement(By.xpath("//span[text()='Average Funded Loan Amount']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]"));
											
											System.out.println("This quarter Average Funded Loan Amount "+AverageFundedLoanAmountthisquater.getText());
											
											
											System.out.println("\n");
											
											System.out.println("Average Fico  :-     ");
											
											
										       WebElement AverageFicoToday= driver.findElement(By.xpath("//span[text()='Average Fico']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[1]/span[1]"));
												
												
												System.out.println("Today Average Fico  "+AverageFicoToday.getText()); 
												
												WebElement AverageFicoYesterday= driver.findElement(By.xpath("//span[text()='Average Fico']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[2]/span[1]"));
												
												System.out.println("Yesterday Average Fico  "+AverageFicoYesterday.getText());
												
												
												WebElement AverageFicothisweek = driver.findElement(By.xpath("//span[text()='Average Fico']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[3]/span[1]"));
												
												System.out.println("This week Average Fico  "+AverageFicothisweek.getText());
												
												
												Thread.sleep(1000);
												
												WebElement AverageFicothismonth = driver.findElement(By.xpath("//span[text()='Average Fico']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[4]/span[1]"));
												
												System.out.println("This month Average Fico  "+AverageFicothismonth.getText());
												
												

												WebDriverWait wait12= new WebDriverWait(driver, 20);
												wait12.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Average Fico']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]")));
												
											 WebElement AverageFicothisquater=driver.findElement(By.xpath("//span[text()='Average Fico']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]"));
												
												System.out.println("This quarter Average Fico  "+AverageFicothisquater.getText());
										
	    
		
	}

}
