public class Asistan extends Akademisyen{
    private String ofisSaati;

    public Asistan(String adSoyad,int telefon,String ePosta,String bolum,String unvan,String ofisSaati){
        super(adSoyad,telefon,ePosta,bolum,unvan);
        this.ofisSaati=ofisSaati;
    }

    public void setOfisSaati(String ofisSaati){
        this.ofisSaati=ofisSaati;
    }

    public String getOfisSaati(){
        return this.ofisSaati;
    }

    public void quizYap(){
        System.out.println(this.getAdSoyad()+" Quizi başlattı");
    }
}
