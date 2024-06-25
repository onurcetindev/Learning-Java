package Chapter4;

public class Overloading {
    public static void main(String[] args) {
        add(3,2,1);
        add(3,6);
        add("Onur","Çetin");

    }
    public static void add(int a, int b, int c){
        System.out.println("Result : " + (a+b+c));
    }
    public static void add(int a,int b){
        System.out.println("Result : " + (a + b));
    }
    public static void add(String a, String b){
        System.out.println("Result : " + a + " " + b);
    }
}
