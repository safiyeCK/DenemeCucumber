package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class KitapyurduPage {
    public KitapyurduPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='search-input']")
    public WebElement aramaKutusu;
    @FindBy(xpath = "(//a[@data-title='Sepete Ekle'])[4]")
    public WebElement UrunSepeteEkle;
    @FindBy(xpath = "(//a[@data-title='Sepete Ekle'])[1]")
    public WebElement ilkUrunSepeteEkle;
    @FindBy(xpath = "//h2[@id='swal2-title']")
    public WebElement sepeteEklendiUyarisi;

    @FindBy(xpath = "//*[.='Giriş Yap']")
    public WebElement girisButonu;

    @FindBy(css = "#login-email")
    public WebElement girisEpostaKutusu;
    @FindBy(xpath = "//a[@class='common-sprite']/b")
    public WebElement merhabaKullaniciAdi;
    @FindBy(xpath = "//div/ul/li/a[.='Çıkış']")
    public WebElement cikisButonu;

    @FindBy(xpath = "//div[@id='cookiescript_accept']")
    public WebElement cerezKabul;


    @FindBy(xpath = "(//div[@class='cover'])[1]")
    public WebElement ilkUrun;
    @FindBy(css = "#cart-items")
    public WebElement sepet;
    @FindBy(xpath = "//div[@class='mini-cart-info']//table//tbody//tr")
    public List<WebElement> sepettekiUrun;

}