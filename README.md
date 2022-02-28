StudyCase klasörü içerisnde 1.case çalışması bulunmakta.
Projenin çalıştırılması için aşağıdaki konfigürasyonların yapılması gerekmekte.
System variables' da JAVA_HOME adında bir variables eklenmesi gerekmekte ve buraya jdk'nın bulunduğu path verilmeli, eklenecek jdk https://jdk.java.net/archive/  17.versiyon.
System variables -PATH kısmına  %JAVA_HOME%\bin eklenmeli
apache-maven-3.8.3 için C:\Program Files\Dev_Programs altında Dev_Programs adında  klasör oluşturulur,
System variables da maven için M2_HOME oluşturulur ve buraya dosya path'i verilir. System variables da path alanına %M2_HOME%\bin eklenir

Classlar hakkında kısa bilgiler:
src > main > java > utils > Global_Vars class'ından url bilgisi verilmekte.
src > main > java > properties > config.properties kullanılmak istenen tarayıcı parameteresi ayarlanmakta.
src > main > java > driver > DriverFactory istenilen driverın çalıştırıldığı class
src > test > java > runners > MainRunner classında caselerin paralel yada tekil olarak kuşulması sağlanmakta, ayrıca burada caseler için raporlama yapılmakta
src > test > java > stepDefinitions > base > Hooks classında koşuma başlanacak case stepleri için driver setup yapılmakta ve hata alan senaryolar için ekran görüntüsü alınmakta.
src > test > java > stepDefinitions  klasöründe ilgili case'in stepleri verilmiştir.
src > test > resources > features klasörü altında feature dosyaları bulunmakta
src > main > java > pageObjects kalsörü altında sayfa page object tanımları yapılmıştır
src > main > java > driver > drivers altında driver .exe leri bulunmakta.

studyCase-api-project klasörü içerisinde 2. case çalışması bulunmakta, burada projeyi gradle framework'ü ile yapmak istediğimden farklı bir proje olarak yaptım.

src > test > java > steps klasörü altında koşumu yapılacak caselerin adımları bulunmakta, Config clasında caselerin url-path gibi parametleri tanımlanmakta.
src > test > resources > features klasötü altında feature dosyaları bulunmakta

not:
api testini tamamlayamadım eksiklerim bulunmakta. Docker uygulamasını bilgisayarımda çalıştırmadığımdan yapmak istediğim çalışmayı tamamlayamadım.
Mevcut işimden dolayı yoğunluğum olduğu için yeterli araştırma yapamadım. 

yorum:
Umarım çalışmamı beğenirsiniz, kısa sürede elimden geldiğince iyi bir iş çıkarmaya çalıştım.
Genel olarak araştırarak yaptığım bir study case çalışması oldu bu vesileyle yeni bilgiler öğrenmiş oldum.
Projeyi dilerseniz beraber inceleyerek çalışmamı aktarabilirim.
