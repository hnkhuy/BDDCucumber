Feature: Demo With Google

  Scenario: Search around
    Given I navigated to Google seach page
    When I fill search content to Seach Box: "I'm so handsome"
    And I click to Search Button
    Then Search result page showed

  Scenario: Login fail
    Given I navigated to Google Login page
    When I fill email to Email Box
    And I click on Next Button
    And I fill email to Email Box
    And I click on Next Button
    Then Wrong password error message showed