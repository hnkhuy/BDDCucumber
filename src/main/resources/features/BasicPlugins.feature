Feature: LINE Demo Feature

  Background: Login success
    Given I navigated to LINE Business ID page
    When I log in to LINE CMS with default account
    Then I navigated to LINE Official Account Manager
    And I navigate to Account Page Settings of: TEST_bp2_tw_prem

#  @LINEDeveloping @CollectionPlugin @P1
#  Scenario: NAP-398 Add collection plugin without uploaded photos - andrew.huynh
#    Given I add new Collection plugin
#    When I fill Collection plugin with given title and description
#      | ItemAtPosition | ItemTitle | ItemDescription |
#      | 1              | Item1     | Des1            |
#      | 2              | Item2     | Des2            |
#      | 3              | Item3     | Des3            |
#    Then I Save plugin
#    And I Publish plugin
#    Then I open Line app on primary device
#    And I log in to LINE app with default account
#    And I go to UIT page via Friend list: nap_qa_test15app
#    And I verify Collection plugin on UIT
#      | ItemAtPosition | ItemContent |
#      | 1              | Item1 Des1  |
#      | 2              | Item2 Des2  |
#      | 3              | Item3 Des3  |

  @LINEDeveloping @TextPlugin @P1
  Scenario: NAP-195 Add basic text plugin without uploaded photo - andrew.huynh
    Given I add new Text plugin
    When I fill Text plugin with given title and description
      | Title             | Description                        |
      | Text plugin title | Automation Text plugin description |
