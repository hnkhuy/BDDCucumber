Feature: LINE Demo Feature

  Background: Login success
    Given I navigated to LINE Business ID page
    When I click on Log in with LINE account button
    Then I navigated to LINE Login page
    And I fill email with LINE default email
    And I fill password with LINE default password
    Then I click on LINE Login button

#  Background: Login success
#    Given I navigated to LINE Business ID page
#    Given I navigated to Login page
#    When I fill email with default email
#    And I fill password with default password
#    And I click on Login button

#  @Migration
#  Scenario: AUV-657_Auditor- All Engagement List - Verify "Create Engagement" Button-huyhuynhz
#    Given I can see Engagement List page
#    Then I can see Create Engagement button
#    And I can see text of Create Engagement button: "Create Engagement"
#    And I can see text color of Create Engagement button is white

  @LINEDeveloping
  Scenario: First first
    Given I navigated to LINE Official Account Manager
