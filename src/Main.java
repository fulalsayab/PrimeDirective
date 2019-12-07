/**
 * program that creates an ArrayList of all prime numbers in an array.
 * <
 * Created by Ful Al Sayab 12/07/2019
 */
public class Main {
    // the main method
    public static void main ( String[] args ) {

        //an instance of PrimeDirective (pd)
        PrimeDirective pd = new PrimeDirective ( );
        int[] numbers = {6 , 29 , 28 , 33 , 11 , 100 , 101 , 43 , 89};
        PrimeDirective prime= new PrimeDirective ();

        System.out.println (prime.isPrime ( numbers[4]) );
        System.out.println (pd.onlyPrimes ( numbers ) );

    }
}
