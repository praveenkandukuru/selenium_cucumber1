Feature: login of nopcommerce
Scenario: Should succesfully login with valid credentials

Given user launch the browser
When opens url "https://admin-demo.nopcommerce.com/login"
And user enters Email as "admin@yourstore.com" and Password as "admin"
And click on login button
Then Page title should be "Dashboard / nopCommerce administration"
When user click on the logout link
Then Page title should be "Your store. Login"
And close browser

Scenario Outline: Login Data Driven

Given user launch the browser
When opens url "https://admin-demo.nopcommerce.com/login"
And user enters Email as "<email>" and Password as "<password>"
And click on login button
Then Page title should be "Dashboard / nopCommerce administration"
When user click on the logout link
Then Page title should be "Your store. Login"
And close browser

Examples:
	| email | password |
	| admin@yourstore.com | admin |
	|admin1@yourstore.com | admin123 |