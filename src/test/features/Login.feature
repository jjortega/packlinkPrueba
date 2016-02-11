@Login
Feature: Write a test suite for PACKLINK ES (http://www.packlink.es) login page with the following requirements:
  
  We will not provide any details about the implementation of the login functionality. 
  The suite must test specifically the login process. It shall not cover other unrelated features.
  Valid Credentials for login
  Email: ctestqa2015@packlink.com
  Password: pQA2015!

  Scenario: Login successful
    Given I go to init page
    And I click on Login/Register button
    And I type ctestqa2015@packlink.com in emailTextBox
    And I type pQA2015! in passwordTextBox
    When I click on Login button
    Then I check that Hola CTestQA2015 is un textAccount

  Scenario: Wrong Password
    Given I go to init page
    And I click on Login/Register button
    And I type ctestqa2015@packlink.com in emailTextBox
    And I type wrongPassword in passwordTextBox
    When I click on Login button
    Then I check that El email o la contraseña no son correctos. is un messageText

  Scenario: Void textBoxes the color shoul be red
    Given I go to init page
    And I click on Login/Register button
    When I click on Login button
    Then I check that the color of emailTextBox is red
    And I check that the color of passwordTextBox is red
