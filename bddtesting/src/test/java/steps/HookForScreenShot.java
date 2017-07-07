package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import parallel.ParallelFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by annguyenx1 on 7/5/2017.
 */
public class HookForScreenShot {
    private static final String SCREENSHOTDIRECTORY = "screenshot";

    @After
    public void takeScreenShot(Scenario scenario) throws Exception {
        if(scenario.isFailed()) {
            File screenshot = takeScreenShots("error_screenshot");
            InputStream screenshotStream = new FileInputStream(screenshot);
            scenario.embed(IOUtils.toByteArray(screenshotStream), "image/jpeg");
        }
    }


    private WebDriver driver = ParallelFactory.getDriver();
    public File takeScreenShots(String picture) throws Exception {
        try {
            File temp = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(temp, new File(SCREENSHOTDIRECTORY + File.separator
                    + picture));
            return temp;

        } catch (Exception e) {
            throw e;
        }
    }
}
