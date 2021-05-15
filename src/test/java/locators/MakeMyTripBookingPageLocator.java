package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import util.WebHelper;

import java.util.List;

public class MakeMyTripBookingPageLocator {

    public MakeMyTripBookingPageLocator(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(how= How.XPATH,using = "//*[@id=\"weeklyFare\"]/div/div[2]/ul/li[@class=\"slider-slide slide-visible\"]/div/a/p[2]")
    public List<WebElement> pricelist;


    @FindBy(how= How.XPATH,using = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div/div[1]/div/label[3]/div/span[2]/span")
    public WebElement indigoFilter;


    @FindBy(how= How.XPATH,using = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div/div[2]/div/label[4]/div/span[2]/span")
    public WebElement nonStopFilter;



    @FindBy(how= How.XPATH,using = "//*[@id=\"premEcon\"]/div/div")
    public List<WebElement> flightList;


}
