package StepDefination;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Features/Googlesearch.feature",
glue={"StepDefination"},
monochrome=true,
     plugin={"pretty","junit:target/TestReports/loginreport.xml"}

)

public class TestRunner {

}
