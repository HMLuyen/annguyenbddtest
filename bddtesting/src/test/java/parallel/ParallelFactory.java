package parallel;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by annguyenx1 on 6/29/2017.
 */
public class ParallelFactory {

    /** Handle parallel for threads **/
    private static ConcurrentHashMap<String, WebDriver> driverPool = new ConcurrentHashMap<String, WebDriver>();
//    public static ConcurrentHashMap<String, PageController> pageControllerPool = new ConcurrentHashMap<String, PageController>();

    public static void setDriver(WebDriver driver) {
        driverPool.put(Thread.currentThread().getName(), driver);
    }


    public static WebDriver getDriver() {
        return driverPool.get(Thread.currentThread().getName());
    }

    public static void freeDriverInstance() {
        driverPool.get(Thread.currentThread().getName()).quit();
    }

    /** Handle parallel for PageController **/

//    public static synchronized void setPageController(PageController pageController) {
//        pageControllerPool.put(thread, pageController);
//    }
//
//
//    public static synchronized PageController getPageController() {
//        return pageControllerPool.get(thread);
//    }

}
