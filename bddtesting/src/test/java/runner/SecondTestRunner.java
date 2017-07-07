package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by Dell on 6/29/2017.
 */
@CucumberOptions(
        features = {"src/test/java/features/Register2.feature"},
        plugin = {"steps.Hook",
                    "pretty",
                "json:target/SecondThread.json",
                "junit:target/cucumberlog2.xml"},
        glue = "steps")
public class SecondTestRunner extends AbstractTestNGCucumberTests {
}
