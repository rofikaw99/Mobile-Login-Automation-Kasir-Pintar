Feature: Login Kasir Pintar

  @login
  Scenario: login kasir pintar
    Given user on login page
    When user input email "batiktrimulyo@gmail.com"
    And user input password "Rofik1999"
    And click login button
    Then user successfully login