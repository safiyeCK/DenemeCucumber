Feature: US001 Google Testi

  Background:
    Given Kullanici parametreli method ile "https://google.com" sayfasina gider
    * kullanici sayfayi yeniler
    * kullanici 2 saniye bekler
@a1
  Scenario: Arama kutusunda Nokia aratir
    And kullanici parametreli method ile googleda "Nokia" aratir
    * kullanici 2 saniye bekler
    And kullanici sayfayi yeniler
    * kullanici sayfayi kapatir
@a1
  Scenario: Arama kutusunda Iphone aratir
    And kullanici parametreli method ile googleda "Iphone" aratir
    * kullanici 2 saniye bekler
    And kullanici sayfayi yeniler
    * kullanici sayfayi kapatir