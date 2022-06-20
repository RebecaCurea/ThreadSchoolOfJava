public class OneThread {


    public static void main(String[] args) {
        int nrMaxDivisors=0;
        int position=0;
        for (int i = 1; i < 100000; i++) {
            Divisor d =new Divisor(i);
            int  value=d.countDivisors();
            if(value>nrMaxDivisors){
                nrMaxDivisors=value;
                position=i;

            }
        }
        System.out.println("Number: " +position +"\nNumber of divisors: " + nrMaxDivisors);
    }

}
