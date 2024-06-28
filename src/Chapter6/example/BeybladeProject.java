package Chapter6.example;



import java.util.Scanner;

public class BeybladeProject {
    public static void main(String[] args) {
        System.out.println("BeybladeProject......");

        System.out.println("Çıkış için q'ya basınız");
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Hangi beybladi üretmek istiyorsunuz: ");
            String  islem  = scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor ....");
                break;
            }else{
                Fabrika fab = new Fabrika();
                Beyblade beyblade = fab.üret(islem);   // POLYMORPHISM
                if (beyblade == null){
                    System.out.println("Geçerli bir beyblade ismi giriniz");
                }else{
                    beyblade.showInfo();
                    beyblade.attack();
                    beyblade.kutsalCanavarıOrtayaCikar();

                }
            }

        }



    }
}

//-----------------BEYBLADE ---------------
class Beyblade{
    private String manufacturer;
    private int speed;
    private int attackPower;

    public Beyblade(String manufacturer, int speed, int attackPower) {
        this.manufacturer = manufacturer;
        this.speed = speed;
        this.attackPower = attackPower;
    }
    public void attack(){
        System.out.println(getManufacturer() + " " + +attackPower + "and " + speed + "km/h with attacking");

    }
    public void showInfo(){
        System.out.println("Attack power is : " + attackPower);
        System.out.println("Manufacturer is : " + getManufacturer());
        System.out.println("Speed is : " + getSpeed());

    }
    public  void kutsalCanavarıOrtayaCikar(){
        System.out.println("This beyblade not have monster");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
}

//------------------------------------------------

class  Dranza extends Beyblade{
    private String kutsalCanavar;

    public Dranza(String manufacturer, int speed, int attackPower,String kutsalCanavar) {
        super(manufacturer, speed, attackPower);
        this.kutsalCanavar = kutsalCanavar;
    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Kutsal canavar : " + kutsalCanavar);
    }
    @Override
    public  void kutsalCanavarıOrtayaCikar(){
        System.out.println(getManufacturer()+ " " + kutsalCanavar + " ı ortaya çıkarıyor");
        System.out.println(getManufacturer() + " saldırısı  : Alev Kılıcı ");
    }
}
//------------------------------------------------
class Drayga extends Beyblade{
    private String kutsalCanavar;

    public Drayga(String manufacturer, int speed, int attackPower,String kutsalCanavar) {
        super(manufacturer, speed, attackPower);
        this.kutsalCanavar = kutsalCanavar;
    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Kutsal canavar : " + kutsalCanavar);
    }
    public  void kutsalCanavarıOrtayaCikar(){
        System.out.println(getManufacturer()+ " " + kutsalCanavar + " ı ortaya çıkarıyor");
        System.out.println(getManufacturer() + " saldırısı  : Kaplan Pençesi ");
    }

}
//----------------------------------------------------------
class Draciel extends Beyblade{
    private String kutsalCanavar;

    public Draciel(String manufacturer, int speed, int attackPower,String kutsalCanavar) {
        super(manufacturer, speed, attackPower);
        this.kutsalCanavar = kutsalCanavar;
    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Kutsal canavar : " + kutsalCanavar);
    }
    public  void kutsalCanavarıOrtayaCikar(){
        System.out.println(getManufacturer()+ " " + kutsalCanavar + " ı ortaya çıkarıyor");
        System.out.println(getManufacturer() + " saldırısı  : Kaplan Pençesi ");
    }
}

//----------------------------------------------------------
class Dragon extends Beyblade{
    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String manufacturer, int speed, int attackPower,String kutsalCanavar,String gizliYetenek) {
        super(manufacturer, speed, attackPower);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Kutsal canavar : " + kutsalCanavar);
        System.out.println("Gizli Yetenek : " + gizliYetenek);
    }
    public  void kutsalCanavarıOrtayaCikar(){
        System.out.println(getManufacturer()+ " " + kutsalCanavar + " ı ortaya çıkarıyor");
        System.out.println(getManufacturer() + " saldırısı  : Hayalet Kasırga ");
    }

}
//----------------------------------------------------------

class Fabrika{

    public Beyblade üret(String tür){
        if (tür.equals("Dragon")){
            return new Dragon("Takao",800,300,"Mavi ejderha","Konuşma");
        }else if (tür.equals("Dranza")){
            return new Dranza("Babo",500,120,"WOW");
        } else if (tür.equals("Draciel")) {
            return new Draciel("Kamo",200,200,"YAAA");
        } else if (tür.equals("Drayga")) {
            return new Drayga("Cano",900,140,"Ben fero");

        }else {
            return null;
        }
    }
}
