package Chapter1.example;

import java.util.Scanner;

public class KilometerToFuel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Araç kilometre başına kaç TL yakıyor : ");
        double price = scanner.nextDouble();
        System.out.println("Kaç kilometre yol gittiniz : ");
        double km = scanner.nextDouble();
        double maaliyet = km * price;
        System.out.println("Maaliyetiniz : " + maaliyet);
    }
}
