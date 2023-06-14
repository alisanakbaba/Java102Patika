public class Main {
    public static void main(String[] args) {
        Akademisyen ak1 = new Akademisyen("Ahmet Er",12414,"aher@gmail.com","CENG","çaylak");
        LabAsistani la1 = new LabAsistani("Dilan Çiçek",123452,"dilan@gmail.com","EENG","doçent","09:00-15:00");
        GuvenlikGorevlisi gg1 = new GuvenlikGorevlisi("Koray Avcı",87295932,"koray@gmail.com","iletişim","10:00-17:00","Cv");

        System.out.println(ak1.getTelefon());
        ak1.derseGir();
        ak1.cikis();
        la1.lablaraGir();
        System.out.println(la1.getOfisSaati());
        gg1.nobet();
        System.out.println(gg1.getDepartman());
    }
}