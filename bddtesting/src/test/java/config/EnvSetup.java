package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by annguyenx1 on 4/27/2017.
 */
public class EnvSetup {
    static Properties prop = new Properties();
    static {

        try {
            FileInputStream fileInput = new FileInputStream("envconfig.properties");
            prop.load(fileInput);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String SITE = prop.getProperty("SITE") ;
    public static int SELENIUM_TIMEOUT_SECONDS = Integer.parseInt(prop.getProperty("SELENIUM_TIMEOUT_SECONDS"));

}