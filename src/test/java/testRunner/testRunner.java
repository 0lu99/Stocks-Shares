package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features=".//Features/StockInfo.feature",
		glue="stepDefinitions"
		//dryRun = true
		//monochrome = true,
		//plugin = {"pretty", "html: test-output"}
		)

public class testRunner {

}
