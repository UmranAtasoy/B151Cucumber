@all
Feature: US001 TechProEducation Sayfasi Testi
  Scenario: TC01 Sayfada Arama Yapar
    Given kullanici techpro sayfasina gider
    Then arama kutusunda qa aratir
    And sayfa basliginin qa icerdigini test eder
    And sayfayi kapatir
# Feature file da daha önce oluşturduğumuz bir method'u başka scenario larda tekra oluşturmadan kullanabiliriz
# Yukarıdaki örnekte sayfayı kapatır step'i için daha önce amazonStepdefinition class'ında oluşturduğumuz methodu
  #kullanabiliriz
  Scenario: TC02 Sayfada Arama Yapar
    Given kullanici techpro sayfasina gider
    Then arama kutusunda java aratir
    And sayfa basliginin java icerdigini test eder
    And sayfayi kapatir

  @techpro
  Scenario: TC03 Sayfada Arama Yapar
    Given kullanici techpro sayfasina gider
    Then arama kutusunda mobile aratir
    When cikan dropdown da mobile developer linkine tiklar
    And sayfa basliginin Mobile icerdigini test eder
    And sayfayi kapatir