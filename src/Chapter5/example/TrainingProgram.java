package Chapter5.example;

import Chapter1.ScannerObject;

import java.util.Scanner;

public class TrainingProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("İdman programına hoşgeldiniz ...");

        String idmanlar = " Geçerli hareketler \n" +
                            "1- Burpee \n"+
                            "2- Pushup \n" +
                            "3- Situp \n" +
                            "4- Squad ";
        System.out.printf(idmanlar);
        System.out.println("Bir idman oluşturunuz ");

        System.out.print("Burpee sayısı giriniz : ");
        int burpee = scanner.nextInt();
        System.out.print("Pushup sayısı giriniz : ");
        int pushup = scanner.nextInt();
        System.out.print("Situp sayısı giriniz : ");
        int situp = scanner.nextInt();
        System.out.print("Squad sayısı giriniz : ");
        int squad = scanner.nextInt();
        scanner.nextLine();

        Idman idman = new Idman(burpee, pushup, situp, squad);
        System.out.println("İdmanınınz başlıyor ..... ");

        while (idman.isFinish() == false){
            System.out.println(" Hareket türü :\n");
            String tur = scanner.nextLine();
            System.out.println(" Hareket sayısı :\n");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            idman.hareketYap(tur, sayi);


        }



    }


}

class Idman{
    private int burpee_number;
    private int pushup_number;
    private int situp_number;
    private int squad_number;

    public Idman(int burpere_number, int pushup_number, int situp_number, int squad_number) {
        this.burpee_number = burpere_number;
        this.pushup_number = pushup_number;
        this.situp_number = situp_number;
        this.squad_number = squad_number;
    }
    public void hareketYap(String hareketTuru,int number){
        if (hareketTuru.equals("Burpee")){
            burpeeYap(number);
        }else if (hareketTuru.equals("Pushup")){
            pushupYap(number);
        }else if (hareketTuru.equals("Situp")){
            situpYap(number);
        } else if (hareketTuru.equals("Squad")) {
            squadYap(number);
        }else{
            System.out.printf("Geçersiz hareket");
        }

    }

    public int getBurpere_number() {
        return burpee_number;
    }

    public void setBurpere_number(int burpere_number) {
        this.burpee_number = burpere_number;
    }

    public int getPushup_number() {
        return pushup_number;
    }

    public void setPushup_number(int pushup_number) {
        this.pushup_number = pushup_number;
    }

    public int getSitup_number() {
        return situp_number;
    }

    public void setSitup_number(int situp_number) {
        this.situp_number = situp_number;
    }

    public int getSquad_number() {
        return squad_number;
    }

    public void setSquad_number(int squad_number) {
        this.squad_number = squad_number;
    }
    public  void burpeeYap(int number){
        if (burpee_number == 0){
            System.out.printf("Yapacak burpee kalmadı");
        } else if (number > burpee_number) {
            System.out.printf("Hedelediğinden fazla burpee yaptın. Tebrikler.");
            burpee_number = 0;
            System.out.printf("Kalan burpee sayısı : " + burpee_number);
        }else{
            burpee_number -= number;
            System.out.printf("Kalan burpee sayısı : " + burpee_number);
        }
    }
    public  void pushupYap(int number){
        if (pushup_number == 0){
            System.out.printf("Yapacak pushup kalmadı");
        } else if (number > pushup_number) {
            System.out.printf("Hedelediğinden fazla pushup yaptın. Tebrikler.");
            pushup_number = 0;
            System.out.printf("Kalan pushup sayısı : " + pushup_number);
        }else{
            pushup_number -= number;
            System.out.printf("Kalan pushup sayısı : " + pushup_number);
        }
    }
    public  void situpYap(int number){
        if (situp_number == 0){
            System.out.printf("Yapacak situp kalmadı");
        } else if (number > situp_number) {
            System.out.printf("Hedelediğinden fazla situp yaptın. Tebrikler.");
            situp_number = 0;
            System.out.printf("Kalan situp sayısı : " + situp_number);
        }else{
            situp_number -= number;
            System.out.printf("Kalan situp sayısı : " + situp_number);
        }
    }
    public  void squadYap(int number){
        if (squad_number == 0){
            System.out.printf("Yapacak squad kalmadı");
        } else if (number > squad_number) {
            System.out.printf("Hedelediğinden fazla squad yaptın. Tebrikler.");
            squad_number = 0;
            System.out.printf("Kalan squad sayısı : " + squad_number);
        }else{
            squad_number -= number;
            System.out.printf("Kalan squad sayısı : " + squad_number);
        }
    }
    public boolean isFinish(){
        return (burpee_number == 0) &&(situp_number == 0) &&(squad_number == 0) && (pushup_number == 0);
    }
}
