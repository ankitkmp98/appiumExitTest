Feature: show operation of animation button

  @show @animation @flag
  Scenario: User performs show operation of numbers
    Given At first I open the page for show operation
    Given At first I perform all hide operations
    Then I unchecked box of custom animation box for show operation
    Then I unchecked box of hide box for show operation
    Then I click on show buttons for show operation
    And I perform assertion for show operation
