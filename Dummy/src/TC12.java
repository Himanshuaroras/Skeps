import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC12 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\New Workspace\\Dummy\\exe2files\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://3.132.178.8/dashboard/skeps/metrics");
		
		//WebDriverWait wait1= new WebDriverWait(driver, 20);
		//wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/app-root/app-auth/div/div/div/div[2]/div/div/div/h1")));
		
		
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
		
		WebElement Evathisweekleads = driver.findElement(By.xpath("//span[contains(text(),'Evaluated Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[3]/span[1]"));
		
		System.out.println("This week Evaluated leads "+Evathisweekleads.getText());
		
		
		//Thread.sleep(1000);
		
		WebElement Evathismonthleads = driver.findElement(By.xpath("//span[contains(text(),'Evaluated Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[4]/span[1]"));
		
		System.out.println("This month Evaluated leads "+Evathismonthleads.getText());
		
		WebDriverWait wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Evaluated Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]")));
		
		WebElement Evathisquaterleads=driver.findElement(By.xpath("//span[contains(text(),'Evaluated Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]"));
		
		System.out.println("This quarter Evaluated leads "+Evathisquaterleads.getText());
		
		System.out.println("\n");
		
		
		System.out.println("Approved leads status  :-     ");
		
		
       WebElement ApproveTodayleads= driver.findElement(By.xpath("//span[contains(text(),'Approved Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[1]/span[1]"));
		
		
		System.out.println("Today Approved leads "+ApproveTodayleads.getText());  
		
		
       WebElement ApproveYesterdayLeads= driver.findElement(By.xpath("//span[contains(text(),'Approved Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[2]/span[1]"));
		
		System.out.println("Yesterday Approved leads "+ApproveYesterdayLeads.getText());
		
		
      WebElement Approvethisweekleads = driver.findElement(By.xpath("//span[contains(text(),'Approved Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[3]/span[1]"));
		
		System.out.println("This week Approved leads "+Approvethisweekleads.getText());
		
		
        Thread.sleep(1000);
		
		WebElement Approvethismonthleads = driver.findElement(By.xpath("//span[contains(text(),'Approved Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[4]/span[1]"));
		
		System.out.println("This month Approved leads "+Approvethismonthleads.getText());
		
		
		WebDriverWait wait2= new WebDriverWait(driver, 20);
		wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Approved Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]")));
		
	 WebElement Approvethisquaterleads=driver.findElement(By.xpath("//span[contains(text(),'Approved Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]"));
		
		System.out.println("This quarter Approved leads "+Approvethisquaterleads.getText());
		
		
		
		System.out.println("\n");
		
		System.out.println("Shared leads status  :-     ");
		
		
	       WebElement SharedTodayleads= driver.findElement(By.xpath("//span[contains(text(),'Shared Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[1]/span[1]"));
			
			
			System.out.println("Today Shared leads "+SharedTodayleads.getText());  
			
			
			WebElement SharedYesterdayLeads= driver.findElement(By.xpath("//span[contains(text(),'Shared Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[2]/span[1]"));
			
			System.out.println("Yesterday Shared leads "+SharedYesterdayLeads.getText());
			
			
			WebElement Sharedthisweekleads = driver.findElement(By.xpath("//span[contains(text(),'Shared Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[3]/span[1]"));
			
			System.out.println("This week Shared leads "+Sharedthisweekleads.getText());
			
			
			Thread.sleep(1000);
			
			WebElement Sharedthismonthleads = driver.findElement(By.xpath("//span[contains(text(),'Shared Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[4]/span[1]"));
			
			System.out.println("This month Shared leads "+Sharedthismonthleads.getText());
			
			

			WebDriverWait wait3= new WebDriverWait(driver, 20);
			wait3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Shared Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]")));
			
		 WebElement Sharedthisquaterleads=driver.findElement(By.xpath("//span[contains(text(),'Shared Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]"));
			
			System.out.println("This quarter Shared leads "+Sharedthisquaterleads.getText());
			
		
			System.out.println("\n");
			
			System.out.println("Funded leads status  :-     ");
			
			
		       WebElement FundedTodayleads= driver.findElement(By.xpath("//span[contains(text(),'Funded Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[1]/span[1]"));
				
				
				System.out.println("Today Funded leads "+FundedTodayleads.getText()); 
				
				WebElement FundedYesterdayLeads= driver.findElement(By.xpath("//span[contains(text(),'Funded Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[2]/span[1]"));
				
				System.out.println("Yesterday Funded leads "+FundedYesterdayLeads.getText());
				
				
				WebElement Fundedthisweekleads = driver.findElement(By.xpath("//span[contains(text(),'Funded Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[3]/span[1]"));
				
				System.out.println("This week Funded leads "+Fundedthisweekleads.getText());
				
				
				Thread.sleep(1000);
				
				WebElement Fundedthismonthleads = driver.findElement(By.xpath("//span[contains(text(),'Funded Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[4]/span[1]"));
				
				System.out.println("This month Funded leads "+Fundedthismonthleads.getText());
				
				

				WebDriverWait wait4= new WebDriverWait(driver, 20);
				wait4.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Funded Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]")));
				
			 WebElement Fundedthisquaterleads=driver.findElement(By.xpath("//span[contains(text(),'Funded Leads')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]"));
				
				System.out.println("This quarter Funded leads "+Fundedthisquaterleads.getText());
		
		
				System.out.println("\n");
				
				System.out.println("Approval Rate status  :-     ");
				
				
			       WebElement ApprovalrateToday= driver.findElement(By.xpath("//span[contains(text(),'Approval Rate')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[1]/span[1]"));
					
					
					System.out.println("Today Approval Rate "+ApprovalrateToday.getText()); 
					
					WebElement ApprovalrateYesterday= driver.findElement(By.xpath("//span[contains(text(),'Approval Rate')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[2]/span[1]"));
					
					System.out.println("Yesterday Approval Rate "+ApprovalrateYesterday.getText());
					
					
					WebElement Approvalratethisweek = driver.findElement(By.xpath("//span[contains(text(),'Approval Rate')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[3]/span[1]"));
					
					System.out.println("This week Approval Rate "+Approvalratethisweek.getText());
					
				
					Thread.sleep(1000);
					
					WebElement Approvalratethismonth = driver.findElement(By.xpath("//span[contains(text(),'Approval Rate')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[4]/span[1]"));
					
					System.out.println("This month Approval Rate "+Approvalratethismonth.getText());
					
					

					WebDriverWait wait5= new WebDriverWait(driver, 20);
					wait5.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Approval Rate')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]")));
					
				 WebElement Approvedratethisquater=driver.findElement(By.xpath("//span[contains(text(),'Approval Rate')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]"));
					
					System.out.println("This quarter Approved rate "+Approvedratethisquater.getText());
			
				
					System.out.println("\n");
					
					System.out.println("Shared Rate status  :-     ");
					
					
				       WebElement SharedrateToday= driver.findElement(By.xpath("//span[contains(text(),'Shared Rate')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[1]/span[1]"));
						
						
						System.out.println("Today Shared Rate "+SharedrateToday.getText()); 
						
						WebElement SharedrateYesterday= driver.findElement(By.xpath("//span[contains(text(),'Shared Rate')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[2]/span[1]"));
						
						System.out.println("Yesterday Shared Rate "+SharedrateYesterday.getText());
						
						
						WebElement Sharedratethisweek = driver.findElement(By.xpath("//span[contains(text(),'Shared Rate')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[3]/span[1]"));
						
						System.out.println("This week Shared Rate "+Sharedratethisweek.getText());
						
						

						Thread.sleep(1000);
						
						WebElement Sharedratethismonth = driver.findElement(By.xpath("//span[contains(text(),'Shared Rate')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[4]/span[1]"));
						
						System.out.println("This month Shared Rate "+Sharedratethismonth.getText());
						
						

						WebDriverWait wait6= new WebDriverWait(driver, 20);
						wait6.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Shared Rate')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]")));
						
					 WebElement Sharedratethisquater=driver.findElement(By.xpath("//span[contains(text(),'Shared Rate')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]"));
						
						System.out.println("This quarter Shared rate "+Sharedratethisquater.getText());
						
						
						System.out.println("\n");
						
						System.out.println("Funded Rate status  :-     ");
						
						
					       WebElement FundedrateToday= driver.findElement(By.xpath("//span[contains(text(),'Funded Rate')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[1]/span[1]"));
							
							
							System.out.println("Today Funded Rate "+FundedrateToday.getText()); 
							
							WebElement FundedrateYesterday= driver.findElement(By.xpath("//span[contains(text(),'Funded Rate')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[2]/span[1]"));
							
							System.out.println("Yesterday Funded Rate "+FundedrateYesterday.getText());
							
							
							WebElement Fundedratethisweek = driver.findElement(By.xpath("//span[contains(text(),'Funded Rate')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[3]/span[1]"));
							
							System.out.println("This week Funded Rate "+Fundedratethisweek.getText());
							
							

							Thread.sleep(1000);
							
							WebElement Fundedratethismonth = driver.findElement(By.xpath("//span[contains(text(),'Funded Rate')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[4]/span[1]"));
							
							System.out.println("This month Funded Rate "+Fundedratethismonth.getText());
							
							

							WebDriverWait wait7= new WebDriverWait(driver, 20);
							wait7.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Funded Rate')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]")));
							
						 WebElement Fundedratethisquater=driver.findElement(By.xpath("//span[contains(text(),'Funded Rate')]/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]"));
							
							System.out.println("This quarter Funded rate "+Fundedratethisquater.getText());
							
				
						
							
							System.out.println("\n");
							
							System.out.println("Shared Loan Amount status  :-     ");
							
							
						       WebElement SharedLoanamountToday= driver.findElement(By.xpath("//span[text()='Shared Loan Amount']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[1]/span[1]"));
								
								
								System.out.println("Today Shared Loan Amount "+SharedLoanamountToday.getText()); 
								
								WebElement SharedLoanAmountYesterday= driver.findElement(By.xpath("//span[text()='Shared Loan Amount']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[2]/span[1]"));
								
								System.out.println("Yesterday Shared Loan Amount "+SharedLoanAmountYesterday.getText());
								
								
								WebElement SharedLoanAmountthisweek = driver.findElement(By.xpath("//span[text()='Shared Loan Amount']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[3]/span[1]"));
								
								System.out.println("This week Shared Loan Amount "+SharedLoanAmountthisweek.getText());
								
								
								Thread.sleep(1000);
								
								WebElement SharedLoanAmountthismonth = driver.findElement(By.xpath("//span[text()='Shared Loan Amount']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[4]/span[1]"));
								
								System.out.println("This month Shared Loan Amount "+SharedLoanAmountthismonth.getText());
								
								

								WebDriverWait wait8= new WebDriverWait(driver, 20);
								wait8.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Shared Loan Amount']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]")));
								
							 WebElement SharedLoanAmountthisquater=driver.findElement(By.xpath("//span[text()='Shared Loan Amount']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]"));
								
								System.out.println("This quarter Shared Loan Amount "+SharedLoanAmountthisquater.getText());
								
								
								
								
								System.out.println("\n");
								
								System.out.println("Average Shared Loan Amount status  :-     ");
								
								
							       WebElement AverageSharedLoanamountToday= driver.findElement(By.xpath("//span[text()='Average Shared Loan Amount']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[1]/span[1]"));
									
									
									System.out.println("Today Average Shared Loan  Amount "+SharedLoanamountToday.getText()); 
									
									WebElement AverageSharedLoanAmountYesterday= driver.findElement(By.xpath("//span[text()='Average Shared Loan Amount']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[2]/span[1]"));
									
									System.out.println("Yesterday Average Shared Loan Amount "+AverageSharedLoanAmountYesterday.getText());
									
									
									WebElement AverageSharedLoanAmountthisweek = driver.findElement(By.xpath("//span[text()='Average Shared Loan Amount']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[3]/span[1]"));
									
									System.out.println("This week Average Shared Loan Amount "+AverageSharedLoanAmountthisweek.getText());
									
									
									Thread.sleep(1000);
									
									WebElement AverageSharedLoanAmountthismonth = driver.findElement(By.xpath("//span[text()='Average Shared Loan Amount']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[4]/span[1]"));
									
									System.out.println("This month Average Shared Loan Amount "+AverageSharedLoanAmountthismonth.getText());
									
									

									WebDriverWait wait9= new WebDriverWait(driver, 20);
									wait9.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Average Shared Loan Amount']/parent::span[@class='mat-column-name-flex']/parent::span[@class='mat-cell mat-column-name highlight-cell mobile-full-width-cell mr-3']//following-sibling::span[5]/span[1]")));
									
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
