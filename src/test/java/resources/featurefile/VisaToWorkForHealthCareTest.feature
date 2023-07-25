Feature: Visa to work for health care test
  As user I want to login into uk visa home office  website

  @smoke
  Scenario:Verify Chilean Coming To The UK For Work And Plans On Staying For Longer Than SixMonths
    Given I am on homepage
    When I click on start button
    And I select a Nationality "Chile"
    And I click on continue button
    And I select reason "Work, academic visit or business"
    And I click on continue button
    And I select intended to stay for "longer than 6 months"
    And I click on continue button
    And I select have planning to work for "Health and care professional"
    And I click on continue button
    Then I should see the message that "You need a visa to work in health and care"