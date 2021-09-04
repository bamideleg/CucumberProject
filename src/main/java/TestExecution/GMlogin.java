package TestExecution;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GMlogin {
	
	WebDriver driver;
	
	@Given("^that I navigate to http://automationpractice\\.com/index\\.php$")
	public void that_I_navigate_to_http_automationpractice_com_index_php() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}
	@And("^click on the sign-in link$")
	public void click_on_the_sign_in_link() throws Throwable {
		driver.findElement(By.linkText("Sign in")).click();

	}
	@When("^user enter emails as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enter_emails_as_and_password_as(String EmailAddress, String Password) throws Throwable {
		
		driver.findElement(By.name("email")).sendKeys(EmailAddress);
		driver.findElement(By.name("passwd")).sendKeys(Password);

	}
	@When("^click on submit button$")
	public void click_on_submit_button() throws Throwable {
		driver.findElement(By.name("SubmitLogin")).click();

	}
	@Then("^user should see the welcome message$")
	public void user_should_see_the_welcome_message() throws Throwable {
		driver.findElement(By.className("page-heading")).isDisplayed();
		driver.findElement(By.className("info-account")).getText();
		
		try {			
			String printMyAccount=driver.findElement(By.className("page-heading")).getText();
			System.out.println("User is on " + printMyAccount + "page");
			
			String printWelcomeMessage=driver.findElement(By.className("info-account")).getText();
			System.out.println("The welcome message is " + printWelcomeMessage);
			System.out.println("Pass");			
		}catch(Exception e) {
			System.out.println("user login failed");
			System.out.println("fail");
		}	

	}
	@Then("^click on logout button$")
	public void click_on_logout_button() throws Throwable {
		driver.findElement(By.linkText("Sign out")).click();

	}
	@Then("^close the brows$")
	public void close_the_brows() throws Throwable {
		driver.quit();

	}
}
