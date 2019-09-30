package stepDefinition;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DatatableTest {
WebDriver driver;
@Given("user is on heroku home page")
public void user_is_on_heroku_home_page() {
	System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://the-internet.herokuapp.com/login");
	 
	
}

@When("user enters username and passwords")
public void user_enters_username_and_passwords(io.cucumber.datatable.DataTable userCredentials) {
	List<String> data=userCredentials.asList();
	
	driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys(data.get(0));
	driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys(data.get(1));
	
	driver.findElement(By.xpath("//i[contains(.,'Login')]")).click();
}

@Then("display ma=essage user logged in successfully")
public void display_ma_essage_user_logged_in_successfully() throws InterruptedException {
  System.out.println("logged in successfully");
  Thread.sleep(3000);
  driver.close();
}


}
