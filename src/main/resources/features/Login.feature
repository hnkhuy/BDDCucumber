Feature: Developing Project

  Scenario: Login Execute Automation
    Given I navigated to EA Login page
    When I fill email and password
    And I click on EA Login button
    Then I can see User Form page