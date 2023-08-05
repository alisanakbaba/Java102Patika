import java.util.ArrayList;
import java.util.List;

public class TekCift implements Runnable{

    private List<Integer> subList = new ArrayList<>();



    public TekCift(List<Integer> subList){
        this.subList=subList;

    }
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        tekmiCiftmi();
    }

    public synchronized void tekmiCiftmi() {
        for (Integer i : this.subList) {
            if (i % 2 == 0) {
                synchronized (Main.ciftList) {
                    Main.ciftList.add(i);
                }
            } else {
                synchronized (Main.tekList) {
                    Main.tekList.add(i);
                }
            }
        }
    }

}
