package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
glue = {"stepdefinitions"}, dryRun = false, tags = "@smoke"
	)

//tags="@tag1 or @tag2"
//tags="@tag1 and @tag2"
//tags="@tag1 or not @tag2"



public class TestRunner {

}
