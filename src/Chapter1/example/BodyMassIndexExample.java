package Chapter1.example;

import java.util.Scanner;

public class BodyMassIndexExample {
    public static void main(String[] args) {

        // Body Mass Index = Weight/ (Height * Height)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your weight(kg) : ");
        double weight = scanner.nextDouble();
        System.out.println("Enter your height(meter) : "); // Nokta kullanma virgül kullan
        double height = scanner.nextDouble();
        double BMI = weight / (height*height);
        System.out.println(BMI);

        if (BMI < 18.5){
            System.out.println(" ZAYIF");
        }else if(BMI>18.5 && BMI<=24.9){
            System.out.println("NORMAL");
        }else if(BMI>25 && BMI <= 29.9){
            System.out.println("KİLOLU");
        }else if(BMI >30){
            System.out.println("OBEZ");
        }

    }
}
