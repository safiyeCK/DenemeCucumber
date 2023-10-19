Feature: Kitapyurdu Sayfasi Testi
  Scenario:Kitapyurdu sayfasinda arama kutusunda kitap aratilir
    Given kullanici kitapyurdu sayfasina gider
    And kullanici 2 saniye bekler
    Then kullanici kitapyurdu arama kutusunda propertiesten "kitap3" aratir
    And kullanici 2 saniye bekler
    And kullanici cikan sonuclardan ilk urunu sepete ekler
    And kullanici 2 saniye bekler
    And kullanici sayfayi kapatir