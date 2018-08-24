Feature: Login

  Scenario: Successful login
    Given I navigated to login page
    When I fill User Name with "per.auditor00100a.general@mailinator.com"
    And I fill Password with "Changeit@123"