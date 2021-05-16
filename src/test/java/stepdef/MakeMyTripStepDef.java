package stepdef;

import actions.MakeMyTripBookingPageActions;
import actions.MakeMyTripHomePageActions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import util.WebHelper;

import java.util.concurrent.TimeUnit;


public class MakeMyTripStepDef {

    private WebDriver driver;

    private MakeMyTripHomePageActions makeMyTripHomePageActions;

    private MakeMyTripBookingPageActions makeMyTripBookingPageActions;

    private WebHelper webHelper;

    @Given("^User open the url in browser \"([^\"]*)\"$")
    public void setup(String browser) throws ClassNotFoundException {

        webHelper = new WebHelper();
        driver = webHelper.getBrowser(browser);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");


    }

    @When("User Select from as Bangalore to as Hyderabad")
    public void user_Select_from_as_Bangalore_to_as_Hyderabad() throws InterruptedException {
        makeMyTripHomePageActions = new MakeMyTripHomePageActions(driver);
        makeMyTripHomePageActions.action();
        makeMyTripHomePageActions.selectFromCityAndToCity();

    }
     @And("User Click on Search button")
     public void user_click_on_Search_button() throws InterruptedException {
         makeMyTripBookingPageActions=makeMyTripHomePageActions.clickSubmitButton();
     }

    @When("User Search for cheapest flight in current week")
    public void user_Search_for_cheapest_flight_in_current_week() {
        makeMyTripBookingPageActions.selectCheapestPrice();
    }

    @When("User Select non stop and indigo option")
    public void user_Select_non_stop_and_indigo_option() throws InterruptedException {
         makeMyTripBookingPageActions.selectFilters();
    }

    @Then("List the total number of flights available for that criteria")
    public void list_the_total_number_of_flights_available_for_that_criteria() {
        makeMyTripBookingPageActions.listNoOfFlights();
    }


    @When("User Hover on More Option and Capture all items")
    public void user_Hover_on_More_Option_and_Capture_all_items() throws InterruptedException {
         makeMyTripHomePageActions=new MakeMyTripHomePageActions(driver);
         makeMyTripHomePageActions.mouseOverAndCapture();
    }

    @When("User Select a item")
    public void user_Select_a_item() throws InterruptedException {
        makeMyTripHomePageActions.selectDealitemUnderMore();
    }

    @And("User Select a Date")
    public void user_select_a_date() throws InterruptedException {

      makeMyTripHomePageActions.selectDate();
    }

}
