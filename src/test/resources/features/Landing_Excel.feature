
   Feature: Landing

  Scenario Outline: Verify Goal Search functionality with valid data
  Given Chrome is launched and unacademy application is launched
  Then user navigate on Landing page
  When User enters Goal from given sheetname "<SheetName>" and rownumber <RowNumber>
  Then User is Should able to Enter the Goals
    Examples:
    |  SheetName  | RowNumber |
    |  Sheet1     |     0     |
    |  Sheet1     |     1     |
     