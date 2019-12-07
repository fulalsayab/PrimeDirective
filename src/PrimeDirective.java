import java.util.ArrayList;


public class PrimeDirective {



    // creat and return an ArrayList with prime numbers

    public ArrayList<Integer> onlyPrimes (int[] numbers){
        ArrayList<Integer> primes= new ArrayList<Integer> (  );
        for (int number : numbers){
            if ( isPrime ( number ) ){
                primes.add ( number );
            }
        }

        return primes;
    }
    // checking if the array elements are primes
    public  boolean isPrime ( int number ) {
        if ( number == 2 ) {
            return true;
        } else if ( number >2 ) {
            for (int i = 2; i < number; i++) {
                if ( number % i == 0 ) {
                    return false;
                }
            }

        }
        return true;

    }
}
