package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.FamilyImmigrationStatusPage;
import io.cucumber.java.en.And;

public class FamilyOrPartnerVisaSteps {
    @And("I select state My partner of family member have uk immigration status {string}")
    public void iSelectStateMyPartnerOfFamilyMemberHaveUkImmigrationStatus(String status) {
        new FamilyImmigrationStatusPage().selectImmigrationStatus(status);
    }
}
