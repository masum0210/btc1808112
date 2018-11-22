
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	WebDriver dr;
	
	@Given("^open Browser$")
	public void open_Browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/masumparvezapu/Downloads/chromedriver");
		dr = new ChromeDriver();
	   
	}

	@Given("^navigate to facebook URL$")
	public void navigate_to_facebook_URL() throws Throwable {
		dr.get("https://www.facebook.com/");
	    
	}

	@When("^user type userId on user ID on box$")
	public void user_type_userId_on_user_ID_on_box() throws Throwable {
	    dr.findElement(By.id("email")).sendKeys("UserID");
	}

	@When("^user type password on password box$")
	public void user_type_password_on_password_box() throws Throwable {
	    dr.findElement(By.id("password")).sendKeys("0000");
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
	   dr.findElement(By.id("u_0_2")).click();
	}

	@Then("^user should be in profile page$")
	public void user_should_be_in_profile_page() throws Throwable {
	   System.out.println("I am in profile page");
	}

	@When("^user type \"([^\"]*)\" on user ID on box$")
	public void user_type_on_user_ID_on_box(String arg1) throws Throwable {
	    dr.findElement(By.id("email")).sendKeys(arg1);
	}

	@When("^user type \"([^\"]*)\" on password box$")
	public void user_type_on_password_box(String arg1) throws Throwable {
		dr.findElement(By.id("password")).sendKeys(arg1);
		dr.quite();
	}


}
