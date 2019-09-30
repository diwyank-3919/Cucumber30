package stepDefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultipleLoginTest {
	WebDriver driver;
	@Given("user is on DemoWebShop wage")
	public void user_is_on_DemoWebShop_wage() {
	    
	    	 System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://the-internet.herokuapp.com/login");
	 

	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.xpath("//input[contains(@class,'email')]")).sendKeys(username);
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[contains(@class,'button-1 login-button')]")).click();
		
		
		
	    
	}

	@Then("Display message Loggedin successfully")
	public void display_message_Loggedin_successfully() {
		System.out.println("login successful");
		driver.findElement(By.linkText("Log out")).click();
	   
	}

}
