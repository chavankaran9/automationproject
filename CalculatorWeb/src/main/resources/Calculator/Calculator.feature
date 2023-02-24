Feature: Operations on Calculator

  Scenario Outline: To verify result is showing when multiplies N1 and N2
    Given User is on calculator page
    When User clicks on four
    And User clicks on two
    And User clicks on three
    And User clicks on "<operation>"
    And User clicks on five
    And User clicks on two
    And User clicks on five
    Then Result should be displayed "<result>"
    Examples:
   |operation| result|
   |multiplication|222075|


  Scenario Outline: To verify result is showing when divide of N1 by N2
    Given User is on calculator page
    When User clicks on four
    And User clicks on zero
    And User clicks on zero
    And User clicks on zero
    And User clicks on "<operation>"
    And User clicks on two
    And User clicks on zero
    And User clicks on zero
    Then Result should be displayed "<result>"
    Examples:
      |operation| result|
      |division|20|

  Scenario Outline: To verify result is showing when addition of N1 and N2
    Given User is on calculator page
    When User clicks on subtraction
    And User clicks on two
    And User clicks on three
    And User clicks on four
    And User clicks on two
    And User clicks on three
    And User clicks on four
    And User clicks on "<operation>"
    And User clicks on three
    And User clicks on four
    And User clicks on five
    And User clicks on three
    And User clicks on four
    And User clicks on five
    Then Result should be displayed "<result>"
    Examples:
      |operation| result|
      |addition|111111|

  Scenario Outline: To verify result is showing when subtraction of N1 and N2
    Given User is on calculator page
    When User clicks on two
    And User clicks on three
    And User clicks on four
    And User clicks on eight
    And User clicks on two
    And User clicks on three
    And User clicks on "<operation>"
    And User clicks on subtraction
    And User clicks on two
    And User clicks on three
    And User clicks on zero
    And User clicks on nine
    And User clicks on four
    And User clicks on eight
    And User clicks on two
    And User clicks on three
    Then Result should be displayed "<result>"
    Examples:
      |operation| result|
      |subtraction|23329646|