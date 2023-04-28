@LoginTest
  Feature: Login Function
    @ValidLogin  @SmokeTest

      Scenario: User can login with valid username and password
      Given user already on the login page
      When user enter valid username and valid password to click on login button
      Then user should be able to login successfully