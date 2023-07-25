import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fikstur {

    private List<String> teams=new ArrayList<>();
    private String outTeam;  // Dışta kalan takım
    private int numberTeam;
    private List<String> firstHalfFixture=new ArrayList<>();
    private List<String> secondHalfFixture=new ArrayList<>();
    private int numberWeek;

    public Fikstur(int numberTeam){
        this.numberTeam=numberTeam;
        this.numberWeek=numberTeam-1;
    }

    // Lige takım ekleme metodu
    public void addTeam(String team){
        teams.add(team);
    }


    // Her hafta bitiminde takımlar listesini bir birim sağa kaydırma metodu.
    public void scroll(){
        String tmp=this.teams.get(this.teams.size()-1);

        for (int i=this.teams.size()-1;i>0;i--){
            this.teams.set(i, this.teams.get(i-1));
        }
        this.teams.set(0,tmp);
    }

    public void fixturePreparation(){
        Collections.shuffle(this.teams);   // kullanıcının girdiği takımların listedeki yerini random şekilde değiştiriyor
        String l=getTeams().remove(0);  // listenin ilk elemanını dışarıda kalacak olan takım olarak belirleriz
        setOutTeam(l);
        System.out.println(getOutTeam()+"      "+getTeams());
        int count1=1,count2=0,count3=0;  //count1 dışta kalan takımın üst üste aynı yerde oynamasını sağlıyor
        // count2 bir ev sahibi bir deplasman takımı olmasını sağlıyor count3: diğer kalan takımlar için benzer bir kural uyguluyor
        for (int i=1;i<=this.numberWeek;i++){
            int k=0,j=this.teams.size()-1;
            // Dışta kalan takım üst üste 2 kere ev sahibi veya deplasman takımı olsun ardından sırayla değişsin
            if (count1%2==0||count2<2){
                this.firstHalfFixture.add(this.outTeam);
                this.firstHalfFixture.add(this.teams.get(this.teams.size()/2));
                count2++;
            }else {
                this.firstHalfFixture.add(this.teams.get(this.teams.size()/2));
                this.firstHalfFixture.add(this.outTeam);
            }
            count1++;


            while (k<j){
                if (count3%2==0){
                    this.firstHalfFixture.add(this.teams.get(k++));
                    this.firstHalfFixture.add(this.teams.get(j--));
                }else {
                    this.firstHalfFixture.add(this.teams.get(j--));
                    this.firstHalfFixture.add(this.teams.get(k++));
                }
            }
            count3++;
            scroll();// her hafta sonunda listeyi kaydır ve listenin ortasındaki takım dıştaki takım ile
            // diğer takımlar içten dışa doğru eşleşsin
        }
    }

    // Projede herhangi bir takımın sırayla ev sahibi ve deplasman takımı olması ayarlanamadı.

    public void fixturePreparation2(){ // ikinci yarı fikstüründe sadece ev sahibi takım ile deplasman takımı yer değişeceği için indexleri yerini değiştirerek ekleriz
        for (int i=0;i<this.firstHalfFixture.size()-1;i+=2){
            this.secondHalfFixture.add(this.firstHalfFixture.get(i+1));
            this.secondHalfFixture.add(this.firstHalfFixture.get(i));
        }
    }

    public void printWeek(List<String> tmp){
        int half=1,index=0,value=0;
        // Hangi yarıda olduğunu tutan değişken--> half
        // İkinci yarıdaki maçların kaçıncı haftada olduğunu eklenerek belirten değişken--> index


        if (tmp==this.secondHalfFixture){  // İkinci yarı fikstürü ise
            half=2;
            index=this.numberWeek;
        }

        System.out.println("----------------"+half+".YARI FİKSTÜRÜ----------------");

        for (int i=1+index;i<=this.numberWeek+index;i++){
            System.out.println(i+".Hafta Maçları");
            for (int j=value;j<this.numberTeam-1+value;j+=2){
                System.out.println(tmp.get(j)+"   -   "+tmp.get(j+1));  // çift sayıların indexi ev sahibi takım yanında ki tek sayıların indexi ise deplasman takımı
            }
            value+=this.numberTeam;  // fikstür listeden oluşuyor ve takımlar maç sırası ile eklendi ve indexi tamamen dolaşmak için bu değer gerekli
            System.out.println();
        }
    }

    public void run(){
        System.out.println(this.teams);
        fixturePreparation();
        fixturePreparation2();
        printWeek(this.firstHalfFixture);
        printWeek(this.secondHalfFixture);
        //printIndex();
    }

    /* (Takımların findIndex metodunun sonucunu toplu şekilde görme)
    public void printIndex(){
        for (int i=0;i<this.numberTeam-1;i++){
            System.out.println(findIndex(this.teams.get(i)));
        }
    }


    (Herhangi bir takımın 3 hafta üst üste ev sahibi veya deplasman takımı
     olmuşmu diye indexlere bakarak kısa yoldan takip eden metod)

    public List<Integer> findIndex(String team){
        List<Integer> indexs = new ArrayList<>();

        for (int i=0;i<this.firstHalfFixture.size();i++){
            if (this.firstHalfFixture.get(i).equals(team)){
                indexs.add(i);
            }
        }

        for (int j=0;j<this.secondHalfFixture.size();j++){
            if (this.secondHalfFixture.get(j).equals(team)){
                indexs.add(j);
            }
        }
        return indexs;
    }

     */


    public List<String> getTeams() {
        return teams;
    }

    public String getOutTeam() {
        return outTeam;
    }

    public void setOutTeam(String outTeam) {
        this.outTeam = outTeam;
    }

}