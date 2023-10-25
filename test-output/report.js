$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/AddCustomers.feature");
formatter.feature({
  "name": "Adding a new customer and Searching customer",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "common for all scenarios in this feature",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.StepsLogin.user_launch_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "opens url \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepsLogin.opens_url_https_admin_demo_nopcommerce_com_login(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.StepsLogin.user_enters_Email_as_and_Password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.StepsLogin.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view DashBoard",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepsLogin.user_can_view_DashBoard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the customer menu",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepsLogin.user_click_on_the_customer_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the customers in the menu list",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepsLogin.click_on_the_customers_in_the_menu_list()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add new customer",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "click on the Add new button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.StepsLogin.click_on_the_Add_new_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the customer information",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepsLogin.enter_the_customer_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on save button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.StepsLogin.click_on_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can view confirmation message \"The new customer has been added succussfully\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepsLogin.user_can_view_confirmation_message(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.StepsLogin.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "common for all scenarios in this feature",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.StepsLogin.user_launch_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "opens url \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepsLogin.opens_url_https_admin_demo_nopcommerce_com_login(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.StepsLogin.user_enters_Email_as_and_Password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.StepsLogin.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view DashBoard",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepsLogin.user_can_view_DashBoard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the customer menu",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepsLogin.user_click_on_the_customer_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the customers in the menu list",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepsLogin.click_on_the_customers_in_the_menu_list()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Searching a customer by firstname and last name",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "enter first name and last name",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepsLogin.enter_first_name_and_last_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the search button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepsLogin.click_on_the_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "name should be displayed in customers table",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepsLogin.name_should_be_displayed_in_customers_table()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//table[@id\u003d\u0027customers-grid\u0027]//tbody/tr/td[3]\"}\n  (Session info: chrome\u003d116.0.5845.187)\nFor documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception\nBuild info: version: \u00274.12.0\u0027, revision: \u0027249f2a7d1b*\u0027\nSystem info: os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002719.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [3c74e10907b31da00f80a977f151f410, findElement {using\u003dxpath, value\u003d//table[@id\u003d\u0027customers-grid\u0027]//tbody/tr/td[3]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 116.0.5845.187, chrome: {chromedriverVersion: 116.0.5845.96 (1a3918166880..., userDataDir: C:\\Users\\prave\\AppData\\Loca...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:54421}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:54421/devtoo..., se:cdpVersion: 116.0.5845.187, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 3c74e10907b31da00f80a977f151f410\r\n\tat java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:67)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:484)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:191)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:196)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:171)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:602)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:359)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:353)\r\n\tat PageObjects.SearchCustomerPage.getUserName(SearchCustomerPage.java:42)\r\n\tat StepDefinitions.StepsLogin.name_should_be_displayed_in_customers_table(StepsLogin.java:212)\r\n\tat ✽.name should be displayed in customers table(file:///C:/Users/prave/Selenium_cucumber1/./Features/AddCustomers.feature:22)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "validate the name",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepsLogin.validate_the_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.StepsLogin.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});