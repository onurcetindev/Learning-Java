package Chapter2.example;

import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String operations = "1- Addition \n"
                            + "2- Subtraction\n"
                            + "3- Multiplication\n"
                            + "4- Divide\n";

        System.out.print(operations);
        System.out.println("Choose your operations : ");
        int operation = scanner.nextInt();
        System.out.println("Enter your first number : ");
        int number1 = scanner.nextInt();
        System.out.println("Enter your second number : ");
        int number2 = scanner.nextInt();
        switch (operation){
            case 1:
                System.out.println("Result : " +(number1 + number2));
                break;
            case 2:
                System.out.println("Result : " +(number1 - number2));
                break;
            case 3:
                System.out.println("Result : " +(number1 * number2));
                break;
            case 4:
                System.out.println("Result : " +((double) number1 / number2));
                break;
        }
    }
}
