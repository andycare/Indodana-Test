Feature: Register Feature

  @SuccessLogin
  Scenario: Successful Register Account
    Given I am on the register account page
    When I input phone no
    And I input email
    And I input firstname
    And I input Lastname
    And I click daftar
    Then I should be redirected to the homepage