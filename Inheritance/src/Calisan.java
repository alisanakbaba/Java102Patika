public class Calisan {
    private String adSoyad;
    private int telefon;
    private String ePosta;

    public Calisan(String adSoyad,int telefon,String ePosta){
        this.adSoyad=adSoyad;
        this.telefon=telefon;
        this.ePosta=ePosta;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public String getePosta() {
        return ePosta;
    }

    public void setePosta(String ePosta) {
        this.ePosta = ePosta;
    }

    public void giris(){
        System.out.println(this.adSoyad+" Üniversiteye giriş yaptı!!");
    }

    public void cikis(){
        System.out.println(this.adSoyad+" Üniversiteden çıkış yaptı!!");
    }

    public void yemekhane(){
        System.out.println(this.adSoyad+" Yemekhaneye giriş yaptı!!");
    }
}
