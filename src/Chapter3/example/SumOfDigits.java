package Chapter3.example;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number : " );
        int number = scanner.nextInt();

        int sum = 0;
        do {
            sum += number % 10 ; // son basamak alınıyor
            number = number / 10; // Basamak azaltıldı

        }while (number > 0);

        System.out.println("Sum of digits : " + sum);
    }
}
