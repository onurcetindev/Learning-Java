package Chapter3;

public class BreakandContinue {
    public static void main(String[] args) {

        /*  break anahtar kelimesi

           Döngü herhangi bir yerde ve herhangi bir zamanda break ifadesiyle karşılaştığı zaman çalışmasını durdurur.
           Böylelikle döngü hiçbir koşula bağlı kalmadan sonlanmış olur.

           break ifadesi sadece içinde bulunduğu döngüyü sonlandırır.Eğer iç içe döngüler varsa ve içteki döngüde break
           kullanılmışsa sadece içteki döngü sona erer .

           continue anahtar kelimesi

           Döngü herhangi bir yerde ve herhangi bir zamanda continue ifadesiyle karşılaştığı zaman geri kalan işlemlerini
           yapmadan direkt döngü bloğunun başına döner.


         */

        int i = 0;
        while (i < 20){
            if (i == 10){
                break;    // 10 olduğu zaman durduracak ve devam etmeyecek.
            }
            System.out.println("i = " + i);
            i++;
        }

        for(int a = 0; a < 10 ; a++){
            if (a == 3 || a ==5){
                continue;             // 3 ve 5i atlayarak yazacak
            }
            System.out.println("a = " + a );

        }
    }
}
