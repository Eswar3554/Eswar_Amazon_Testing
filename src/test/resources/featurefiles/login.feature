Feature: Amazon website

  @amazon
  Scenario: Client logs into amazon websit
    Given Client launches to the Amazon home page
    When Client enters the credentials
   # Then Client CLicks the search box and enters the word electronics
  Then Navigate to all electronics tab
    Then Navigate to echo and alexa tab

    Scenario: drag and drop