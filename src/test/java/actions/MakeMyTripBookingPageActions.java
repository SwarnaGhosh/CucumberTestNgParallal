package actions;


import locators.MakeMyTripBookingPageLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class MakeMyTripBookingPageActions {


    public MakeMyTripBookingPageLocator makeMyTripBookingPageLocator;


    public MakeMyTripBookingPageActions(WebDriver driver){

          makeMyTripBookingPageLocator = new MakeMyTripBookingPageLocator(driver);
    }


    public void selectCheapestPrice(){

        List<WebElement> price=makeMyTripBookingPageLocator.pricelist;
        List<Integer> pricelist = new ArrayList<Integer>();

        for(int i=0;i<price.size();i++) {
            //System.out.println(price.get(i).getText());
            Integer priceInt = Integer.valueOf(price.get(i).getText().replaceAll("[₹ ,]", ""));
            pricelist.add(priceInt);


        }


        int minprice = Collections.min(pricelist);

        for(int i=0;i<price.size();i++){
            Integer priceInt = Integer.valueOf(price.get(i).getText().replaceAll("[₹ ,]", ""));

            if(priceInt==minprice){

                price.get(i).click();
                System.out.println("Clicked");
                break;
            }

        }
    }

    public void selectFilters() throws InterruptedException {

        makeMyTripBookingPageLocator.indigoFilter.click();
        Thread.sleep(2000);
        makeMyTripBookingPageLocator.nonStopFilter.click();
    }


    public void listNoOfFlights(){

        System.out.println(  "Total number of flights available is:"+makeMyTripBookingPageLocator.flightList.size());
    }


}

