GİRİŞ
Bu projede bizden istenen grafı java swing kullanarak görselleştirme, oluşturulan graf üzerinde maximum flow ve minimum cut algoritmalaraını uygulamaktır.
Ben projede Netbeans IDE kullandım. Java ile uygulamamı geliştirdim
I.	GUI
A.	CreateGraphGUI

Bu frame içerisinden kullanıcıdan almam gereken değerleri text field ile aldım. Graf içinde kaç düğüm oluşturulacağı, Başlangıç ve bitiş düğümleri, kenar ağırlıkları gibi değerleri böylelikle kullanıcıdan almıs oldum.

Kullanıcının oluşturacağı düğüm sayısı ile başlangıç ve düğüm sayılarını aldıktan sonra soldaki panel üzerinde tıklama ve realased methodları ile grafı maouse yardımıyla çizdirdim. 

-Uygulamanın görüntüsü: Koyu mavi ekranda mouse yardımıyla graf çizebiliyoruz.

-Uygulamada Kullanıcıdan düğüm sayısı başlangıç düğümü ve bitiş düğümünü aldığım yer:

-Uygulamada graf çizdikten sonra görünüm:

-Graf kenar ağırlıklarını aldığım yer:

-Max Flow uygulanan ve sonuclarını basan buton:

-Min cut algoritması sonucu kesilecek kenarları göstermeyi sağlayan buton:

II.	SONUÇ
Uygulamayı yaparken  önce grafı görselleştirme üzerinde durdum. Mouse yardımı ile grafı oluşturdum. Ve Her oluşturduğum node ve edgeyi gerekli hashmaplerde tuttum. Edge leri çizerken aynı zamanda weights adlı oluşturduğum kenarların ağırlıklarını da kullanıcıdan istedim. Aldığım hashmapleri adjencency listte tutmaya çalıştım ve bu listi max flow classına ve min cut classına göderdim sonucları ekrandaki labellere bastırmaya çalıştım.
Havuz Problemi
