Feature: Register google account


  Scenario: Validate the error message is displayed
    Given user is in the register page
    When user inputs account information as below
      | Field     | Value  |
      | Firstname | An     |
      | Lastname  | Nguyen |
    And user clicks Next step button
    And user waits for 3 second
    Then the error message display as below
      """
      You can't leave this empty.
      """


  Scenario: Validate the privacy policy popup is displayed
    Given user is in the register page
    When user inputs account information as below
      | Field     | Value                         |
      | Firstname | An                            |
      | Lastname  | Nguyen                        |
    And user waits for 3 second
    And user clicks Next step button
    Then the error message display as below
      """
      You can't leave this empty.
      """

