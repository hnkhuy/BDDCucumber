Feature: Todos Feature

  Background: Login success
    Given I navigated to Login page
    When I fill email with default email
    And I fill password with default password
    And I click on Login button

  @Developing
  Scenario Outline: Verify Todos of Engagement-hnkhuy
    Given I can see Engagement List page
    When I click on Engagement named: "<EngagementName>"
    Then I should see Engagement Detail page of Engagement: "<EngagementName>"
    Then I click on To-Dos tab
    And I should see To-Dos title
    Then I should see Todos on Todo page: <ToDos>
    Examples:
      | EngagementName    | ToDos                  |
      | abc               | abc.todo1, abc.todo2   |
      | Per Engagement 01 | pe01.todo1, pe01.todo2 |
      | Nhu engagement 1  | ne1.todo1, ne1.todo2   |