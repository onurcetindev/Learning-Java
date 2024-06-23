package Chapter2;

import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {


        System.out.println("Enter your age : ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if(age < 18){
            System.out.println("You can not enter the university");
        }else if (age >=18 && age < 50){
            System.out.println("You can enter the university");
        }else {
            System.out.println("You are so old you can not enter the university");
        }

    }
}
