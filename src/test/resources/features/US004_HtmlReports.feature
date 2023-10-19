Feature: GoogleTesti
Background: Kullanici google anasayfasina gider

Given Kullanici parametreli method ile "https://google.com" sayfasina gider
And kullanici google cerezleri kabul eder
And kullanici 2 saniye bekler

@arac
Scenario: TC01 Google sayfasinda aram kutusunda arac aratilir
Given arama kutusunda "volvo" aratir
And kullanici 2 saniye bekler
And sayfa basliginin "volvo" icerdigini test eder
And kullanici sayfayi kapatir

Scenario: TC02 Google sayfasinda aram kutusunda arac aratilir
Given arama kutusunda "audi" aratir
And kullanici 2 saniye bekler
And sayfa basliginin "Citroen" icerdigini test eder
And kullanici sayfayi kapatir