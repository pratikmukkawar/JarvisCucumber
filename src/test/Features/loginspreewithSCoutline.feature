

Feature: Login check with spree

  Scenario Outline: Spree login function check


    Given open Browser
    Then go to Spree Site
    When enter user <name> and <pass>
    Then Click on login Button
    And Varify the title
    Examples:
      | name          | pass     |  |
      | icmr@mbox.re  | Test#123 |  |
      | pmide@mbox.re | Test#123 |  |
