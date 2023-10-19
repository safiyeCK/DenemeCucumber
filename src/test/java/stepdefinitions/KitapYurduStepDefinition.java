package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.KitapyurduPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class KitapYurduStepDefinition {
    KitapyurduPage kitap=new KitapyurduPage();

    @Given("kullanici kitapyurdu sayfasina gider")
    public void kullaniciKitapyurduSayfasinaGider() {
        Driver.getDriver().get("https://www.kitapyurdu.com/");
        ReusableMethods.bekle(2);
        ReusableMethods.click(kitap.cerezKabul);
    }

    @And("kullanici {int} saniye bekler")
    public void kullaniciIntSaniyeBekler(int saniye) {
        try {
            Thread.sleep(1000 * saniye);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Then("kullanici kitapyurdu arama kutusunda Suc ve Ceza aratir")
    public void kullaniciKitapyurduAramaKutusundaSucVeCezaAratir() {
        kitap.aramaKutusu.sendKeys("Suc ve Ceza", Keys.ENTER);

    }

    @And("kullanici cikan sonuclardan ilk urunu sepete ekler")
    public void kullaniciCikanSonuclardanIlkUrunuSepeteEkler() {
      ReusableMethods.click(kitap.ilkUrunSepeteEkle);
    }

    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }


    @Then("kullanici kitapyurdu arama kutusunda propertiesten {string} aratir")
    public void kullaniciKitapyurduAramaKutusundaPropertiestenAratir(String nesne) {
        kitap.aramaKutusu.sendKeys(ConfigReader.getProperty(nesne),Keys.ENTER);
    }

    @And("kitapyurdu sayfasinda girisyap butonuna tiklar")
    public void kitapyurduSayfasindaGirisyapButonunaTiklar() {
       ReusableMethods.click(kitap.girisButonu);
       ReusableMethods.bekle(2);
    }

    @And("verilen {string} ve {string} lerle giris yapar")
    public void verilenVeLerleGirisYapar(String str1, String str2) {
        kitap.girisEpostaKutusu.sendKeys(str1,Keys.TAB,str2,Keys.ENTER);
    }

    @Then("kullanici kitapyurdu arama kutusunda {string} aratir")
    public void kullaniciKitapyurduAramaKutusundaAratir(String str) {
        kitap.aramaKutusu.sendKeys(str,Keys.ENTER);
        ReusableMethods.bekle(3
        );
    }

    @And("kitapyurdunda verilen email ve password ile giris yapar")
    public void kitapyurdundaVerilenEmailVePasswordIleGirisYapar(DataTable data) {

        for (int i=1 ; i <data.asLists().size() ; i++ ){
            ReusableMethods.click(kitap.girisButonu);
            ReusableMethods.bekle(2);
            kitap.girisEpostaKutusu.sendKeys(data.row(i).get(0),Keys.TAB,data.row(i).get(1),Keys.ENTER);
            ReusableMethods.scroll(kitap.merhabaKullaniciAdi);
            kitap.merhabaKullaniciAdi.click();
            ReusableMethods.bekle(3);
            ReusableMethods.click(kitap.cikisButonu);
            ReusableMethods.bekle(3);

        }

    }

    @And("kitapyurdu arama kutusunda verilen kitaplar aratilir ve sepete eklenir")
    public void kitapyurduAramaKutusundaVerilenKitaplarAratilir(DataTable kitaplar) {

        for (int i = 1; i <kitaplar.asList().size() ; i++) {
            kitap.aramaKutusu.sendKeys(kitaplar.row(i).get(0),Keys.ENTER);
            ReusableMethods.bekle(3);
            ReusableMethods.scroll(kitap.ilkUrun);
            ReusableMethods.bekle(3);
            ReusableMethods.click(kitap.ilkUrunSepeteEkle);
            kitap.aramaKutusu.clear();
        }
    }


    @And("kullanici sepetteki urunleri dogrular")
    public void kullaniciSepettekiUrunleriDogrular() {
        List<WebElement> sepettekiUrunler = kitap.sepettekiUrun;
        List<String> beklenenUrunler = List.of("Suc ve Ceza", "Simyaci", "Kurk Mantolu Madonna");

        for (int i = 1; i < sepettekiUrunler.size(); i++) {
            String urunAdi = sepettekiUrunler.get(i).getText();
            Assert.assertEquals(beklenenUrunler.get(i), urunAdi, "urun dogrulanmadi: " + urunAdi);
        }
    }
}
