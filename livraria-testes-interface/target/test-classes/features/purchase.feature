@Purchase
Feature: Purchasing of an item in the store
  

  @Book_Purchase
  Scenario: Purchase of a book in the store
  Given that we already have a person registered in the store
    When I select an item to add to the cart
    And fill in all the information about the address
    And fill in the shipping and payment informations
    Then is displayed in the final screen the message that confirms the purchase
    
  @Book_Purchase_Failure
  Scenario: Attempting to buy a book without accepting the terms and conditions
  Given that we already have a person registered in the store
    When I select an item to add to the cart
    And fill in all the information about the address
    And dont check the box terms of service
    Then is displayed the message of error

    