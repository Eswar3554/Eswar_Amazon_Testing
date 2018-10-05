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
   # Then I should see the message "Your Shopping Cart is empty"
  Then Second message should be "Sony XBR75X940E 75-Inch"

    @dragdrop
    Scenario: drag and drop test
      Given Launch the specific test URL
      Then perform the test for drag and drop
      Then Verify the text of the heading as "blocks into empty cells"

      @google
      Scenario: Google test
        Given Launch google and enter tangerine search
        Then Verify the tangerine text on google site "https://www.tangerine.ca/"