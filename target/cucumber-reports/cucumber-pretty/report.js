$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/TestScripts.feature");
formatter.feature({
  "name": "This Test Suite includes Test Scenarios related to MakeMyTrip",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate cheapest flight details for indigo with non stop facility(Scenario 2)",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@parallal"
    },
    {
      "name": "@1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User open the url in browser \"chrome\"",
  "keyword": "Given "
});
formatter.match({
  "location": "MakeMyTripStepDef.setup(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Select from as Bangalore to as Hyderabad",
  "keyword": "When "
});
formatter.match({
  "location": "MakeMyTripStepDef.user_Select_from_as_Bangalore_to_as_Hyderabad()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click on Search button",
  "keyword": "And "
});
formatter.match({
  "location": "MakeMyTripStepDef.user_click_on_Search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Search for cheapest flight in current week",
  "keyword": "And "
});
formatter.match({
  "location": "MakeMyTripStepDef.user_Search_for_cheapest_flight_in_current_week()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Select non stop and indigo option",
  "keyword": "And "
});
formatter.match({
  "location": "MakeMyTripStepDef.user_Select_non_stop_and_indigo_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "List the total number of flights available for that criteria",
  "keyword": "Then "
});
formatter.match({
  "location": "MakeMyTripStepDef.list_the_total_number_of_flights_available_for_that_criteria()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "MakeMyTripStepDef.user_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate More options and list of available flight(Scenario 3)",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@parallal"
    },
    {
      "name": "@1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User open the url in browser \"chrome\"",
  "keyword": "Given "
});
formatter.match({
  "location": "MakeMyTripStepDef.setup(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Hover on More Option and Capture all items",
  "keyword": "When "
});
formatter.match({
  "location": "MakeMyTripStepDef.user_Hover_on_More_Option_and_Capture_all_items()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Select a item",
  "keyword": "And "
});
formatter.match({
  "location": "MakeMyTripStepDef.user_Select_a_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Select from as Bangalore to as Hyderabad",
  "keyword": "And "
});
formatter.match({
  "location": "MakeMyTripStepDef.user_Select_from_as_Bangalore_to_as_Hyderabad()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Select a Date",
  "keyword": "And "
});
formatter.match({
  "location": "MakeMyTripStepDef.user_select_a_date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click on Search button",
  "keyword": "And "
});
formatter.match({
  "location": "MakeMyTripStepDef.user_click_on_Search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "List the total number of flights available for that criteria",
  "keyword": "Then "
});
formatter.match({
  "location": "MakeMyTripStepDef.list_the_total_number_of_flights_available_for_that_criteria()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "MakeMyTripStepDef.user_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});