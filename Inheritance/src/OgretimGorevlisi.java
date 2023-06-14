public class OgretimGorevlisi extends Akademisyen {
    private int kapiNo;

    public OgretimGorevlisi(String adSoyad,int telefon,String ePsota,String bolum,String unvan,int kapiNo){
        super(adSoyad,telefon,ePsota,bolum,unvan);
        this.kapiNo=kapiNo;
    }

    public int getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(int kapiNo) {
        this.kapiNo = kapiNo;
    }

    public void senatoToplanti(){
        System.out.println(this.getAdSoyad()+" Senato toplantısına katıldı!!");
    }
}
