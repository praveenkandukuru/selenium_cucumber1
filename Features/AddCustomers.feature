Feature: Adding a new customer and Searching customer

	Background: common for all scenarios in this feature
		Given user launch the browser
		When opens url "https://admin-demo.nopcommerce.com/login"
		And user enters Email as "admin@yourstore.com" and Password as "admin"
		And click on login button
		Then User can view DashBoard
		When user click on the customer menu
		Then click on the customers in the menu list
	
	Scenario: Add new customer
		And click on the Add new button
		Then Enter the customer information
		And click on save button
		Then user can view confirmation message "The new customer has been added succussfully"
		And close browser
	
	Scenario: Searching a customer by firstname and last name
		Then enter first name and last name
		Then click on the search button
		Then name should be displayed in customers table
		Then validate the name
		And close the browser
