package com.stepdefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.cucumber.org.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class StepDefinition extends Base{
	@Given("user launch the facebook application")
	public void user_launch_the_facebook_application() {
	    getBrowser("chrome");
	    geturl("https://www.facebook.com/");
	}
	@When("Enter the  valid {string} in Email field")
	public void enter_the_valid_in_email_field(String username) {
		WebElement email = driver.findElement(By.id("email"));
		sendkeys(email, username);
	}
	@When("Enter the valid {string} in password field")
	public void enter_the_valid_in_password_field(String password) {

		WebElement pw = driver.findElement(By.id("pass"));
		sendkeys(pw, password);
	}
	@Then("Click on login button")
	public void click_on_login_button() {

	    WebElement login = driver.findElement(By.name("login"));
	    login.click();
	    
	}


}