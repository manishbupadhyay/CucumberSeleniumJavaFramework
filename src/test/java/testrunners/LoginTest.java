package testrunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/LoginFeature/login.feature" , glue= {"StepDefinitions"} ,
monochrome = true ,
plugin = {"pretty", "html:target/HTMLReports/report.html",
		"json:target/JSONReports/report.json",
		"junit:target/XMLReports/report.xml",
		"json:target/cucumber.json"
})

public class LoginTest {

}
