Feature: Swag Labs application features

  Scenario: Login Scenario
    Given User is launch the application
    When user login to the application
    And user selects the product and add to the card
    Then user is able to see product details in cart

  Scenario Outline: Login Scenario
    Given User is launch the application
    When user login to the application with "<User name>" and "<Password>"
    Then user is able to see products page
    Examples:
      | User name               | Password     |  |
      | standard_user           | secret_sauce |  |
      | locked_out_user         | secret_sauce |  |
      | problem_user            | secret_sauce |  |
      | performance_glitch_user | secret_sauce |  |

