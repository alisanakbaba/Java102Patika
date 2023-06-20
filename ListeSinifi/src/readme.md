Kendi Liste Sınıfımızı Yazmak  <br>


Java'da generic yapısını kullanarak verileri tuttuğumuz bir sınıf tasarlıyoruz.  <br>

Sınıfın amacı içerisinde dinamik bir Array (Dizi) tutması ve veri tipini dinamik olarak alması. Bunun için generic bir sınıf oluşturulması gerekli.  <br>



NOT : COLLECTION SINIFI KULLANILMAYACAKTIR ! KENDİ LİSTE SINIFIMIZI OLUŞTURMALIYIZ.  <br>



Sınıf özellikleri :  <br>



Sınıf içerisindeki dizinin varsayılan boyutu 10 ve dizinin eleman sayısı ihtiyaç duydukça 2 katı şeklinde artmalı. <br>


Sınıfa ait iki tür constructor metot bulunmalı <br>


MyList() : Boş contructor kullanılırsa dizinin başlangıç boyutu 10 olmalıdır. <br>


MyList(int capacity) : Dizinin başlangıç değeri capacity parametresinden alınmalıdır. <br>
 

size() : dizideki eleman sayısını verir. <br>


getCapacity() : dizinin kapasite değerini verir. <br>


add(T data) : sınıfa ait diziye eleman eklemek için kullanılmalıdır. Eğer dizide yeteri kadar yer yok ise, dizi boyutu 2 katına çıkartılmalıdır. <br>

get(int index): verilen indisteki değeri döndürür. Geçersiz indis girilerse null döndürür.  <br>


remove(int index): verilen indisteki veriyi silmeli ve silinen indis sonrasında ki verileri sol doğru kaydırmalı. Geçersiz indis girilerse null döndürür. <br>


set(int index, T data) : verilen indisteki veriyi yenisi ile değiştirme işlemini yapmalıdır. Geçersiz indis girilerse null döndürür.  <br>


String toString() : Sınıfa ait dizideki elemanları listeleyen bir metot. <br>

int indexOf(T data) : Parametrede verilen nesnenin listedeki indeksini verir. Nesne listede yoksa -1 değerini verir. <br>


int lastIndexOf(T data) : Belirtilen öğenin listedeki son indeksini söyler. Nesne listede yoksa -1 değerini verir. <br>


boolean isEmpty() : Listenin boş olup olmadığını söyler. <br>


T[] toArray() : Listedeki öğeleri, aynı sırayla bir array haline getirir. <br>


clear() : Listedeki bütün öğeleri siler, boş liste haline getirir. <br>


MyList<T> sublist(int start,int finish) : Parametrede verilen indeks aralığına ait bir liste döner. <br>


boolean contains(T data) : Parametrede verilen değerin dizide olup olmadığını söyler.
