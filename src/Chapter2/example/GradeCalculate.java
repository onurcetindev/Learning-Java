package Chapter2.example;

import java.util.Scanner;

public class GradeCalculate {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your midterm grade : ");
        double midterm = scanner.nextDouble();
        System.out.println("Enter your final grade : ");
        double fin = scanner.nextDouble();

        double grade = ( midterm * 0.4 ) + (fin * 0.6 );

        if (grade >= 88){
            System.out.println("AA");
        }else if(grade < 88 && grade >= 81){
            System.out.println("BA");
        }else if(grade < 81 && grade >= 74){
            System.out.println("BB");
        }
        else if(grade < 74 && grade >= 66){
            System.out.println("CB");
        }
        else if(grade < 66 && grade >= 60){
            System.out.println("CC");
        }
        else if(grade < 60 && grade >= 53){
            System.out.println("DC");
        }
        else if(grade < 53 && grade >= 46){
            System.out.println("DD");
        }else{
            System.out.println("FF");
        }


    }
}
