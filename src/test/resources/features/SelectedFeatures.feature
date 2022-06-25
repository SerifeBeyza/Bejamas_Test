##@wip
Feature: User should able to land on page

  Background:
  Given user navigates to main page

    Scenario: Verify the featured product
      And user can able to see featured product

    Scenario: Verify the Product List
      When user able to see six different artworks under the category
      Then user able to select which artworks category do you want
      When user  hovering over the image,the "ADD TO CART" bar is displayed.
      And user should able to see product which has "Best Seller" flag

      @wip
    Scenario:Verify of Pagination
      When user able to see all page number
     And user able to see "6" different items on each page
      And user navigate to page "2" on listed product page
      Then user able to understand which page she is on
      And prev arrow be hidden at page "1" and next arrow hidden last page "3"











