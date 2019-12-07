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
    //a method that returns an ArrayList of the first 4 primes from another  array.

    public ArrayList<Integer> firstFourNumbers(int[] numbers){

        ArrayList <Integer> firstFour = new ArrayList<> ( );

        if ( numbers.length <4 ){
            System.out.println ("InValid Array length" );
        }
        for (int i = 0; i < 4 ; i++) {
            firstFour.add ( numbers[i] );

        }
        return firstFour;


    }


    //method that returns an ArrayList of the first n Fibonacci numbers

    public ArrayList<Integer>  fibonacci(int[] numbers){
        ArrayList<Integer> fibonacciNumbers = new ArrayList<> (  );
        if ( numbers.length<3 ){
            System.out.println ("InValid Array length" );
        }
        for (int i = 2 ; i < numbers.length; i++) {
            if ( numbers[i] == (numbers[i-1] ) + (numbers[i-2] ) ) {
                fibonacciNumbers.add ( numbers[i]);
            }
        }
        return fibonacciNumbers;

    }
}
