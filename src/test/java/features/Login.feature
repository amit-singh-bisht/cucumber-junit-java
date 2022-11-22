@login
Feature: Junit feature in cucumber - java

  # wrong username and wrong password
  @wrong_username @wrong_password
  Scenario Outline: wrong username and wrong password
    Given I open browserstack.com
    When I visit sign in page
    And I enter wrong <username> and correct <password>
    Then I should not be able to see my dashboard

    Examples: 
      | username | password |
      | username | password |

  # wrong username and correct password
  @wrong_username @correct_password
  Scenario Outline: wrong username and correct password
    Given I open browserstack.com
    When I visit sign in page
    And I enter wrong <username> and correct <password>
    Then I should not be able to see my dashboard

    Examples: 
      | username | password |
      | username | password |

  # correct username and wrong password
  @correct_username @wrong_password
  Scenario Outline: correct username and wrong password
    Given I open browserstack.com
    When I visit sign in page
    And I enter wrong <username> and correct <password>
    Then I should not be able to see my dashboard

    Examples: 
      | username | password |
      | username | password |

  # correct username and correct password
  @correct_username @correct_password
  Scenario Outline: correct username and correct password
    Given I open browserstack.com
    When I visit sign in page
    And I enter wrong <username> and correct <password>
    Then I should not be able to see my dashboard

    Examples: 
      | username | password |
      | username | password |
