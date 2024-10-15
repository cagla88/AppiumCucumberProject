Feature: Saucelab Mobile App Functionality

  @wip
  Scenario: Test Login and product page
    When user login to mobile app with "local" setup
    And add first product to cart
    Then verify product is added