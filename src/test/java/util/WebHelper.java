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




    public static WebDriver driver;







    public static void actionClick(WebElement element) {
        Actions action=new Actions(driver);
        action.moveToElement(element).click().build().perform();

    }

    public static WebDriver getBrowser(String browsername) {


        if(browsername.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/test/Driver/geckodriver.exe");
            FirefoxOptions options = new FirefoxOptions();
            FirefoxProfile profile = new FirefoxProfile();
            profile.setAssumeUntrustedCertificateIssuer(false);
            profile.setPreference("network.proxy.type", 1);
            profile.setPreference("network.proxy.http", "localHost");
            profile.setPreference("newtwork.proxy.http_port", 3128);
            options.setCapability(FirefoxDriver.PROFILE,profile);
            driver = new FirefoxDriver(options);
           // return driver1.get();

        }
        else if(browsername.equalsIgnoreCase("chrome")) {
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


    public static void tearDown() throws Throwable{
        driver.quit();
    }

    public static void executorClick(WebElement element){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("arguments[0].click()", element);

    }




}
