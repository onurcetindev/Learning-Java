package Chapter3;

public class DoWhileLoops {
    public static void main(String[] args) {
        /*
        do {
            Koşul doğru olduğu sürece
             Whiledan farkı en az 1 kere çalışmasının garanti olması

        }while (koşul);
        */
        int i = 0;
        do {
            System.out.println("i = " + i);
            i++;
        }while (i<5);
    }
}
