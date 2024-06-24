package Chapter3.example;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String operations = "1- Bakiye öğrenme\n"
                            +"2- Para çekme\n"
                            +"3- Para yatırma\n"
                            +"Çıkış : q";

        int bakiye = 250;

        while (true){
            System.out.println("Yapacağınız işlemi seçiniz : \n" +operations);
            String choose = scanner.nextLine();
            if (choose.equals("q")){
                System.out.println("Çıkış yapılıyor ...");
                break;
            }
            else if (choose.equals("1")){
                System.out.println("Bakiyeniz : " + bakiye);
            } else if (choose.equals("2")) {
                System.out.println("Çekmek istediğiniz miktarı giriniz : ");
                int çek = scanner.nextInt();
                scanner.nextLine();
                if (bakiye < çek){
                    System.out.println("Yetersiz bakiye. Bakiyeniz : " + bakiye);

                }else{
                    bakiye = bakiye - çek ;
                    System.out.println("Para çekildi. Yeni bakiyeniz : " +bakiye);
                }

            }else if (choose.equals("3")){
                System.out.println("Yatırmak istediğiniz tutarı giriniz : ");
                int yatir = scanner.nextInt();
                scanner.nextLine();

                bakiye = bakiye + yatir;
                System.out.println("Para yatırıldı. Yeni bakiyeniz : " + bakiye);
            }

        }





    }
}
