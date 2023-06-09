package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
   //path of feature file
   features = "src/test/java/features/Login.feature",
   //path of step definition files
   glue = "stepDefinitions",stepNotifications =true)
public class TestRunner {

}
