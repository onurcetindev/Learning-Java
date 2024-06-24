package Chapter3.example;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        // 1634 = 1^4 + 6^4 + 3^4 + 4^4
        // 371 = 3^3 + 7^3 + 1^3
        // Use do while

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz  : ");
        int number = scanner.nextInt();
        System.out.println("Basamak sayısını giriniz : ");
        int basamak = scanner.nextInt();

        int sum = 0;
        int temp = number ;

        do {
            int basamakDegeri = temp % 10 ;

            temp = temp / 10;

            sum += Math.pow(basamakDegeri,basamak);

        }while (temp > 0);

        if (number == sum){
            System.out.println(" It is armstrong number");
        }else{
            System.out.println("It is not armstrong number ");
        }


    }
}
