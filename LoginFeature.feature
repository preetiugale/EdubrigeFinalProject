Feature: Search for a product on a shopping website

   Scenario: Search for a product
    Given user on the shopping website
    When user search for "Top" in the search bar
    Then user should see a list of search results for "Top"
    And  click on the search button
    Then close Browser


   Scenario: Search for best sellers
    Given  user on the shopping website
    When user should click on Best sellers it shows the results
    Then close Browser
    
    Scenario: Select the address
    Given user on the shopping website
    When  user click on Hello select your address
    When user give "400612" pincode in textbox
    Then user click on apply
    Then close Browser