Feature: Developing Project

#  Scenario: Login and go around
#    Given I navigated to Login page
#    When I fill email with default email
#    And I fill password with default password
#    And I click on Login button
#    Then I can see Engagement List page
#    Then I click on Engagement named: "abc"
#    And I should see Engagement Detail page of Engagement: "abc"
#    Then I click on To-Dos tab
#    And I should see To-Dos title
#    And I should see no To-Dos yet label
#
#  Scenario: Login and go to Contact page
#    Given I navigated to Login page
#    When I fill email with default email
#    And I fill password with default password
#    And I click on Login button
#    Then I can see Engagement List page
#    Then I click on Contacts Page link
#    And I can see Contacts Page
#
#  Scenario: Login and fail
#    Given I navigated to Login page
#    When I fill email with default email
#    And I fill password with default password
#    And I click on Login button
#    Then I can see Engagement List page
#    Then I click on Engagement named: "abc"
#    And I should see Engagement Detail page of Engagement: "abcd"

  Scenario: Login and go around serenity
    Given Sere I navigated to Login page
    When Sere I fill email with default email
    And Sere I fill password with default password
    And Sere I click on Login button
#    Then Sere I can see Engagement List page