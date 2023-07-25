package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FamilyImmigrationStatusPage extends Utility {
    private static final Logger log = LogManager.getLogger(FamilyImmigrationStatusPage.class.getName());

    public FamilyImmigrationStatusPage() {
        PageFactory.initElements(driver, this);

    }


    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement yes;
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement no;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    public void clickNextStepButton() {
        clickOnElement(nextStepButton);
        log.info("click on next step button" +nextStepButton.toString());
    }

    public void selectImmigrationStatus(String status) {
        switch (status) {
            case "yes":
                clickOnElement(yes);
                break;
            case "no":
                clickOnElement(no);
                break;
        }
    }
}
