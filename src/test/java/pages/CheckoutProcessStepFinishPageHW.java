package pages;

import baseEntities.BasePageHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutProcessStepFinishPageHW extends BasePageHW {
    @FindBy(xpath = "//span[contains(@class, 'title') and contains(text(), 'Checkout: Complete!')]")
    public WebElement completeHeader;

    public CheckoutProcessStepFinishPageHW(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return By.xpath("//span[contains(@class, 'title') and contains(text(), 'Checkout: Complete!')]");
    }
}