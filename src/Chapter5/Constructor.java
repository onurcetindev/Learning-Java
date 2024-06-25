package Chapter5;

public class Constructor {
    public static void main(String[] args) {

       // Account account1 = new Account();
        Account account2 = new Account("1313",22000,"Onur Çetin","onu@","05012021");
        account2.paraYatir(200);
        account2.paraCek(200);
    }
}
