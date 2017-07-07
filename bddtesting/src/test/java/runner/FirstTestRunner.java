package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by annguyenx1 on 6/29/2017.
 */

@CucumberOptions(
        features = {"src/test/java/features/Register.feature"},
        plugin = {"steps.Hook",
                "pretty",
                "json:target/FirstThread.json",
                "junit:target/cucumberlog.xml"},
        glue = "steps")
public class FirstTestRunner extends AbstractTestNGCucumberTests {
}
