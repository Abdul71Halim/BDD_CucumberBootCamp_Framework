@TutorialsninjaAddToCart
Feature: Adding a Product to the Shopping Cart on TutorialsNinja

  Scenario: Adding a Product to the Shopping Cart
  
    Given  User first open the application
    When   User enters the valid product in the search box 'samsung galaxy'
    And    User clicks on the Product search button
   
    
    And   User clicks on the add to cart button
    Then  User should see the product added successfully to the cart message