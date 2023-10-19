
Feature: Kitapyurdu Sayfasi Testi
@a1
  Scenario:Kitapyurdu sayfasinda arama kutusunda kitap aratilir
    Given kullanici kitapyurdu sayfasina gider
    And kullanici 3 saniye bekler
    Then kullanici kitapyurdu arama kutusunda Suc ve Ceza aratir
    And kullanici 3 saniye bekler
    And kullanici cikan sonuclardan ilk urunu sepete ekler
    And kullanici 3 saniye bekler
    And kullanici sayfayi kapatir

