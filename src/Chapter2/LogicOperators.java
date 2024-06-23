package Chapter2;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class LogicOperators {
    public static void main(String[] args) {
        // ==  equal check
        // !=  not equal checl
        // >   greater
        // <   smaller
        // &&  AND
        // ||  OR
        // !   NOT

        System.out.println(3 == 4);
        System.out.println(3 < 4);
        System.out.println(3 > 4);
        System.out.println(3 != 4);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = scanner.nextInt();

        if(age<18){
            System.out.println("Child");
        }else if(age >=18 && age < 25){
            System.out.println("Young");
        }else{
            System.out.println("Old");
        }

        System.out.println("Enter your grade : ");
        int grade = scanner.nextInt();


        if(grade<20 || grade > 90){
            System.out.println("You are crazy ");
        }else{
            System.out.println("You are normal ");
        }

    }
}
