Feature: signup on the website
  I want to sign up on the website

  Scenario: Valid registration
    Given I navigate to the website
    When I click sign up
    And I select free edition from the drop down
    And I enter first name
    And I enter last name
    And I enter email
    And I enter confirm email
    And I enter username
    And I enter password
    And I enter confirm password
    And i tick i agree to terms and conditions
    And I click the submit button
  And I enter the company name
  And I enter the phone number
  And I enter the fax
  And I enter the company website
  And I enter the company Email,
  And I enter Description
  And I enter address
  And I enter city
  And I enter state/province
  And I enter zip/postal code
  And I choose country
  And I tick this is also the billing address
      And I click continue
    Then I am registered