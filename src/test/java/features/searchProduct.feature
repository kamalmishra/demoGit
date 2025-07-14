Feature: Search and place the order of products

#Scenario: Search for product in both home and offers page
#Given User is on greencart landing page
#When User searched with shortname "Tom" and expected actual name of product
#Then User searched for "Tom" shortname in offers page
#And Validate product name in offers page matches with landing page

@OffersPage
Scenario Outline: Search for product in both home and offers page
Given User is on greencart landing page
When User searched with shortname <name> and expected actual name of product
Then User searched for <name> shortname in offers page
And Validate product name in offers page matches with landing page

Examples:
| name |
| Tom  |
| Str  |
| beet |