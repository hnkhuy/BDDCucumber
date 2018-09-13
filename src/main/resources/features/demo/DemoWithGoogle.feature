Feature: Demo With Google

  Scenario: Search around
    Given I navigated to Google seach page
    When I fill search content to Seach Box: "I'm so handsome"
    And I click to Search Button
    Then Search result page showed

  Scenario: Login fail
    Given I navigated to Google Login page
    When I fill email to Email Box
    And I click on Email Next Button
    And I fill password to Password Box
    And I click on Password Next Button
    Then Wrong password error message showed

  # Hi
  # Sorry to say this is the last Scenario I make from now
  # Function will still be implemented and public but aid no Scenario to demo it
  # Because I will continue implementing it base on a private project
  # URL, username, password, database info... not be allowed to be public
  # Feel free to contact me.
