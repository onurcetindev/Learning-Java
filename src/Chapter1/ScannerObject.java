package Chapter1;

import java.util.Scanner;

public class ScannerObject {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age :");
        int age = scanner.nextInt();

        System.out.println("Your age is equal to : " + age);

        // I know if else
        /*if(age > 18){
            System.out.println("You are big boy");
        }else{
            System.out.println("You are child ");
        }*/


    }
}
