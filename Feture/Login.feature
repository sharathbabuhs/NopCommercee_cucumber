 Feature: Login
 
 Scenario: Successful login with valid Credentials

   Given User Lunch Chrome browser
   When User opens URL "http://admin-demo.nopcommerce.com/login"
   And User enters Email as "admin@yourstore.com" and  pwd as "admin"
   And click on Login
   Then page Title Should be "Dashboard / nopCommerce administration"
   When User click on log out link
   Then page Title Should be "Your store. Login"
   And close browser 
   
 Scenario Outline:
 
  Given User Lunch Chrome browser
   When User opens URL "http://admin-demo.nopcommerce.com/login"
   And User enters Email as "<email>" and  pwd as "<password>"
   And click on Login
   Then page Title Should be "Dashboard / nopCommerce administration"
   When User click on log out link
   Then page Title Should be "Your store. Login"
   And close browser 
   
   Examples:
| email | password |

| admin@yourstore.com | admin |

|admin@yourstore.com | admin123|