Feature: US002 Google Sayfasi Testi

  Scenario Outline: Arama kutusunda ford aratir
    Given kullanici "googleUrl" sayfasina gitti
    Then kullanici google arama kutusunda "<aranacakArac>" aratti
    But kullanici 1 saniye bekler
    And google sayfasinda basligin "<aranacakArac>" icerdigini test etti
    Examples:
      | aranacakArac |
      | arac1        |
      | arac2        |
      | arac3        |
      | arac4        |

      #Eğer Scenario Outline ile verileri .properties dosyasından almak istersek Examples altındaki verileri
#.properties dosyasinda oluşturduğumuz key'leri yazariz. Step definitionda oluşturduğuz parametreli method
#ile de ConfigReader sayesinde bu keylerin değerini kullanmış oluruz