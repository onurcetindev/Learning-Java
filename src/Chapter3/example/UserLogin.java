package Chapter3.example;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int girisHakkı = 3 ;

        String userName = "Onur";
        String password = "123";

       while (true){
           System.out.println("Kullanıcı adını giriniz : ");
           String name = scanner.nextLine();
           System.out.println("Şifre giriniz : ");
           String sifre = scanner.nextLine();

           if (userName.equals(name) && password.equals(sifre)){
               System.out.println("Hoşgeldiniz : " + userName);
               break;
           }else {
               System.out.println("Kullancıı adı veya şifreniz hatalı.");
               girisHakkı -= 1;
               System.out.println("Giriş hakkı : " + girisHakkı);
           }
           if (girisHakkı == 0){
               System.out.println("Giriş hakkı bitmiştir.");
               break;
           }
       }



    }
}
