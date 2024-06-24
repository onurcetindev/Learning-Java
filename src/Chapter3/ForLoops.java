package Chapter3;

public class ForLoops {
    public static void main(String[] args) {

        for(int i = 0; i < 10 ; i++){
            System.out.println("i = "+i);
        }
        System.out.println("***************************");
        int i = 0;
        int j = 10;
        for (; i<10 && j>0; i++,j--){
            System.out.println("i = " +i);
            System.out.println("j = " +j);

        }
        System.out.println("***************************");
        for (int a = 2; a < 100; a = a*2){
            System.out.println(a);
        }

    }
}
