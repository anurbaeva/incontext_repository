Feature: Search Feature


  @SearchFeature @Smoke @Regression
  Scenario: Search Feature Testing

    Given user on the main page
    And user should see confirmation cookie pop up window
    And user should decline it
    When user click on the search button
    And user search for "challenge"
    And user should see auto suggested result items
    And user should be able to open first auto suggested item in the new tab
    And user should be able to go back to the first tab
    And user should be able to see results after pressing enter
    And user should open first result in the new tab
    Then user should able to go back to the parent tab
    And user searches for "mixed reality"
    And user should open first item in the current tab
    And user verify the title of the page is "Mixed Reality"



  Scenario: Dummy Scenario to demonstrate data tables
    Given user on the main page
    When user enters Newsletter data
      | firstName | lastName | companyName | jobTitle | workEmail    | country |
      | John      | Doe      | Incontext   | HR       | abc@mail.com | USA     |
      | Alex      | Terry    | Google      | SDET     | abc1@gmail.com | Canada  |
    Then user should see the Thank you message













