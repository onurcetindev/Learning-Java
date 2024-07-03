package Chapter7;

import Chapter1.ScannerObject;

public class StringClass {
    public static void main(String[] args) {

        String a = "Onur";
        String b = new String("Onur");
        System.out.println("Harf sayısı : " +b.length());
        System.out.println("İlk harfiiz : " + b.charAt(0));

        for (int i = 0; i < b.length(); i++) {
            System.out.print(b.charAt(i) + " ");
        }
        System.out.println();
        System.out.println(b.startsWith("On")); // Bunla başlıyor mu kontrolü
        System.out.println(b.endsWith("ur"));  // Bunla bitiyor mu kontrolü
        System.out.println(b.indexOf("u"));
        System.out.println(b.lastIndexOf("u"));
        System.out.println(b.toLowerCase());
        System.out.println(b.toUpperCase());


        String num = "2001";
        int x = Integer.parseInt(num);  // STRING TO INT
        System.out.println(x);

        int y = 1903;
        String z = String.valueOf(y);   // INT TO STRING
        System.out.println(z);

        String alfa = new String("Serhan");
        String sigma = new String("Serhan");

        if (alfa.equals(sigma)){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
    }
}
