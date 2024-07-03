package Chapter7;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<String> gidilecek_yerler = new LinkedList<String>();
        gidilecek_yerler.add("Postane");
        gidilecek_yerler.add("Market");
        gidilecek_yerler.add("Okul");
        gidilecek_yerler.add("Kütüphane");
        gidilecek_yerler.add("Ev");

        showList(gidilecek_yerler);
        System.out.println("**************************");
        gidilecek_yerler.add(4,"AVM");
        showList(gidilecek_yerler);


    }
    public static void showList(LinkedList<String> gidilecek_yerler) {
        //for (String s : gidilecek_yerler) {
       //     System.out.println(s);
       // }

        // Iterator LinkedList üzerinde gezinmemizi sağlar
        ListIterator<String> iterator = gidilecek_yerler.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public static void sıraliEkle(LinkedList<String> gidilecek_yerler,String yeni){
        ListIterator<String> iterator = gidilecek_yerler.listIterator();
        while (iterator.hasNext()){
            int karsilastir = iterator.next().compareTo(yeni);

            if (karsilastir == 0){
                System.out.println("Listede bu eleman var ");
                return;
            }else if (karsilastir < 0){
                //yeni değer iterator.nextden daha büyük

            }else {
                iterator.previous();
                iterator.add(yeni);
                return;
            }

        }
        iterator.add(yeni);


    }
}
