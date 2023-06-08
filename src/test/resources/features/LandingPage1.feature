Feature: Landing

  Scenario: Validate User navigates onto Landing page
  Given Chrome is launched and unacademy application is launched
  Then user navigate on Landing page
    
  Scenario: Validate landing page UI
  Given Chrome is launched and unacademy application is launched
  Then user navigate on Landing page
  And Landing page feild are Visible

  Scenario:  field validation on Landing page(Goals Feild Text Box is Enable)
  Given Chrome is launched and unacademy application is launched
  Then user navigate on Landing page
  When User Enter the Goal in Goals Feild
  Then User is Should able to Enter the Goals 

  Scenario: validate user navigatee the find a center
  Given Chrome is launched and unacademy application is launched
  Then user navigate on Landing page
  When user click on find a center button
  Then user navigate the  find a center 
  


  #Scenario:  Validate User navigates onto join for free page
  #Given Chrome is launched and unacademy application is launched
  #Then user navigate on Landing page 
  #When user click the join for free button
  #Then user enter  mobile number
  #Then user enter  otp
  #Then user click on continue button  
  #Then user navigate the  join for free Homepage  
  
 

  #Feature: Login

    #Scenario: Verifying Crack your goal with India’s top educators functionality on chrome
    #Given Chrome is launched and unacademy  application is launched
    #Then user navigate on Landing page
    #When User enters number "9661697775" 
    #Then user enter otp
    #And User clicks on join for free
    #Then It shows home page
 
