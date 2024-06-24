package Chapter2.example;

import java.util.Scanner;

public class FindMaxValue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first value : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter your second value : ");
        int num2 = scanner.nextInt();
        System.out.println("Enter your third value  : ");
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("Max value is : " +num1);
        }
        else if(num2 > num3 && num2 > num1){
            System.out.println("Max value is : " +num2);
        }
        else if(num3 > num1 && num3 > num2){
            System.out.println("Max value is : " +num3);
        }
    }
}
