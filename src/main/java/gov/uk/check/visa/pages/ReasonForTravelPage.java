package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReasonForTravelPage extends Utility {
    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());

    public ReasonForTravelPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement reasonForVisitListTourismAndFamily;
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement reasonForVisitListWorkAcademicVisit;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-4']")
    WebElement reasonForVisitIsJoinPartnerAndFamily;

    public void clickOnReasonForVisitTourism() {
        clickOnElement(reasonForVisitListTourismAndFamily);
        log.info("click on reason for visa" +reasonForVisitListTourismAndFamily.toString());
    }

    public void clickOnReasonForVisitAcademic() {
        clickOnElement(reasonForVisitListWorkAcademicVisit);
        log.info("click on reason for visa" +reasonForVisitListWorkAcademicVisit.toString());
    }

    public void clickOnReasonForJoinPartnerAndFamily() {
        clickOnElement(reasonForVisitIsJoinPartnerAndFamily);
        log.info("click on reason for visa" +reasonForVisitIsJoinPartnerAndFamily.toString());
    }

    public void clickNextStepButton() {
        clickOnElement(nextStepButton);
        log.info("click on next step button" +nextStepButton.toString());
    }

}
