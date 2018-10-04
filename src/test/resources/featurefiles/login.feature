Feature: Amazon website

  @amazon
  Scenario: Client logs into amazon websit
    Given Client launches to the Amazon home page
    When Client enters the credentials
   # Then Client CLicks the search box and enters the word electronics
   # Then Navigate to all electronics tab
   # Then Navigate to echo and alexa tab
    Then Search for telivisions from price highest
    Then select the product and continue to cart
    Then delete the selected product from cart

    @dragdrop
    Scenario: drag and drop test
      Given Launch the specific test URL
      Then perform the test for drag and drop