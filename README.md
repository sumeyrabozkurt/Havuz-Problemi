Bu projede, java swing kullanarak görselleştireren graf üzerinde maximum flow ve minimum cut algoritmaları uygulanmaktır.
I.	GUI
A.	CreateGraphGUI

Bu frame içerisinde graf içinde kaç düğüm oluşturulacağı, başlangıç ve bitiş düğümleri, kenar ağırlıkları gibi değerler kullanıcıdan alındı.

Kullanıcının oluşturacağı düğüm sayısı ile başlangıç ve düğüm sayılarını aldıktan sonra soldaki panel üzerinde tıklama ve realased methodları ile grafı maouse yardımıyla çizdirdim. 

Uygulamayı yaparken  önce grafı görselleştirme üzerinde durdum. Mouse yardımı ile grafı oluşturdum. Ve Her oluşturduğum node ve edgeyi gerekli hashmaplerde tuttum. Edge leri çizerken aynı zamanda weights adlı oluşturduğum kenarların ağırlıklarını da kullanıcıdan istedim. Aldığım hashmapleri adjencency listte tutmaya çalıştım ve bu listi max flow classına ve min cut classına göderdim sonucları ekrandaki labellere bastırmaya çalıştım.
