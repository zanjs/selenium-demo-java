package utils;

import java.io.File;

import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

/**
 * Firefox工具类
 *
 * @author dehua.ye
 *
 */
public class FirefoxUtils {
    /**
     * 设置Firefox路径，返回FirefoxDriver
     *
     * @param path
     *            Firefox路径
     * @return FirefoxDriver
     */
    public static FirefoxDriver getFirefoxDriver(String path) {
        File pathToBinary = new File(path);
        FirefoxBinary firefoxBinary = new FirefoxBinary(pathToBinary);
        FirefoxProfile firefoxProfile = new FirefoxProfile();
        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Mozilla Firefox\\geckodriver.exe");
        return new FirefoxDriver(firefoxBinary, firefoxProfile);
    }

    /**
     * 设置默认Firefox路径，返回FirefoxDriver
     *
     * @return FirefoxDriver
     */
    public static FirefoxDriver getFirefoxDriver() {
        return FirefoxUtils.getFirefoxDriver("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
    }
}