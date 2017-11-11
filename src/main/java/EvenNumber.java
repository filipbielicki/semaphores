import java.util.concurrent.Semaphore;

/**
 * Created by Filip on 2017-11-11.
 */
public class EvenNumber implements Runnable {

    private Semaphore semaphore1;
    private Semaphore semaphore2;
    private String name;

    public EvenNumber(Semaphore semaphore1, Semaphore semaphore2, String name) {
        this.semaphore1 = semaphore1;
        this.semaphore2 = semaphore2;
        this.name = name;
    }

    public void run() {

        for(int i = 2; i < 21; i+=2){

            try {
                semaphore2.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(name + " " + i);

            semaphore1.release();
        }
    }
}
