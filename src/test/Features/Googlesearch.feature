

  Feature: Feature to test google search functions

    Scenario: Validate the page

      Given open browser
      When open google page
      And Enter the msg in search bar Hello Jarvis
      Then hit enter
      Then Validate the web page

