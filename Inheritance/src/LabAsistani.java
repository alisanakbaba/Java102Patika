public class LabAsistani extends Asistan{

    public LabAsistani(String adSoyad,int telefon,String ePosta,String bolum,String unvan,String ofisSaati){
        super(adSoyad,telefon,ePosta,bolum,unvan,ofisSaati);
    }

    public void lablaraGir(){
        System.out.println(this.getAdSoyad()+" Laboratuvarda ders başında");
    }

    public void derseGir(){
        System.out.println(this.getAdSoyad()+" Dersine girdi!!");
    }
}
