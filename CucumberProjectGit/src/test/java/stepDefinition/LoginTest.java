package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	
	WebDriver driver;
	@Given("user is on home page")
	public void user_is_on_home_page() {
	 System.out.println("user is on home page");
	 
	 System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://www.newtours.demoaut.com/");
	 
	 driver.findElement(By.name("userName")).sendKeys("mercury");
	 driver.findElement(By.name("password")).sendKeys("mercury");
	 
	 driver.findElement(By.name("login")).click();
	 
	 
	 
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("user enters username and password");
	}

	@Then("user login successful")
	public void user_login_successful() {
		System.out.println("user login successful");
	}


}
