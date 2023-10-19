package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import pages.GooglePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class GoogleStepDefinition {
    GooglePage page=new GooglePage();

    @Given("Kullanici parametreli method ile {string} sayfasina gider")
    public void kullaniciParametreliMethodIleSayfasinaGider(String url) {
        Driver.getDriver().get(url);
        ReusableMethods.bekle(2);
       // page.cerezlerWE.click();
        ReusableMethods.bekle(3);
    }


    @And("kullanici sayfayi yeniler")
    public void kullaniciSayfayiYeniler() {
       Driver.getDriver().navigate().refresh();
       ReusableMethods.bekle(3);
    }

    @And("kullanici parametreli method ile googleda {string} aratir")
    public void kullaniciParametreliMethodIleGoogledaAratir(String str) {

        page.aramaKutusu.sendKeys("Nokia",Keys.ENTER);
        ReusableMethods.bekle(3);



    }


}
