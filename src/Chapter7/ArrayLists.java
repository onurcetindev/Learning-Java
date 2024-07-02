package Chapter7;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {

       ArrayList <String> arrayList = new ArrayList <>();
       arrayList.add("Onur");
       arrayList.add("bedo");
       arrayList.add("serhan");
       arrayList.add("musa");

        System.out.println(arrayList);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.size());

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        arrayList.remove(2);
        System.out.println();
        System.out.println(arrayList);
        System.out.println(arrayList.indexOf("Onur"));// İndexini öğrenme, Birden fazla yerde olsa da ilk gördüğünde duruyor
        System.out.println(arrayList.lastIndexOf("bedo"));   // birden fazla olsaydı en sondakinin indexini döndrecekti
        // Eğer o değer yoksa -1 döner

        arrayList.set(2,"musa");
        System.out.println(arrayList);
        arrayList.add(3,"serhan");
        System.out.println(arrayList);

    }
}
