package TestExecution;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddItemToCart {
	
	WebDriver driver;
	
	@Given("^that I am on the http://automationpractice\\.com/index\\.php$")
	public void that_I_am_on_the_http_automationpractice_com_index_php() throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

	@Given("^I Iogin with my credentials and should see logout button$")
	public void i_Iogin_with_my_credentials_and_should_see_logout_button() throws Throwable {
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.name("email")).sendKeys("bamglobal+12@gmail.com");
		driver.findElement(By.name("passwd")).sendKeys("Password@1");
		driver.findElement(By.name("SubmitLogin")).click();
		
	}
	@When("^I enter product as \"([^\"]*)\" and click on search button$")
	public void i_enter_product_as_and_click_on_search_button(String Product) throws Throwable {

		 driver.findElement(By.name("search_query")).sendKeys(Product);
		 driver.findElement(By.name("submit_search")).click();
		 
	}
	@Then("^I should see all the related items$")
	public void i_should_see_all_the_related_items() throws Throwable {		
		String productCount =driver.findElement(By.className("heading-counter")).getText();
		System.out.println("The number of product displayed is " + productCount);

	
	
	}
	@When("^I add items into the cart and items$")
	public void i_add_items_into_the_cart_and_items() throws Throwable {	
	    driver.findElement(By.xpath("//span[contains(.,'Add to cart')]")).click();
		driver.findElement(By.linkText("Proceed to checkout")).click();
//		driver.findElement(By.linkText("Continue shopping")).click();
			
	}
	@Then("^items count should be displayed in the Cart$")
	public void items_count_should_be_displayed_in_the_Cart() throws Throwable {

//		String ItemCount = driver.findElement(By.className("shopping_cart")).getText();
//		System.out.println(ItemCount);
		
		try {			
			String ItemCount = driver.findElement(By.className("shopping_cart")).getText();
			System.out.println("item found is " + ItemCount);
			System.out.println("Pass");			
		}catch(Exception e) {
			System.out.println("Item count is missing");
			System.out.println("fail");
		}

	}

	@When("^I logout and login, items should be displayed in the cart$")
	public void i_logout_and_login_items_should_be_displayed_in_the_cart() throws Throwable {
		driver.findElement(By.linkText("Sign out")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.name("email")).sendKeys("bamglobal+12@gmail.com");
		driver.findElement(By.name("passwd")).sendKeys("Password@1");
		driver.findElement(By.name("SubmitLogin")).click();	
		
//		String ItemCount = driver.findElement(By.className("shopping_cart")).getText();
//		System.out.println(ItemCount);
		
		try {			
			String ItemCountChecked = driver.findElement(By.className("shopping_cart")).getText();
			System.out.println("User logged and logged-In, item present is " + ItemCountChecked);
			System.out.println("Pass");			
		}catch(Exception e) {
			System.out.println("User logged-out and logged-In, item is not present");
			System.out.println("fail");
		}

	}

	@When("^logout and close the browser$")
	public void logout_and_close_the_browser() throws Throwable {
		driver.quit();

	}

}
