package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.DurationOfStayPage;
import gov.uk.check.visa.pages.ReasonForTravelPage;
import gov.uk.check.visa.pages.WorkTypePage;
import io.cucumber.java.en.And;

public class VisaWorkForHealthSteps {

    @And("I select reason {string}")
    public void iSelectReason(String visaReason) {
        new ReasonForTravelPage().clickOnReasonForJoinPartnerAndFamily();
    }

    @And("I select intended to stay for {string}")
    public void iSelectIntendedToStayFor(String duration) {
        new DurationOfStayPage().selectLengthOfStay(duration);
    }

    @And("I select have planning to work for {string}")
    public void iSelectHavePlanningToWorkFor(String workDepartment) {
        new WorkTypePage().clickOnHealthAndCareProvision();
    }
}
