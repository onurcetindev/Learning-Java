package Chapter7;

import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [][] arr = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                        };

        int [][] array = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                array[i][j] = scanner.nextInt();
            }

        }
        System.out.println("***********************");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                System.out.println(array[i][j] + " ");
            }
            System.out.println("");

        }

    }
}
