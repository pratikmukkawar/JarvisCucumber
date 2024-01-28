



Feature: Test login Functions
@Smoke
  Scenario: check login functions

    Given user on homepage
    When  user on login page
    And user enters uname and pass
    Then click on login button