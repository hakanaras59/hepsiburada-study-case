Feature: Managing a user in PetStore

  @regression
  Scenario: Create a user in petstore
    When I do a POST to /user with the following values:
      | id         | 1123                  |
      | username   | test                  |
      | firstName  | hakan                 |
      | lastName   | aras                  |
      | email      | hakanaras98@gmail.com |
      | password   | abc123                |
      | phone      | 54222113455           |
      | userStatus | 1                     |
    Then I receive the created user when  I do a Get to /user/test

  Scenario: Create a user in the petstore with docstring
    When I do a POST to user with the docstring:
      """json
      {
        "id": 11,
        "username": "hakan123",
        "firstName": "hakan ",
        "lastName": "aras",
        "email": "hakanaras98@gmail.com",
        "password": "12345",
        "phone": "54222113455",
        "userStatus": 1
      }
      """
