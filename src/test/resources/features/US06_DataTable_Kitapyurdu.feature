Feature: Kitapyurdu Testi
  @kitap
  Scenario: Kitapyurdunda kitap aramasi yapilir
    Given kullanici kitapyurdu sayfasina gider
    And kitapyurdu arama kutusunda verilen kitaplar aratilir ve sepete eklenir
    |kitaplar|
    |Suc ve Ceza|
    |Simyaci|
    |Kurk Mantolu Madonna|
    And kullanici sepetteki urunleri dogrular
    And kullanici sayfayi yeniler
    And kullanici sayfayi kapatir
