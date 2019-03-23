Feature: Search Feature
  @SearchFeature
  Scenario: Search Feature Testing
    Given user on the main page
    Then user should see confirmation cookie pop up window
    Then  user should decline it
    When user click on the search button
    And user search for "challenge"
    And user should see auto suggested result items
    Then user should be able to open first auto suggested item in the new tab
    And user should able to go back to the first tab
    Then user should be able to see results after pressing enter
    And user should open first result in the new tab
    Then user should able to go back to the parent tab
    Then user searches for "mixed reality"
    Then user should open first item in the current tab
    And user verify the title of the page









