package StepDefination;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Features/login.feature",
glue={"StepDefination"},
monochrome=true,
        tags = "@Smoke",
     plugin={"pretty","junit:target/TestReports/loginreport.xml"}

)

public class TestRunner {

}
