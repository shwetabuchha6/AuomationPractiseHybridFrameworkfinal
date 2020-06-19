Feature: User login for Automation Practise
  As a user
  I want to Login successfully
  So that I can access my account

  Background:
    Given I am on the homepage
    When I select SignIn link
    Then I should be on the authentication page
    And I should see SignUp panel

#Happy path Scenario
  @regression  @smoke1
  Scenario: Verify user can go to Create an Account page
    When I Enter EmailId as "Shwetabuchha23133@gmail.com"
    And I click Create An Account Button
    Then I Should be on the Registration page

  @regression @smoke2
  Scenario: Verify User can login with valid credentials
    When I enter username as shwetabuchcha22211@gmail.com, password as arihant10
    And I click SignIn
    And I should be on MyAccount page

    #Unhappy path Scenario
  @smoke3
  Scenario Outline:
  Verify User can see validation messages for invalid credentials
    When I enter username as <email>, password as <password>
    And I click SignIn
  And I should see validation message as <message>

        Examples:
      | email                     | password  | message|
      | shwetabuchha222@gmail.com | sdfc      | Invalid password.|
      | shwetabuchha1781          | passwrord | Invalid email address.|
      |                           |           | An email address required.|









