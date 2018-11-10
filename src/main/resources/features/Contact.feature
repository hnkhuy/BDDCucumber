Feature: Contact feature

  Scenario: Login and go to Contact page
    Given I navigated to Login page
    When I fill email with default email
    And I fill password with default password
    And I click on Login button
    Then I can see Engagement List page
    Then I click on Contacts Page link
    And I can see Contacts Page