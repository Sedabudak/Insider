Insider QA Automation

Hakkında

Bu proje, Insider web sitesindeki QA iş ilanlarını kontrol eden otomasyon testlerini içerir.
Testler Java + Selenium + TestNG ile, Page Object Model (POM) mimarisi kullanılarak IntelliJ IDEA üzerinde geliştirilmiştir.


Teknik Detaylar

Dil: Java

Framework: Selenium + TestNG

IDE: IntelliJ IDEA

Yapı: Page Object Model (POM)

Test başarısız olursa otomatik olarak ekran görüntüsü alınır.


------ooo-----ooo-----------ooo-----ooo-----------ooo-----ooo-----------ooo-----ooo-----------ooo-----ooo-----------ooo-----ooo-----------ooo-----ooo-----------ooo-----ooo-----

*****  BUG REPORT *****

Bug ID: QA-001

Başlık: Location Filter - "Istanbul, Turkey" vs "Istanbul, Turkiye" Uyumsuzluğu

Öncelik: High
Şiddet: Medium

Açıklama :
- QA Jobs sayfasında Location filtresi çalışmamaktadır. Test gereksinimlerinde "Istanbul, Turkey" olarak belirtilen değer, web sitesinde "Istanbul, Turkiye" olarak görünmektedir.
  
Adımlar :

- https://useinsider.com/careers/quality-assurance/ sayfasına git
- "See all QA jobs" butonuna tıkla
- Location filtresini aç
- "Istanbul, Turkey" araması yap
  
Beklenen Sonuç :
- Location filtresinde "Istanbul, Turkey" seçeneği bulunmalı ve seçilebilir olmalı.
  
Gerçek Sonuç :
- Location filtresinde "Istanbul, Turkey" seçeneği bulunmuyor
- Sitede "Istanbul, Turkiye" seçeneği mevcut
- Test başarısız oluyor
- 
Ekran Görüntüsü :
[Test çalıştırıldığında alınan screenshot.png dosyası]

Teknik Detaylar :

- Test Gereksinimi: "Istanbul, Turkey"
- Site Gerçeği: "Istanbul, Turkiye"
- Dil: Türkçe
- Etkilenen Test: QaJobsGoruntulemeTesti
