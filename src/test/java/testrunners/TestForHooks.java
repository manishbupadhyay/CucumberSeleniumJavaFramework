package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureWithHooks/hooks.feature" , glue= {"StepForHooks"} ,
monochrome = true ,
plugin = {"pretty", "html:target/HTMLReports/report.html",
		"json:target/JSONReports/report.json",
		"junit:target/XMLReports/report.xml",
		"json:target/cucumber.json"
})

public class TestForHooks {

}
