Feature: Engagement List Project

  Background: Login success
    Given I navigated to Login page
    When I fill email with default email
    And I fill password with default password
    And I click on Login button

  @Migration
  Scenario: AUV-657_Auditor- All Engagement List - Verify "Create Engagement" Button_hnkhuy
    Given I can see Engagement List page
    Then I can see Create Engagement button
    And I can see text of Create Engagement button: "Create Engagement"
    And I can see text color of Create Engagement button is white

  @Developing
  Scenario: Verify Engagement and Status on List -_hnkhuy
    Given I can see Engagement List page
    Then I can see Engagement and its status
      | EngagementName    | Status   | ReportDate  |
      | abc               | Planning | 30-Nov-2018 |
#      | Per Engagement 01 | Planning | 30-Nov-2018 |
#      | Nhu engagement 1  | Active   | 31-Jan-2019 |