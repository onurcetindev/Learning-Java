package Chapter7.example;


import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class CityTourProgram {
    public static void main(String[] args) {

        LinkedList <String> sehirler = new LinkedList<String>();

        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.add("İzmir");

        sehirleri_turla(sehirler);


    }
    public static void islemleri_bastir(){

        System.out.println("0- İşlemleri görüntüle ...");
        System.out.println("1- Bir sonraki şehire git");
        System.out.println("2- Bir önceki şehire git");
        System.out.println("3- Uygulamadan çık");

    }
    public static void sehirleri_turla(LinkedList <String> sehirler) {
        ListIterator<String> iterator = sehirler.listIterator();
        int islem;
        islemleri_bastir();

        Scanner scanner = new Scanner(System.in);
        if (!iterator.hasNext()) {
            System.out.println("Herhangi bir şehir bulunmuyor.");
        }
        boolean cıkıs = false;

        while (!cıkıs){
            System.out.println("Bir işlem seciniz : ");
             islem = scanner.nextInt();

             switch (islem){
                 case 0:
                     islemleri_bastir();
                     break;
                 case 1 :
                     if(iterator.hasNext()){
                         System.out.println("Şehre gidiliyor " + iterator.next());
                     }else {
                         System.out.println("Gidilecek şehir kalmadı");
                     }
                     break;

                 case 2 :
                     if (iterator.hasPrevious()){
                         System.out.println("Şehre gidiliyor " + iterator.previous());
                     }else {
                         System.out.println("Şehir Turu başladı");
                     }
                     break;

                 case 3 :
                     cıkıs = true;
                     System.out.println("Uygulamadan çıkış yapılıyor.");
                     break;

             }
        }
    }
}
