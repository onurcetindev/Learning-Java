package Chapter5.example;

import java.util.Scanner;


public class NewAtm {
    public static void main(String[] args) {

        ATM atm = new ATM();

        System.out.println("Programdan çıkılıyor ... ");

        Account account = new Account("Onur","123",1000);
        atm.calis(account);

    }


}

//********************************************************************
class ATM{

    public void calis(Account account){
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza hoşgeldiniz ...");
        System.out.println("******************");
        System.out.println("Kullanıcı girişi  ");
        System.out.println("******************");

        int giris_hakki = 3;
        while (true){
            if (login.login(account)){
                System.out.println("Giriş başarılı ");
                break;
            }else{
                System.out.println("Giriş başarısız");
                giris_hakki -- ;
                System.out.println("Kalan giriş hakkı : " + giris_hakki);
            }if (giris_hakki == 0){
                System.out.println("Giriş hakkınız bitmiştir. ");
                return;
            }
        }
        System.out.println("******************");
        String islemler = "1- Bakiye görüntüle \n"+
                          "2- Para Çekme \n" +
                          "3- Para Yatırma \n" +
                          "q- Çıkış";
        System.out.println(islemler);
        System.out.println("******************");

        while (true){
            System.out.println("İşlem seçiniz: ");
            String işlem = scanner.nextLine();

            if (işlem.equals("q")){
                break;
            }else if (işlem.equals("1")){
                System.out.println("Bakyieniz : "+ account.getBakiye());
            }else if (işlem.equals("2")){
                System.out.println("Yatırmak istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                account.paraYatir(tutar);

            }else if (işlem.equals("3")){
                System.out.println("Çekmek istediğiniz tutar : ");
                int nakit = scanner.nextInt();
                scanner.nextLine();
                account.paraCek(nakit);
            }
            else {
                System.out.println("Geçersiz işlem ");
            }


        }

    }

}


//********************************************************************

class Account{
    private String userName;
    private  String password;
    private double bakiye;

    public Account(String userName, String password, double bakiye) {
        this.userName = userName;
        this.password = password;
        this.bakiye = bakiye;
    }
    public void  paraYatir(int miktar){
        bakiye += miktar;
        System.out.println("Güncel bakiyeniz : " + bakiye);
    }
    public void paraCek(int nakit){
        if (nakit > bakiye){
            System.out.println("Yetersiz bakiye. Bakiyeniz : " + bakiye);
        }else{
            bakiye -= nakit;
            System.out.println("Güncel bakiyeniz : " + bakiye);
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
}


//********************************************************************
class   Login{
    public boolean login(Account account){
        Scanner scanner = new Scanner(System.in);
        String userName;
        String password;

        System.out.println("Enter your username : ");
        String name = scanner.nextLine();
        System.out.println("Enter your password: ");
        String pass = scanner.nextLine();


        if (account.getUserName().equals(name) && account.getPassword().equals(pass)){
            System.out.println("Kullanıcı girişi başarılı. Merhaba : " + name);
            return true;
        }else{
            return false;
        }
    }

}
