Feature: Instagram

  Scenario: Interact to the website
    Given that 'anni' open the browser and enter the Instagram page 'https://www.instagram.com/accounts/login/'
    When enter the credentials
      | username           | password   |
      | lunagp03@gmail.com | lunagp1109 |
    Then Verify my credentials
