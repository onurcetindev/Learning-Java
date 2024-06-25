package Chapter4.example;

import com.sun.source.tree.BreakTree;

public class PrimeNumbers {

    // 1- 1000 Prime numbers
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }


    }
    public static boolean isPrime(int number){
        for(int i = 2; i < number; i++ ) {
            if (number % i == 0) {
                return false;
            }

        }
    return  true;
    }

}
