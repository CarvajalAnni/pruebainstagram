Feature: Login
  Scenario: enter the website
    Given that 'Luna' enter the beginning of the instagram session 'https://www.instagram.com/accounts/login/'
    When enter corresponding data
      | username | lunagp03@gmail.com |
      | password | lunagp1109         |
    Then log in successfully

