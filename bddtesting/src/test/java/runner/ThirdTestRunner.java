package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by annguyenx1 on 7/4/2017.
 */
@CucumberOptions(
        features = {"src/test/java/features/Register3.feature"},
        plugin = {"steps.Hook",
                "pretty",
                "json:target/ThirdThread.json",
                "junit:target/cucumberlog3.xml"},
        glue = "steps")
public class ThirdTestRunner extends AbstractTestNGCucumberTests {
}
