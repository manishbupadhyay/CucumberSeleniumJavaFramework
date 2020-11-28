Feature: Uber Booking feature

  Scenario: Booking cab
    Given User wants to select car type "sedan" from the uber app
    When User selects car "sedan" and pick up point "Pune" and drop point "Banglore"
    Then Driver starts the journey
    And Drives ends the journey
    Then User pays 1000 Rs.
