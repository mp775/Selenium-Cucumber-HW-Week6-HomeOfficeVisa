package gov.uk.check.visa.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/featurefile/VisaToWorkForHealthCareTest.feature",
        glue = "gov/uk/check/visa",
        tags = "@smoke",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html",
        }
)
public class HealthCareTestRunner {
}
