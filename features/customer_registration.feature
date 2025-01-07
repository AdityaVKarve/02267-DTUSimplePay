Feature: Customer Registration
  Handles customer registration

  Scenario: Customer registers with his/her/their name
    Given a customer "name"
    Then the registration of "name" is complete and a unique integer ID is returned
