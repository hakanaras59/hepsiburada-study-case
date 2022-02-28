@regression
Feature: Hepsi Burada - Login Page

  Background:
    Given I access the hepsi burada login page


  Scenario Outline: Validate - Successful Login
    When I move to login button
    And I click login
    And I enter a username <username>
    And I click on the login button after userName
    And I enter a password <password>
    And I click on the login button after passWord
    And I enter a search text <searchText>
    And I click on the search
    And I enter a first price range <priceRangeFirst>
    And I enter a second price range <priceRangeSecond>
    And I click on the range search button
    And I select a product
    And I click on all sellers
    And I select lowest rated seller
    And I close opened popup
    And I go cart
    Then I should be presented item in cart

    Examples:
      | username  | password | searchText  | priceRangeFirst  | priceRangeSecond |
      | studycaseemail1@gmail.com | 159874100asdD | cep telefonu | 3000 | 5000 |
      | hatali_email@hotmail.com | 159874100asdD | cep telefonu | 3000 | 5000 |

