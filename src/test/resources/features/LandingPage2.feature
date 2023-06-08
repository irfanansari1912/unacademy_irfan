
Feature: Landing

  Scenario Outline: Verify Goal Search functionality with valid data
  Given Chrome is launched and unacademy application is launched
  Then user navigate on Landing page
  When User enters Goal "<SearchKeyword>"
  Then It shows  Goal in the list
    Examples:
      |SearchKeyword |
      
      | IIT JEE  |
      | UPSC(CSE)  |
      
      
  Scenario Outline: Verify Goal Search functionality with Invalid data
  Given Chrome is launched and unacademy application is launched
  Then user navigate on Landing page
  When User enters Goal "<SearchKeyword>"
  Then It shows  Not Goal in the list
    Examples:
       |SearchKeyword |

       | Banking Exam |
       | cat exam|
 
  

