package pageobjects;

import config.EnvSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import parallel.ParallelFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by annguyenx1 on 6/29/2017.
 */
public class Page {
    public WebDriver driver;

    public Page() {
        driver = ParallelFactory.getDriver();
        PageFactory.initElements(driver, this);
    }
    public void navigateToPage(String urlOfPage) {
        driver.get(urlOfPage);
    }
    public WebElement wait_for_element_is_present(By locator) {
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
        wait.withTimeout(EnvSetup.SELENIUM_TIMEOUT_SECONDS, TimeUnit.SECONDS);
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public WebElement wait_for_element_is_clickable(WebElement element) {
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
        wait.withTimeout(EnvSetup.SELENIUM_TIMEOUT_SECONDS, TimeUnit.SECONDS);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public WebElement wait_for_element_is_visible(By locator) {
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
        wait.withTimeout(EnvSetup.SELENIUM_TIMEOUT_SECONDS, TimeUnit.SECONDS);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public String get_text_of_element(By locator) {
        return wait_for_element_is_visible(locator).getText();
    }
}
