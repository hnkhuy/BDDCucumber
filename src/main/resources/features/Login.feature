Feature: Developing Project

  Scenario: Search around
    Given I navigated to Login page
    When I fill email with default email
    And I fill password with default password
    And I click on Login button
    Then I can see Engagement List page

