package StepDefinitions;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", glue= {"StepDefinitions"},
monochrome=true,
plugin= {"pretty", "junit:target/JUnitReports/report.xml"}
)
public class TestRunner {

}
