package Chapter4;

public class Methods {
    public static void main(String[] args) {
        hello();
        factorial(5);
        tanıtma("Onur");
        addition(4,2);

    }
    public static void hello(){
        System.out.println("Hello world");
    }
    public static void factorial(int number){
        int factorial = 1;
        for (int i = 1; i<= number; i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }
    public static void tanıtma(String name){
        System.out.println("Selam ben " + name);
    }
    public static void  addition(int num1,int num2){
        System.out.println("Toplama işlemi sonucu : "+ (num1+num2));
    }
}
