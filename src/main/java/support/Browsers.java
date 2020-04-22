package support;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Browsers {

    public static WebDriver carregaDriver(String browser) {

        final ChromeOptions optionsChrome = new ChromeOptions();
        DesiredCapabilities capabilities = new DesiredCapabilities();

        switch (browser.toLowerCase()) {
            case "chrome":
                optionsChrome.addArguments("--start-maximized");
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver(optionsChrome);
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                capabilities = DesiredCapabilities.firefox();
                capabilities.setCapability("marionette", true);
                return new FirefoxDriver(capabilities);

            default:
                return null;
        }
    }
}
