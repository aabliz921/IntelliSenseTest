#  https://reference-test.intellisense.io/#!/id/dashboards/1471
#  ❖ A dashboard created with different widgets types, there is some ability for this
#  dashboard you can use through the toolbar on the top right corner..
#  ❖ Set the dates to Nov 2, 2020 11:35 AM GMT To Feb 14, 2022 12:35 PM GMT to see
#  some data.

#  Task Request
#  ● Creating a Maven Selenium project with Page object models, to cover:
#  ○ 2 happy scenarios for the dashboard mentioned in the above link
#  ○ 2 alternative scenarios
#  ● Required dependencies, plugins, using Java testNG and assertions.
#  ● Produce the reporting outputs using Allure Reporting





@wip
Feature: Login

  Background:User login Brains-app login page
    Given navigato the Brain-app signin page
    When User on the Brains.App screen
    Then User enters valid credential
    And Clicks the signin button


  Scenario: Verify login functionality
    When User on the Search subtitle page
    Then User goes to this url "https://reference-test.intellisense.io/#!/id/dashboards/1471"
    And User on the Brains.App screen
    Then User enters date from date "Nov 2020" time "11:35 AM GMT" to date "Feb 2022" time "12:35 PM GMT" in the date fields
    And User sees the inputed data "Nov 2, 2020 11:35 AM" to "Feb 14, 2022 12:35 PM" on the page




