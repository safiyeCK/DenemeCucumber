package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class GoogleStepDefinition_01 {
    GooglePage page=new GooglePage();

    @And("kullanici google cerezleri kabul eder")
    public void kullaniciGoogleCerezleriKabulEder() {
        try {
            ReusableMethods.scrollEnd();
            page.cerezlerWE.click();
        } catch (Exception e) {
            System.out.println("Cerez cikmadi");
        }
        ReusableMethods.bekle(2);
    }

    @Given("arama kutusunda {string} aratir")
    public void aramaKutusundaAratir(String str) {
        page.aramaKutusu.sendKeys(str, Keys.ENTER);
        ReusableMethods.bekle(2);

    }

    @And("sayfa basliginin {string} icerdigini test eder")
    public void sayfaBasligininIcerdiginiTestEder(String str) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(str));
    }
}
