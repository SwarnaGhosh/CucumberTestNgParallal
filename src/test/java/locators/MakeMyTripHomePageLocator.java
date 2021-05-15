package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import util.WebHelper;

import java.util.List;

public class MakeMyTripHomePageLocator {
    WebDriver driver;


    public MakeMyTripHomePageLocator(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(how= How.XPATH,using = "//img[@alt=\"Make My Trip\"]")
    public WebElement makeMyTripLogo;

    @FindBy(how= How.XPATH,using = "//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[1]/label")
    public WebElement fromCity;

    @FindBy(how= How.CSS,using = "input[placeholder='From']")
    public WebElement fromCityTextbox;

    @FindBy(how= How.ID,using = "toCity")
    public WebElement toCity;

    @FindBy(how= How.CSS,using = "input[placeholder='To']")
    public WebElement toCityTextbox;

    @FindBy(how= How.XPATH,using = "//li[@role='option']/div/div/p[contains(text(),'Bengaluru')]")
    public WebElement selectFromCity;

    @FindBy(how= How.XPATH,using = "//li[@role='option']/div/div/p[contains(text(),'Hyderabad')]")
    public WebElement selectToCity;

    @FindBy(how = How.XPATH,using = "//a[normalize-space()='Search']")
    public WebElement searchButton;

    @FindBy(how = How.XPATH,using = "//div[@class='moreOption font16 latoBold']/a")
    public List<WebElement>listInsideMore ;

    @FindBy(how = How.XPATH,using = "//li[10]/a/span[2]/span")
    public WebElement moreOption;

    @FindBy(how = How.XPATH,using = "//h1[contains(text(),\"Daily Deals\")]")
    public WebElement dealHeader;

    @FindBy(how = How.XPATH,using = "//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[3]/label/span")
    public WebElement departure;

    @FindBy(how = How.XPATH,using = "//div[@class = 'DayPicker-Month'][1]//div[@class='DayPicker-Body']//div[contains(@class,'DayPicker-Day--selected')]")
    public WebElement dateSelect;











}
