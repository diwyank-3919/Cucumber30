package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)

@CucumberOptions(
		features="features\\CucumberDatatable.feature",
		glue= {"stepDefinition"}
	
		
)
		


public class DatatableTestRunner {

}
