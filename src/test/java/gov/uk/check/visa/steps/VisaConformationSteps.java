package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.ReasonForTravelPage;
import gov.uk.check.visa.pages.ResultPage;
import gov.uk.check.visa.pages.SelectNationalityPage;
import gov.uk.check.visa.pages.StartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VisaConformationSteps {
    String actualResult;

    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @And("I click on start button")
    public void iClickOnStartButton() {
        new StartPage().startNowButton();
    }

    @When("I select a reason {string}")
    public void iSelectAReason(String visaReason) {
        new ReasonForTravelPage().clickOnReasonForVisitTourism();
    }

    @And("I click on continue button")
    public void iClickOnContinueButton() throws InterruptedException {
        Thread.sleep(2000);
        new SelectNationalityPage().clickNextStepButton();
    }

    @Then("I should see the message that {string}")
    public void iShouldSeeTheMessageThat(String expectedResult) throws InterruptedException {
        Thread.sleep(1000);
        actualResult = new ResultPage().verifyResult(expectedResult);
        Assert.assertEquals(actualResult, expectedResult, "Result validation failed");
    }

    @When("I select a Nationality {string}")
    public void iSelectANationality(String nationality) {
        new SelectNationalityPage().selectNationality(nationality);
    }
}
