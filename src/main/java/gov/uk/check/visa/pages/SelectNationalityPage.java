package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectNationalityPage extends Utility {
    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());

    public SelectNationalityPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    public void selectNationality(String nationality) {
        selectByVisibleTextFromDropDown(nationalityDropDownList, nationality);
        log.info("select nationality " +nationality.toString());
    }

    public void clickNextStepButton() {
        clickOnElement(nextStepButton);
        log.info("click on next step button" + nextStepButton.toString());
    }
}
