Feature: visa conformation test
  As user I want to login into uk visa home office  website

  @sanity
  Scenario: Verify an Australian Coming To UK For Tourism
    Given I am on homepage
    And I click on start button
    When I select a Nationality "Australia"
    And I click on continue button
    And I select a reason "Tourism"
    And I click on continue button
    Then I should see the message that "You will not need a visa to come to the UK"
