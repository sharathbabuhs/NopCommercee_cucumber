$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Feture/custmer.feature");
formatter.feature({
  "name": "Customers",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add a new customer",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Lunch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Lunch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"admin@yourstore.com\" and  pwd as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_Email_as_and_pwd_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_Dashboard()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.WebDriver.getTitle()\" because \"this.ldriver\" is null\r\n\tat pageObjects.AddCustomerPage.getPageTitle(AddCustomerPage.java:44)\r\n\tat stepDefination.Steps.user_can_view_Dashboard(Steps.java:71)\r\n\tat ✽.User can view Dashboard(file:Feture/custmer.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User click on customer Menu",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_click_on_customer_Menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on customer menu item",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_customer_menu_item()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on new add new button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_new_add_new_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user can view  Add new customer page",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_Add_new_customer_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter customer info",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_enter_customer_info()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on save button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user can view configuration message \"the new customer has been added successfully\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_configuration_message(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "skipped"
});
});