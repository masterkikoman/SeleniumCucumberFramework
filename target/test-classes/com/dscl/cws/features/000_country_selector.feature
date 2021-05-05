Feature: Select a country

    In order to view products from other countries
    As a user of the website
    I want to be able to change my locale

    @AcademicRegression
    Scenario Outline: Change Location - "<CountryName>"
      
    Given I am in the Academic website "academic"
     When I change the country locale to "<CountryName>"
      Then the country locale has changed to "<CountryName>"

    Examples:
    |CountryName   |
    |United Kingdom|