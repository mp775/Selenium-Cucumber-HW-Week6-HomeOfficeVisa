Feature: Family or partner visa test
  As user I want to login into uk visa home office  website

  @regression
  Scenario: Verify Columbian National Coming To The UK To Join A Partner For A Long Stay They Do Have An Article10Or20Card
    Given I am on homepage
    And I click on start button
    When I select a Nationality "Cambodia"
    And I click on continue button
    When I select reason "Join partner or family for a long stay"
    And I click on continue button
    And I select state My partner of family member have uk immigration status "yes"
    And I click on continue button
    Then I should see the message that "You’ll need a visa to join your family or partner in the UK"
