Feature: This Test Suite includes Test Scenarios related to MakeMyTrip


  @parallal
  @1
  Scenario: Validate cheapest flight details for indigo with non stop facility(Scenario 2)
    Given User open the url in browser "chrome"
    When User Select from as Bangalore to as Hyderabad
    And User Click on Search button
    And User Search for cheapest flight in current week
    And User Select non stop and indigo option
    Then List the total number of flights available for that criteria


  @parallal
@2
  Scenario: Validate cheapest flight details for indigo with non stop facility_firefox(Scenario 2)
    Given User open the url in browser "firefox"
    When User Select from as Bangalore to as Hyderabad
    And User Click on Search button
    And User Search for cheapest flight in current week
    And User Select non stop and indigo option
    Then List the total number of flights available for that criteria

  @parallal
  Scenario: Validate More options and list of available flight(Scenario 3)
    Given User open the url in browser "chrome"
    When User Hover on More Option and Capture all items
    And User Select a item
    And User Select from as Bangalore to as Hyderabad
    And User Select a Date
    And User Click on Search button
    Then List the total number of flights available for that criteria



  @parallal
  Scenario: Validate More options and list of available flight_firefox(Scenario 3)
    Given User open the url in browser "firfox"
    When User Hover on More Option and Capture all items
    And User Select a item
    And User Select from as Bangalore to as Hyderabad
    And User Select a Date
    And User Click on Search button
    Then List the total number of flights available for that criteria














