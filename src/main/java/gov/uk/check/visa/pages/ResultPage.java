package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    public String verifyResult(String result){
        WebElement resultTextWebElement = driver.findElement(By.xpath("//h2[contains(text(),'"+result+"')]"));
        String resultText = getTextFromElement(resultTextWebElement);
        log.info("getting text from" + resultTextWebElement);
        return resultText;
    }
}
