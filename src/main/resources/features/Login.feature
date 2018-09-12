Feature: Demo With Google

  Scenario: Search around
    Given I navigated to Google seach page
    When I fill search content to Seach Box: "I'm so handsome"
    And I click to Search Button
    Then Search result page showed

