package Chapter7;

public class Arrays {
    public static void main(String[] args) {


       int [] a = new int [5];
       // int [] a = {1,2,3,4,5};
       // System.out.println(a[0]); // = 1
        // sout(a[5]);   // Hata verir max 4 ( 0 1 2 3 4 )

       // double [] b ;
        for (int i = 0; i < a.length; i++) {
            a[i] = i*2 + 5;
            System.out.println(a[i]);
        }
        System.out.println("*******************");
        int [] b = {10,20,30,40,50,60,70,80,90,100};
        System.out.println(b.length);

        showArray(b);
        System.out.println("***************");
        findAverage(b);

    }
    public static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void findAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int avg = sum / array.length;
        System.out.println(avg);
    }
}
