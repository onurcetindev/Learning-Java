package Chapter1.example;

import java.util.Scanner;
import java.util.SortedMap;

public class Hypotenuse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first edge : ");
        int edge1 = scanner.nextInt();
        System.out.println("Enter second edge : ");
        int edge2 = scanner.nextInt();
        double hypo = Math.sqrt((edge1*edge1) + (edge2*edge2));
        System.out.println("Hypotenuse : " +hypo);
    }
}
