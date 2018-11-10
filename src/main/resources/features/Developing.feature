Feature: Developing Project

  Scenario: Login and go around
    Given I navigated to Login page
    When I fill email with default email
    And I fill password with default password
    And I click on Login button
    Then I can see Engagement List page
    Then I click on Engagement named: "abc"
    And I should see Engagement Detail page of Engagement: "abc"
    Then I click on To-Dos tab
    And I should see To-Dos title
    And I should see no To-Dos yet label

  Scenario: Not Fail
    Given I navigated to Login page
    When I fill email with default email
    And I fill password with default password
    And I click on Login button
    Then I can see Engagement List page
    Then I click on Engagement named: "abc"
    And I should see Engagement Detail page of Engagement: "abc"
    Then I click on To-Dos tab

  Scenario: Fail Scenario 1
    Given I navigated to Login page
    When I fill email with default email
    And I fill password with default password
    And I click on Login button
    Then I can see Engagement List page
    Then I click on Engagement named: "abc"
    And I should see Engagement Detail page of Engagement: "abcde"

  Scenario: Fail Scenario 2
    Given I navigated to Login page
    When I fill email with default email
    And I fill password with default password
    And I click on Login button
    Then I can see Engagement List page
    Then I click on Engagement named: "abc"
    And I should see Engagement Detail page of Engagement: "abcd"
    Then I click on To-Dos tab
    And I should see To-Dos title
    And I should see no To-Dos yet label
