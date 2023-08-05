import java.util.ArrayList;
import java.util.List;


public class Main {
    static List<Integer>  tekList = new ArrayList<>();
    static List<Integer> ciftList = new ArrayList<>();

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();

        for (int i=1;i<=10000;i++){
            list.add(i);
        }

        int size = list.size()/4;
        List<Integer> list1 = list.subList(0,size);
        List<Integer> list2 = list.subList(size,size*2);
        List<Integer> list3 = list.subList(size*2,size*3);
        List<Integer> list4 = list.subList(size*3,size*4);


        Thread t1 = new Thread(new TekCift(list1));
        t1.start();
        Thread t2 = new Thread(new TekCift(list2));
        t2.start();
        Thread t3 = new Thread(new TekCift(list3));
        t3.start();
        Thread t4 = new Thread(new TekCift(list4));
        t4.start();

        try{
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }





        System.out.println(tekList);
        System.out.println(ciftList);











    }
}