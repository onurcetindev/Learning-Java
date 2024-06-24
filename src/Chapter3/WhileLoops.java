package Chapter3;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        /*while(loop condition){
            if condition ise true loop can run
           }
         */

        int i = 0;
        while (i < 100){
            System.out.println("i= " +i);
            i = i+2;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your factorial number : ");
        int number = scanner.nextInt();

        int factorial = 1;


        while (number > 0){
            factorial *= number;
            number --;

        }
        System.out.println("Result : " + factorial);
    }
}
