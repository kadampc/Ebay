Feature: eBay Shopping
  In order to buy a product
  As a Customer
  I want to visit eBay and buy the desired product

  Scenario Outline: eBay shopping cart
    Given user is on eBay homepage
    When user searched for the <Mobile> product
    And Select product and add to cart
    And user searched for the <Laptop> product
    And Select product and add to cart
    Then Products should be added to the cart

  Examples:
  |Mobile|Laptop|
  |New Samsung Galaxy S7 G930F LTE 4G Mobile 32GB 1Yr Wty in Sealed Box|Lenevo|


