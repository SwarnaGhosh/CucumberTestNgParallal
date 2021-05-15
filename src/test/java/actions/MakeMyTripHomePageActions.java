package actions;

import locators.MakeMyTripBookingPageLocator;
import locators.MakeMyTripHomePageLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import util.WebHelper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class MakeMyTripHomePageActions {

    public MakeMyTripHomePageLocator makeMyTripHomePageLocator;
    WebDriver driver;
    public MakeMyTripHomePageActions(WebDriver driver){
        this.driver =driver;
        makeMyTripHomePageLocator =new MakeMyTripHomePageLocator(driver);
    }

    public void action(){

        Assert.assertTrue(makeMyTripHomePageLocator.makeMyTripLogo.isDisplayed());
    }

    public void selectFromCityAndToCity() throws InterruptedException {


        Thread.sleep(1000);
        //makeMyTripHomePageLocator.fromCity.click();
        WebHelper.actionClick(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[1]/label")));
        Thread.sleep(3000);
        makeMyTripHomePageLocator.fromCityTextbox.sendKeys("Bengaluru");
        Thread.sleep(2000);
        makeMyTripHomePageLocator.selectFromCity.click();

        makeMyTripHomePageLocator.toCity.click();
        Thread.sleep(1000);
        makeMyTripHomePageLocator.toCityTextbox.sendKeys("Hyderabad");
        Thread.sleep(1000);
        makeMyTripHomePageLocator.selectToCity.click();
        Thread.sleep(1000);




    }

    public MakeMyTripBookingPageActions clickSubmitButton() throws InterruptedException {

        Assert.assertTrue(makeMyTripHomePageLocator.searchButton.isDisplayed());
        WebHelper.executorClick(makeMyTripHomePageLocator.searchButton);
        Thread.sleep(2000);
        return new MakeMyTripBookingPageActions(driver);
    }

    public void mouseOverAndCapture() throws InterruptedException {

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//li[10]/a/span[2]/span"))).perform();
        Thread.sleep(5000);
        Assert.assertEquals(makeMyTripHomePageLocator.listInsideMore.size(),8);
        List<String> alloptionsUnderMore = new ArrayList<>();

        for(WebElement element:makeMyTripHomePageLocator.listInsideMore){

            alloptionsUnderMore.add(element.getText());
        }
        System.out.println("All options under More is:"+alloptionsUnderMore);

    }

    public void selectDealitemUnderMore() throws InterruptedException {
        for(WebElement element:makeMyTripHomePageLocator.listInsideMore){

            if(element.getText().equalsIgnoreCase("Deals")){

                element.click();
                Thread.sleep(1000);
                String parent = driver.getWindowHandle();
                Set<String> children = driver.getWindowHandles();
                Iterator<String> iterator = children.iterator();
                while (iterator.hasNext()){

                  String child = iterator.next();

                  if(!parent.equalsIgnoreCase(child)){

                      driver.switchTo().window(child);

                      Assert.assertTrue(makeMyTripHomePageLocator.dealHeader.isDisplayed());
                      driver.close();
                  }

                }
                driver.switchTo().window(parent);
                Thread.sleep(2000);



            }
        }


    }

    public void selectDate() throws InterruptedException {

        makeMyTripHomePageLocator.departure.click();
        Thread.sleep(1000);
        makeMyTripHomePageLocator.dateSelect.click();
        Thread.sleep(1000);
    }
}
