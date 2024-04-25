package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features = { ".//src//test//resources//Features//" },
        //feature={"@target/rerun.txt"},
        glue = {"stepDefinitions" }, // This Feature added so that the step definition file run according to the feature files
		
        plugin = { "pretty", "html:reports/myreport.html", "rerun:target/rerun.txt",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},

		dryRun = false, // checks mapping between scenario steps and step definition methods
		monochrome = true, // to avoid junk characters in output
		publish = true,// to publish report in cucumber server 
        tags = "@regression or @smoke"

)
public class testRunner extends AbstractTestNGCucumberTests {

}
