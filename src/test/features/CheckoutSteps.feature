Feature: As a user I would like to login into the Tesco website and add items to my checkout basket

  Scenario: I add items to my checkout basket and I am able to see them in my checkout basket

    Given I am on the Tesco Home page "https://www.tesco.com/"
    And I click on the Sign In button
    When I add my email "kurianvijay7@gmail.com"
    And I add my password "Ithastobegood!1"
    And I click the Sign in button
    When I add an item to the searchbar "Granulated Sugar 1Kg"
    And I click the search button
    When I select a product and click the add button
    And I add quantity with the + button
    When I click the basket icon to go to my basket
    Then I should see the item added "Tomato paste"

