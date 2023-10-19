package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.Driver;

public class GooglePage {
    public GooglePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "#APjFqb")
    public WebElement aramaKutusu;

    /* @FindBy(id = "APjFqb")      //id ile locate
    public WebElement aramaKutusu;*/
    @FindBy(xpath = "//div[text()='Tümünü kabul et']")
    public WebElement cerezlerWE;
}
