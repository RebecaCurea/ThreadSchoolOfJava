import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(10);
        int nrMaxDivisors = 0;
        int position = 0;
        try {
            for (int i = 1; i <= 100000; i++) {
                Divisor d = new Divisor(i);
                int value = es.submit(d).get();
                if (value > nrMaxDivisors) {
                    nrMaxDivisors = value;
                    position = i;
                }
            }
            es.shutdown();
        } catch (Exception e) {
        }
        System.out.println("Number: " + position + " \nNumber of divisors:" + nrMaxDivisors);
    }


}
