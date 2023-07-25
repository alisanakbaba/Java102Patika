import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isAddBay=false;

        System.out.print("Ligde kaç takım olacak: ");
        int numberTeam=input.nextInt();

        if (numberTeam%2==1){
            numberTeam++;
            isAddBay=true;
        }

        Fikstur trendyol = new Fikstur(numberTeam);

        for(int i=0;i<numberTeam;i++){
            System.out.print("Takım giriniz: ");
            String team=input.next();
            trendyol.addTeam(team);
        }

        if (isAddBay) {
            trendyol.addTeam("BAY");
        }

        trendyol.run();





    }
}