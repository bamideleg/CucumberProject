package TestRunner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

		
		
@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "Features",
		glue = {"TestExecution"},
		format = {"pretty","html:test-outout"},
		monochrome = true,
		strict = true,
		dryRun = false
		
		
		)

public class cucumberRunner {


}
