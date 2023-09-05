package runnerpackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\java\\com\\features\\MyApplication.feature",
					glue= "stepDefinition",
					plugin = {"pretty", "html:target/cucumber-report/cucumber.html"},
					monochrome=true,
					stepNotifications=true)
public class Testrunner1 {

}
