package io.anla;

/**
 * Coding Anl on 2017/6/15.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;


public class test {
    public static void main(String[] args){
        //引入geckodriver驱动

//        System.setProperty("webdriver.firefox.bin",
//                "D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
//        System.setProperty("webdriver.firefox.marionette","D:\\testerhome\\webdriver\\geckodriver-v0.9.0-win64\\geckodriver.exe");
//        System.setProperty("webdriver.chrome.marionette","D:\\testerhome\\webdriver\\chromedriver.exe");

//        System.setProperty("webdriver.firefox.marionette","D:\\testerhome\\webdriver\\geckodriver-v0.9.0-win64\\geckodriver.exe");
        //定义驱动对象为 FirefoxDriver 对象
        WebDriver driver = new FirefoxDriver();
        //驱动的网址
        driver.get("https://www.baidu.com/");
        //浏览器窗口变大
        driver.manage().window().maximize();
        //定位输入框元素
        WebElement txtbox = driver.findElement(By.name("wd"));

        //在输入框输入文本
        txtbox.sendKeys("HelloWorld");

        //定位按钮元素
        WebElement btn = driver.findElement(By.id("su"));

        //点击按钮
        btn.click();

        //关闭驱动
        driver.close();
    }
}