public class MyList<T> {
    @SuppressWarnings("unchecked")
    private T[] array=(T[]) new Object[10];
    private int capacity;


    public MyList(){
        capacity =10;
    }

    @SuppressWarnings("unchecked")
    public MyList(int capacity){
        if (capacity<=0){
            capacity=10;
        }
        array = (T[]) new Object[capacity];
        this.capacity =capacity;
    }

    //size() : dizideki eleman sayısını verir.

    public int size(){
        int count=0;
        for(T value:this.array){
            if (value!=null) {
                count += 1;
            }
        }
        return count;
    }

    //getCapacity() : dizinin kapasite değerini verir.

    public int getCapacity() {
        return this.array.length;
    }

    //add(T data) : sınıfa ait diziye eleman eklemek için kullanılmalıdır. Eğer dizide yeteri kadar yer yok ise, dizi boyutu 2 katına çıkartılmalıdır.

    @SuppressWarnings("unchecked")
    public void add(T data){
        if (getCapacity()==size()) {
            //System.out.println("Dizi dolu");
            this.capacity *= 2;
            T[] newArray = (T[]) new Object[this.capacity];
            //System.out.println("Dizi boyutu güncellendi");
            for (int i = 0; i < size(); i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[size()]=data;
    }

    // get(int index): verilen indisteki değeri döndürür. Geçersiz indis girilerse null döndürür.

    public T get(int index){
        if ((index<0)||(index>=size())){
            return null;
        }
        return this.array[index];
    }

    // remove(int index): verilen indisteki veriyi silmeli ve silinen indis sonrasında ki verileri sol doğru kaydırmalı. Geçersiz indis girilerse null döndürür.

    public String remove(int index){
        if((index<0)||(index>=getCapacity())){
            return null;
        }
        for(int i=index;i<size()-1;i++){
            this.array[i]=this.array[i+1];
        }
        this.array[size()-1]=null;
        return "Silme İşlemi Başarılı";

    }

    // set(int index, T data) : verilen indisteki veriyi yenisi ile değiştirme işlemini yapmalıdır. Geçersiz indis girilerse null döndürür.

    public String set(int index,T data){
        if((index<0)||(index>getCapacity())) {
            return null;
        }
        this.array[index]=data;
        return "İşlem Başarılı";

    }


    // String toString() : Sınıfa ait dizideki elemanları listeleyen bir metot.

    public String toString(){
        System.out.print("[");
        for(int i=0;i<size();i++){
            System.out.print(this.array[i]+" ");
        }
        return "]";
    }



    // int indexOf(T data) : Parametrede verilen nesnenin listedeki indeksini verir. Nesne listede yoksa -1 değerini verir.

    public int indexOf(T data){
        for(int i=0;i<size();i++){
            if(this.array[i]==data){
                return i;
            }
        }
        return -1;
    }

    //int lastIndexOf(T data) : Belirtilen öğenin listedeki son indeksini söyler. Nesne listede yoksa -1 değerini verir.

    public int lastIndexOf(T data){
        for(int i=size()-1;i>=0;i--){
            if(this.array[i].equals(data)){
                return i;
            }
        }
        return -1;
    }

    //boolean isEmpty() : Listenin boş olup olmadığını söyler.

    public boolean isEmpty(){
        return size()==0;
    }

    // clear() : Listedeki bütün öğeleri siler, boş liste haline getirir.

    @SuppressWarnings("unchecked")
    public void clear(){
        for(int i=0;i<capacity;i++){
            this.array[i]=null;
        }
        capacity=10;
        this.array=(T[]) new Object[capacity];
    }

    //T[] toArray() : Listedeki öğeleri, aynı sırayla bir array haline getirir.

    @SuppressWarnings("unchecked")
    public T[] toArray(){
        T[] newArray = (T[]) new Object[size()];
        for(int i=0;i<size();i++){
            newArray[i]=this.array[i];
        }
        return newArray;
    }

    //boolean contains(T data) : Parametrede verilen değerin dizide olup olmadığını söyler.

    public boolean contains(T data){
        for(T i:this.array){
            if(i==data){
                return true;
            }
        }
        return false;
    }

    //MyList<T> sublist(int start,int finish) : Parametrede verilen indeks aralığına ait bir liste döner.

    public MyList<T> subList(int start,int finish){
        if(start<0 || start>=size() || finish<=start || finish>size()){
            return null;
        }
        MyList<T> sublist = new MyList<>(finish-start+1);
        for(int i=start;i<=finish;i++){
            sublist.array[i]=this.array[i];
        }
        return sublist;
    }
}
