package testrunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureWithTags" , 
glue= {"StepDefinitions"} ,
tags = "@smoke or @regression",
monochrome = true ,
plugin = {"pretty", "html:target/HTMLReports/report.html",
		"json:target/JSONReports/report.json",
		"junit:target/XMLReports/report.xml",
		"json:target/cucumber.json"
})

public class TestRunWithSingleTag {

}
