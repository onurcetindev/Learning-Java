package Chapter6;

public class Encapsulation {
    public static void main(String[] args) {
        Subscriber subscriber = new Subscriber();
        subscriber.name = "Onur Çetin"; // Encapsulationsuz hayat
        subscriber.balance = 200;      //Her veriye elimle ulaabiliyorum saçma değer girilebilir
        subscriber.city = "Ankara";     // Herhangi bir veri girilmeden atlanabilir , unutulmuş olabilir
        subscriber.usage(100);     // Herhangi bir değişiklik olduğunda elimizle her yeri değiştirmemiz gerek

        SubscriberWithEncapsulation subscriberWithEncapsulation = new SubscriberWithEncapsulation("Onur",200,"Ankara");

        subscriberWithEncapsulation.usage(100);

    }




}
class Subscriber{
    public String name;
    public int balance ;
    public String city;

    public void usage(int amount){
        if (this.balance < amount){
            System.out.println("Not enough balance");
        }else{
            this.balance -= amount;
            if (balance <= 0){
                System.out.println("You have reached the maximum balance");
            }else {
                System.out.println("New balance: " + this.balance);
            }
        }

    }
    public void showBalance(){
        System.out.println("Balance: " + this.balance);
    }

}

// ----------- WITH ENCAPSULATION---------------

class SubscriberWithEncapsulation{
    private String name;
    private int balance;
    private String city;

    public SubscriberWithEncapsulation(String name, int balance, String city) {
        this.name = name;
        this.balance = balance;
        this.city = city;
    }
    public void usage(int amount){
        if (this.balance < amount){
            System.out.println("Not enough balance");
        }else{
            this.balance -= amount;
            if (balance <= 0){
                System.out.println("You have reached the maximum balance");
            }else {
                System.out.println("New balance: " + this.balance);
            }
        }

    }
    public void showBalance(){
        System.out.println("Balance: " + this.balance);
    }
}
