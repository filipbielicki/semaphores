import java.util.concurrent.Semaphore;

/**
 * Created by Filip on 2017-11-11.
 */
public class Main {

    public static void main(String[] args) {

        Semaphore semaphore1 = new Semaphore(1);
        Semaphore semaphore2 = new Semaphore(0);

        new Thread(new OddNumber(semaphore1, semaphore2, "Odd number")).start();
        new Thread(new EvenNumber(semaphore1, semaphore2, "Even number")).start();
    }
}
