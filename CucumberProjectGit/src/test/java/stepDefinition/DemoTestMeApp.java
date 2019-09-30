package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoTestMeApp {
WebDriver driver;
@Given("user is on home page of TestMeApp")
public void user_is_on_home_page_of_TestMeApp() {
	 System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	 driver.findElement(By.linkText("SignIn")).click();
	
	 
}

@When("user enters {string} and {string} df")
public void user_enters_and_df(String username, String password) {
	
	driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys(username);
	driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys(password);
	driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
	driver.findElement(By.linkText("SignOut")).click();
}

@Then("user logged in successfully")
public void user_logged_in_successfully() {
	System.out.println("logged in successful");
	driver.close();
   
}
}
