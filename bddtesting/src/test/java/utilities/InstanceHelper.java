package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by annguyenx1 on 7/3/2017.
 */
public class InstanceHelper {


    public static WebDriver getDriverInstance() {
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\AutomationJava\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }

}
