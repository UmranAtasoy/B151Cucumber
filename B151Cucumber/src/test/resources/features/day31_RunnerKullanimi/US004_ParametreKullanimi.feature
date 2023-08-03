Feature: US004 TechProEducation Arama Testi
  Scenario: TC01 Sayfada Arama Yapar
    Given kullanici "https://techproeducation.com" sayfasina gider
    Then arama kutusunda "mobile" aratir
    When cikan dropdown da mobile developer linkine tiklar
    And sayfa basliginin Mobile icerdigini test eder
    And sayfayi kapatir

  Scenario: TC02 Sayfada Arama Yapar
    Given kullanici "https://techproeducation.com" sayfasina gider
    Then arama kutusunda "qa" aratir
    And sayfayi kapatir

  Scenario: TC03 Sayfada Arama Yapar
    Given kullanici "https://techproeducation.com" sayfasina gider
    Then arama kutusunda "java" aratir
    And sayfayi kapatir