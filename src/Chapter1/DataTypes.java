package Chapter1;

public class DataTypes {
    public static void main(String[] args) {

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println("--------------");

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println("--------------");

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println("--------------");
        //byte --> short --> int --> long

        short i =100;
        int j = 2 ;
        byte k = 5;
        long w = i+j+k;
        System.out.println(w);

        System.out.println("--------------");

        // Oto convert  int --> float --> double
        double x = 2.3;
        double y = 2.1;
        double z = x+y;
        System.out.println(z);

        System.out.println("--------------");
        System.out.println("Int - Float - Double Difference");
        int num1 = 22 / 7 ;
        float num2 = 22f / 7f ;
        double num3 = 22d / 7d ;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        System.out.println("--------------");
        double q = 3.42;
        float a  = (float) q;
        System.out.println(a);

        System.out.println("--------------");
        // Char and Boolean Data Types
        char o = 'a';
        boolean n = true;

        System.out.println("--------------");
        // String Data Types
        String name = "Onur ";
        String lastName = " Çetin";
        System.out.println("Hello my name is : "+(name+lastName));
    }
}
