package Chapter3.example;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {

        //Tutar ve kaç yıl yatıracağını alacağız ve buna göre her sene sonu toplam tutarı yazdıracağız.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your total money : ");
        double money = scanner.nextDouble();
        System.out.println("Enter how many years to keep:  ");
        double year = scanner.nextDouble();

        double rate = 0.06;  //Faiz oranı yüzde 6

        double sumMoney = money;

        for (int i = 1; i<= year; i++){

            sumMoney = sumMoney + (sumMoney*rate);
            System.out.println(i+".year = " + sumMoney);
        }



    }
}
