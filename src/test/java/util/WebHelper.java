package util;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class WebHelper {


    public WebDriver driver;


    public  WebDriver getBrowser(String browsername) {

        if(browsername.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/test/Driver/geckodriver.exe");
            FirefoxOptions options = new FirefoxOptions();
            FirefoxProfile profile = new FirefoxProfile();
            profile.setAssumeUntrustedCertificateIssuer(false);
            options.setCapability(FirefoxDriver.PROFILE,profile);
            driver = new FirefoxDriver(options);
           // return driver1.get();

        }
        else {
            System.setProperty("webdriver.chrome.driver", "src/test/Driver/chromedriver.exe");
            HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
            chromePrefs.put("profile.default_content_settings.popups", 0);
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("prefs", chromePrefs);
            options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
            driver = new ChromeDriver(options);

        }




      return driver;
    }





}
