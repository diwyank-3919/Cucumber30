package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)

@CucumberOptions(
		features="features\\DemoTags.feature",
		glue= {"stepDefinition"},
		//tags= {"@RegressionTest,@SmokeTest"} //or
		
		tags= {"@Functional","not @SmokeTest"},
		

		plugin= {"html:target/Cucumber/","json:target/Cucumber/Gft26augReprt.json"})

public class DemoTagsRunner {

}
