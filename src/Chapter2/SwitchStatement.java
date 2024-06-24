package Chapter2;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grade : ");
        int grade = scanner.nextInt();

        switch (grade){
            case 90:
                System.out.println("AA");
                break;
            case 80:
                System.out.println("BB");
                break;
            case 60:
                System.out.println("CC");
                break;
            case 30:
                System.out.println("FF");
                break;
            default:
                System.out.println("Enter yout grade like this : 90-80-60-30");
                break;
        }

    }
}
