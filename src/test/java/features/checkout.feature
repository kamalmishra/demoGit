Feature: place the order for products
@PlaceOrder
Scenario Outline: Search Experience for product search in both home and Offers page
Given User is on greencart landing page
When User searched with shortname <name> and expected actual name of product
And Added "3" items of the selected product to cart
Then User proceeds to Checkout and validate the <name> items in checkout page
And verify user has ability to enter promo code and place the order

Examples:
| name  |
| Tom 	|