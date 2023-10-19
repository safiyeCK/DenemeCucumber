Feature: Kitapyurdunda login islemleri

  Scenario Outline: Kitapyurdu sayfasina kayitli kullanici adi ve sifreleri ile giris yapilir
    Given kullanici kitapyurdu sayfasina gider
    Then kullanici 2 saniye bekler
    And kitapyurdu sayfasinda girisyap butonuna tiklar
    And verilen "<email>" ve "<password>" lerle giris yapar
    And kullanici sayfayi yeniler
    And kullanici sayfayi kapatir
    Examples:
      | email | password |
      | jaced.ortels@yopmail.com     | b171team02 |
      | kaeson.kaylon@free2ducks.com | b111t023   |

  Scenario Outline:Kitapyurdu sayfasinda arama kutusunda kitap aratilir
    Given kullanici kitapyurdu sayfasina gider
    And kullanici 3 saniye bekler
    Then kullanici kitapyurdu arama kutusunda "<kitaplari>" aratir
    And kullanici 3 saniye bekler
    And kullanici cikan sonuclardan ilk urunu sepete ekler
    And kullanici 3 saniye bekler
    And kullanici sayfayi kapatir
    Examples:
      | kitaplari |
      | Dirilis |
      | Simyaci |
      | Yuzuklerin Efendisi |

