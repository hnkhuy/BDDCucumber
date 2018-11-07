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

