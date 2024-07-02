package Chapter7.example;

import java.util.Scanner;

public class MemoryGame {
    private static Card [][] cards = new Card[4][4];

    public static void main(String[] args) {

        cards[0][0] = new Card('E');
        cards[0][1] = new Card('A');
        cards[0][2] = new Card('B');
        cards[0][3] = new Card('F');
        cards[1][0] = new Card('G');
        cards[1][1] = new Card('A');
        cards[1][2] = new Card('D');
        cards[1][3] = new Card('H');
        cards[2][0] = new Card('F');
        cards[2][1] = new Card('C');
        cards[2][2] = new Card('D');
        cards[2][3] = new Card('H');
        cards[3][0] = new Card('E');
        cards[3][1] = new Card('G');
        cards[3][2] = new Card('B');
        cards[3][3] = new Card('C');

        while (isFinish() == false){
            gameBoard();
            play();
        }


    }
    public static  boolean isFinish(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (cards[i][j].isPrediction() == false){
                    return false;
                }
            }
        }
        return true;
    }
    public static void gameBoard() {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (cards[i][j].isPrediction()) {
                    System.out.print(" | " + cards[i][j].getValue() + " | ");
                }else{
                    System.out.print(" |  | ");
                }
            }
            System.out.println("");
        }

    }
    public static void play(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("First prediction : please enter i and j values with one space ");
        int i1 = scanner.nextInt();
        int j1 = scanner.nextInt();

        cards[i1][j1].setPrediction(true);
        gameBoard();

        System.out.println("Second prediction : please enter i and j values with one space ");
        int i2 = scanner.nextInt();
        int j2 = scanner.nextInt();

        if (cards[i1][j1].getValue() == cards[i2][j2].getValue()){
                cards[i2][j2].setPrediction(true);
        }else{
            cards[i1][j1].setPrediction(false);
        }
    }
}

class Card{
    private char value;
    private boolean prediction = false;

    public Card(char value){
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public boolean isPrediction() {
        return prediction;
    }

    public void setPrediction(boolean prediction) {
        this.prediction = prediction;
    }
}
