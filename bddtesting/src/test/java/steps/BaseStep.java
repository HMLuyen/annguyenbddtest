package steps;

import org.openqa.selenium.WebDriver;
import parallel.ParallelFactory;

/**
 * Created by annguyenx1 on 7/5/2017.
 */
public class BaseStep {
    protected WebDriver driver = ParallelFactory.getDriver();
}
