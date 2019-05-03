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
  Scenario: First first - andrew.huynh
    Given I navigated to LINE Official Account Manager
    When I click account name: nap_qa_test15 on list account
    Then I navigated to Account Page Settings of: nap_qa_test15
    And I click on Add Plugin button
    And I select to add Collection plugin
    Then I navigated to Collection plugin page
    And I fill Collection items with given title and description
      | ItemAtosition | ItemTitle | ItemDescription |
      | 1             | Item1     | Des1            |
      | 2             | Item2     | Des2            |
      | 3             | Item3     | Des3            |
    And I fill Collection plugin title
    And I click on Save plugin button
    And I activate this plugin to Publish
    And I click on Publish button
    Then I open Line app on primary device
    And I click on Start button on Welcome LINE app

