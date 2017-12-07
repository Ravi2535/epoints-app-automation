Feature: Signup - user journey on epoints app

 Scenario: Sign up 
    Given User navigate to signup page 
    When User enters details to signup
    |emailPath|passwordPath|firstNamePath|lastNamePath|submittPath|email|password|firstName|lastName|promoCode|
    |com.scaleup.epoints.mock.debug:id/editText_email|com.scaleup.epoints.mock.debug:id/editText_password|com.scaleup.epoints.mock.debug:id/editText_firstName|com.scaleup.epoints.mock.debug:id/editText_lastName|com.scaleup.epoints.mock.debug:id/button_createNewAccount|krajeshkumar42@gmail.com|password|ravi|teja|
    Then message displayed registered successfully
    