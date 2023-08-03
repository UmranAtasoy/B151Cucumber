@tech
Feature: US003 TechProEducation Sayfasi Testi

#Feature file içinde Scenario larda ortak kullanilan step'lerde Background: yapisini kullanabiliriz.
  #Her scenario'dan önce buradaki step çalışır sonra scenario'daki stepler çalişmaya devam eder
  Background: Kullanici TechProEducation Sayfasina Gider
    Given kullanici techpro sayfasina gider

  Scenario: TC01 Sayfada Arama Yapar
    Then arama kutusunda qa aratir
    And sayfa basliginin qa icerdigini test eder

# Feature file da daha önce oluşturduğumuz bir method'u başka scenario larda tekra oluşturmadan kullanabiliriz
# Yukarıdaki örnekte sayfayı kapatır step'i için daha önce amazonStepdefinition class'ında oluşturduğumuz methodu
  #kullanabiliriz

  Scenario: TC02 Sayfada Arama Yapar
    Then arama kutusunda java aratir
    And sayfa basliginin java icerdigini test eder


  Scenario: TC03 Sayfada Arama Yapar
    Then arama kutusunda mobile aratir
    When cikan dropdown da mobile developer linkine tiklar
    And sayfa basliginin Mobile icerdigini test eder
    And sayfayi kapatir
  #Scenario larimizin tek bir browser da çalışmasını istersek ve tüm scenariolardan sonra browser'ı kapatmak istersek
  #en son scenario'da close yapabiliriz.