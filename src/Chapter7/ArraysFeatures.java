package Chapter7;

import java.util.Scanner;
import java.util.Arrays;

public class ArraysFeatures {
    public static void main(String[] args) {
        //int[] arr = fillArray(4);

       // sort_array(arr);

        int [] x  = {1,2,3,4,5};
        int [] y = {1,2,3,4,5};

        if (Arrays.equals(x, y)) {
            System.out.println("X and Y are the same");
        }else {
            System.out.println("X and Y are not the same");
        }




    }
    public static int[] fillArray(int number){
        System.out.println("Enter your numbers");
        Scanner scanner = new Scanner(System.in);
        int[] output = new int[number];
        for(int i = 0; i < number; i++){
            output[i] = scanner.nextInt();
        }
    return output;
    }
    public static void showArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static void sort_array(int[] array){
        Arrays.sort(array);
        showArray(array);
    }
}
