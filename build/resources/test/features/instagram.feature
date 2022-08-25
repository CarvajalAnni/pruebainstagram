<<<<<<< HEAD
Feature: Instagram

  Scenario: Interact to the website
    Given that 'anni' open the browser and enter the Instagram page 'https://www.instagram.com/accounts/login/'
    When enter the credentials
      | username           | password   |
      | lunagp03@gmail.com | lunagp1109 |
    Then Verify my credentials
=======
Feature: Login
  Scenario:
    Given enter the beginning of the instagram session "https://www.instagram.com/accounts/login/"
    When enter corresponding data
    Then log in successfully
>>>>>>> 9ea028b864a49d34c48f1283812a296237ee0f2c
