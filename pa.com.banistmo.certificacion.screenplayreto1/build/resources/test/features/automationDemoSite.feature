#Autor: csucreb

 @stories
  Feature: Automation Demo Site
    As a user, I want to automate a register on Automation Demo Site

  @scenario1
 Scenario Outline: Register on the Automation Demo Site
    Given that Claudia wants to access the Web Automation Demo Site
    When she registers on the home page

    |firstName   |lastName   | file  |address   |emailAddress   |phone   |gender   |hobby   |language   |skill   |country   |sCountry   |birthYear   |birthMonth   |birthDay   |password   |confirmPassword  |
    |<firstName> |<lastName> |<file> |<address> |<emailAddress> |<phone> |<gender> |<hobby> |<language> |<skill> |<country> |<sCountry> |<birthYear> |<birthMonth> |<birthDay> |<password> |<confirmPassword>|


    Then she verifies that the screen load the text <textVerify>
    Examples:
      |firstName   |lastName  | file                                |address      |emailAddress         |phone       |gender   |hobby   |language   |skill   |country     |sCountry   |birthYear   |birthMonth    |birthDay   |password    |confirmPassword | textVerify
      |Claudia     |Barrios   |C:\Users\csucre\Pictures\usuario.png |CumbreAzul   |cbarrios1@gmail.com  |5076345787  |FeMale   |Movies  |Portuguese |C       |Argentina   |Japan      |1993        |July          |10         |Dorian19&   |Dorian19&       |- Double Click on Edit Icon to EDIT the Table Row.