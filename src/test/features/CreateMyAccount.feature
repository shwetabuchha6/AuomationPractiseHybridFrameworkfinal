Feature: Registration feature for AutomationPractise site
  As a new user
  I want to create an account
  So i can SignIn successfully

  Background:
    Given I am on the homepage
    When I select SignIn link
    Then I should be on the authentication page
    And I should see SignUp panel
#happy path scenario
  @smoke6
  Scenario: User can able to create an account with valid credentials

    When I Enter EmailId as shwetabuchha8719933@gmail.com
    And I click Create An Account Button
    When I enter title as Mr.
    And firstname as shweta and lastname as buchcha
    And Password as  password1 and Address as hornbuckle close and City as London and State as Alaska
    And DateOfBirth as 7,june,2017
    And zipPostal Code as 12109 and mobile no as 07715564767
    And Assign an Address alias for future reference as hello
    And I select Register button
    Then I should be on MyAccount page

    #Unhappy path Scenario
  @smoke7
  Scenario Outline:
  Verify that user cannot Open an Account with  Invalid email
    When I Enter EmailId as <email>
    And I click Create An Account Button
    And I see validation message as <message> I should not loggedIn
    Examples:
      | email  | message                |
      | -      | Invalid email address. |
      | shweta | Invalid email address. |


  @smoke8
  Scenario Outline:
  Verify that user cannot Open an Account with  Invalid Credentials
    When I Enter EmailId as <email>
    And I click Create An Account Button
    Then I Should be on the Registration page
    And I enter title as <title>
    And firstname as <firstname> and lastname as <lastname>
    And Password as  <password> and Address as <address> and City as <city> and State as <state>
    And DateOfBirth as <date>,<month>,<year>
    And zipPostal Code as <zipcode> and mobile no as <mobilenumber>
    And I select Register button
    And I see validation message as <message> I should not loggedIn

    Examples:
      | email                      | title | firstname | lastname | password | date | month | year | address | city   | state  | zipcode | mobilenumber | message                |

      | shwetabuchha1345@gmail.com | Mr.   | shweta    | buchch   | hello    | 3    | March | 2007 | harrow  |        | london | 12001   | 7715565656   | city is required.      |
      | shwetabuchha1845@gmail.com | Mrs.  |           | buchch   | hello    | 4    | April | 2010 | harrow  | harrow | london | 12001   | 7715565656   | firstname is required. |

