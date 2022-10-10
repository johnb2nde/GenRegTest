@RegressionTest
Feature: Login Page
Solution Datasert testEnv App General Regression test

@positive
 Scenario: Login with valid credentials
	Given User is navigated to the Dataserv Solution test website
	And User click the Test Login button
	Then The login page is displayed correctly
	When Both the email address and password fields are cleared
	And User enter a valid input in the Email address field
	And A valid input in the Password field
	And Click Login button
	Then The Dashboard is displayed correctly

@negative
 Scenario: Login with invalid credentials
	Given User is navigated to the Dataserv Solution test website
	And User click the Test Login button
	Then The login page is displayed correctly
	When Both the email address and password fields are cleared
	And User enter a valid input in the Email address field
	And A invalid input in the Password field
	And Click Login button
	Then Error message is diplayed
 
 Scenario: Login with invalid credentials
	Given User is navigated to the Dataserv Solution test website
	And User click the Test Login button
	Then The login page is displayed correctly
	When Both the email address and password fields are cleared
	And User enter a invalid input in the Email address field
	And A valid input in the Password field
	And Click Login button
	Then Error message is diplayed
	

########################################################################################################################################

#Template:

#@RegressionTest
#Feature: Login Page
#Solution Datasert testEnv App General Regression test
#
#@positive
 #Scenario: Login with valid credentials
#	Given User is navigated to the Dataserv Solution test website
#	And User click the Test Login button
#	Then The login page is displayed correctly
#	When Both the email address and password fields are cleared
#	And User enter a valid input in the Email address field
#	And A valid input in the Password field
#	And Click Login button
#	Then The Dashboard is displayed correctly
#
#@negative
 #Scenario: Login with invalid credentials
#	Given User is navigated to the Dataserv Solution test website
#	And User click the Test Login button
#	Then The login page is displayed correctly
#	When Both the email address and password fields are cleared
#	And User enter a valid input in the Email address field
#	And A invalid input in the Password field
#	And Click Login button
#	Then Error message is diplayed
 #
 #Scenario: Login with invalid credentials
#	Given User is navigated to the Dataserv Solution test website
#	And User click the Test Login button
#	Then The login page is displayed correctly
#	When Both the email address and password fields are cleared
#	And User enter a invalid input in the Email address field
#	And A valid input in the Password field
#	And Click Login button
#	Then Error message is diplayed

#=======================
#Feature: Dashboard
#
#@positive
 #Scenario: Login with valid credentials
#	Given User is navigated to the Dataserv Solution test website
#	And User click the Test Login button
#	Then The login page is displayed correctly
#	When Both the email address and password fields are cleared
#	And User enter a valid input in the Email address field
#	And A valid input in the Password field
#	And Click Login button
#	Then The Dashboard is displayed correctly
#	When User enters valid input into search field
#	And Click search buttton
#	Then An new tab is open for the Search results
#	
#@Negative
 #Scenario: Login with valid credentials
#	Given User is navigated to the Dataserv Solution test website
#	And User click the Test Login button
#	Then The login page is displayed correctly
#	When Both the email address and password fields are cleared
#	And User enter a valid input in the Email address field
#	And A valid input in the Password field
#	And Click Login button
#	Then The Dashboard is displayed correctly
#	When User enters valid input into search field
#	And Click search buttton
#	Then An new tab is open for the Search results

  