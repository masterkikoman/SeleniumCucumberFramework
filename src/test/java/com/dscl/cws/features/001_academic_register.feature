#WMPAT-193
Feature: Academic: Register UK
  
    In order to use the website as a registered user
    As a user of the website
    I want to register my account

  @AcademicRegression @ACARegister
  Scenario: Academic: UK > Open Registration Page
    Given I am in the Academic website "academic"
    When I select the Register link
    Then I expect to be redirected at Register page

  @AcademicRegression @ACARegister
  Scenario: Shared: Academic: UK - Register without completing required fields
    Given I am on the Register Page
    When I register with required fields not complete
    Then I should see an error message requiring to fill the missing fields

  #@AcademicRegression @ACARegister
  Scenario: Shared: Academic: UK - Register with complete fields
    Given I am on the Register Page
    When I register through the Academic Register button with complete and valid fields
      | Title       | Mr                    |
      | FirstName   | Demo                  |
      | LastName    | Account               |
      | Interest    | Academic Books        |
      | JobTitle    | Other                 |
      | DisplayName | Automationdemo        |
      | Email       | demoaccount@gmail.com |
      | Password    | Password456           |
    Then I am registered successfully
    And I am redirected to the Academic website

  And I can sign out my account
 # @AcademicRegression @ACARegister
  Scenario: Shared: Academic: UK > Delete current registration of current user
    Given I am in the Academic website "academic"
    When I look on my profile
    Then I should be able to delete my account
