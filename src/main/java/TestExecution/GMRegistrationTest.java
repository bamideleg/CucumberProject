package TestExecution;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GMRegistrationTest {
	
	WebDriver driver;
	
	@Given("^that I am navigate to http://automationpractice\\.com/index\\.php$")
	public void that_I_am_navigate_to_http_automationpractice_com_index_php() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	@Then("^click on Sign_In link$")
	public void click_on_Sign_In_link() throws Throwable {
		driver.findElement(By.linkText("Sign in")).click();
	}

	@When("^user entered emailAddress and click on create an account$")
	public void user_entered_emailAddress_and_click_on_create_an_account(DataTable testdata) throws Throwable {
//		Map<String,String> testDataAsMap=testdata.asMap(String.class, String.class);
		
//	    driver.findElement(By.id("email_create")).sendKeys("bamglobal+20@gmail.com");
		driver.findElement(By.id("email_create")).sendKeys(testDataAsMap.get("emailAddress"));
	    driver.findElement(By.cssSelector("#SubmitCreate > span")).click();
	    driver.findElement(By.id("id_gender1")).click();
	    
	    Thread.sleep(3000);
	}

	@Then("^fill the registration form$")
	public void fill_the_registration_form(DataTable testdata) throws Throwable {
				
		Map<String,String> testDataAsMap=testdata.asMap(String.class, String.class);
		
		driver.findElement(By.id("customer_firstname")).click();
	    driver.findElement(By.id("customer_firstname")).sendKeys(testDataAsMap.get("FirstName"));
	    driver.findElement(By.id("customer_lastname")).click();
	    driver.findElement(By.id("customer_lastname")).sendKeys(testDataAsMap.get("LastName"));
	    driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys(testDataAsMap.get("EMail"));
	    driver.findElement(By.id("passwd")).click();
	    driver.findElement(By.id("passwd")).sendKeys(testDataAsMap.get("Password"));
	    driver.findElement(By.id("days")).click();
	    driver.findElement(By.id("days")).sendKeys(testDataAsMap.get("Day"));	
	    driver.findElement(By.id("months")).click();	
	    driver.findElement(By.id("months")).sendKeys(testDataAsMap.get("Month"));
	    driver.findElement(By.name("years")).click(); 
	    driver.findElement(By.name("years")).sendKeys(testDataAsMap.get("Year")); 
	    driver.findElement(By.name("company")).click();
	    driver.findElement(By.name("company")).sendKeys(testDataAsMap.get("Company"));
	    driver.findElement(By.name("address1")).click();
	    driver.findElement(By.name("address1")).sendKeys(testDataAsMap.get("Address"));
	    driver.findElement(By.id("city")).click();
	    driver.findElement(By.id("city")).sendKeys(testDataAsMap.get("City"));
	    driver.findElement(By.id("id_state")).click();
	    driver.findElement(By.id("id_state")).sendKeys(testDataAsMap.get("State"));
	    driver.findElement(By.id("postcode")).click();
	    driver.findElement(By.id("postcode")).sendKeys(testDataAsMap.get("Zip/PostalCode"));
	    driver.findElement(By.id("phone_mobile")).click();
	    driver.findElement(By.id("phone_mobile")).sendKeys(testDataAsMap.get("Phone"));
	    driver.findElement(By.id("alias")).click();
	    driver.findElement(By.id("alias")).sendKeys(testDataAsMap.get("AssignSecondAddresss"));
	   
	}

	@When("^user click on register button$")
	public void user_click_on_register_button() throws Throwable {
		driver.findElement(By.cssSelector("#submitAccount > span")).click();

	}
	@Then("^user should see their account on the dashboard$")
	public void user_should_see_their_account_on_the_dashboard() throws Throwable {
		String PageTitle = driver.getTitle();
		System.out.println("The page title is " + PageTitle );
		 		
		driver.findElement(By.cssSelector(".info-account")).isDisplayed();
		driver.findElement(By.cssSelector(".page-heading")).isDisplayed();
		
		driver.findElement(By.cssSelector(".page-heading")).isDisplayed();
		
		try {			
			String printMyAccount=driver.findElement(By.cssSelector(".page-heading")).getText();
			System.out.println("User is on " + printMyAccount + " page");
			
			String printWelcomeMessage=driver.findElement(By.cssSelector(".info-account")).getText();
			System.out.println(printWelcomeMessage);
			
			System.out.println("Pass");			
		}catch(Exception e) {
			System.out.println("user login failed");
			System.out.println("fail");
		}	
	}
	@Then("^click on log button$")
	public void click_on_log_button() throws Throwable {
		driver.findElement(By.linkText("Sign out")).click();
		
	}
	@Then("^user should be able to close the browser$")
	public void user_should_be_able_to_close_the_browser() throws Throwable {
		driver.quit();

	}
	
	


}
