Feature: Customers
  
  Scenario: Add a new customer
    Given User Lunch Chrome browser
   When User opens URL "http://admin-demo.nopcommerce.com/login"
   And User enters Email as "admin@yourstore.com" and  pwd as "admin"
   And click on Login
   Then User can view Dashboard
   When User click on customer Menu
   And click on customer menu item
   And click on new add new button
   Then user can view  Add new customer page
   When user enter customer info
   And click on save button
   Then user can view configuration message "the new customer has been added successfully"
   And close browser
 
