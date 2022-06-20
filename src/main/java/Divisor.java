import java.util.concurrent.Callable;

public class Divisor implements Callable<Integer> {
    public int number;

    public Divisor(int number) {
        this.number = number;
    }

    public int countDivisors() {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }

        }
        return count;
    }

    @Override
    public Integer call() throws Exception {
        return countDivisors();
    }
}
