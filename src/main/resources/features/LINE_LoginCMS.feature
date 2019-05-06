Feature: LINE Demo Feature

  Background: Login success
    Given I navigated to LINE Business ID page
    When I click on Log in with LINE account button
    Then I navigated to LINE Login page
    And I fill email with LINE default email
    And I fill password with LINE default password
    Then I click on LINE Login button

  @LINEDeveloping
  Scenario: First first - andrew.huynh
    Given I navigated to LINE Official Account Manager
    When I click account name: nap_qa_test15 on list account
    Then I navigated to Account Page Settings of: nap_qa_test15
    And I click on Add Plugin button
    And I select to add Collection plugin
    Then I navigated to Collection plugin page
    And I fill Collection items with given title and description
      | ItemAtPosition | ItemTitle | ItemDescription |
      | 1              | Item1     | Des1            |
      | 2              | Item2     | Des2            |
      | 3              | Item3     | Des3            |
    And I fill Collection plugin title
    And I click on Save plugin button
    And I activate this plugin to Publish
    And I click on Publish button
    Then I open Line app on primary device
    And I log in to LINE with default account
    And I go to UIT page via Friend list: nap_qa_test15
    And I verify Collection plugin on UIT
      | ItemAtPosition | ItemContent |
      | 1              | Item1 Des1  |
      | 2              | Item2 Des2  |
      | 3              | Item3 Des3  |

