
package runnerpackage;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
//@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\r.lakshminarayana\\Downloads\\SMOKE_TEST\\Practice_Cucumber2\\features\\SauceDemo.feature",
					glue= {"stepDefinition"},
					plugin = { "pretty", "html:target/cucumber-report/cucumber.html"},
					monochrome=true)
						
public class TestRunner2 extends  AbstractTestNGCucumberTests {
	
}