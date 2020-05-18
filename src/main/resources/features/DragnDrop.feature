Feature: Developing Project

  Scenario: Login Execute Automation
    Given I navigated to EA Login page
    When I fill email and password
    And I click on EA Login button
    And I click on Dragging and Sorting tab
    Then I can see Dragging and Sorting page
