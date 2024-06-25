package Chapter5;

public class OOPEntry {
    public static void main(String[] args) {


        /*
        Car mercedes = new Car();
        mercedes.color = "Black";
        mercedes.doors = 2;
        mercedes.engineCapacity = 1.6;
        mercedes.model = "Mercedes G ";

        System.out.println("My car is " + mercedes.model + ", engine capacity : " + mercedes.engineCapacity +
                ", number of doors is "+ mercedes.doors + ", and color : " + mercedes.color);

         */

        Car bmw = new Car();
        bmw.setColor("Black");
        bmw.setModel("BMW 3.16");
        bmw.setDoors(4);
        bmw.setEngineCapacity(1.8);

        System.out.println("Car information : " + bmw.getModel() + ", color :  " + bmw.getColor()
                + ", engine capactiy:  " + bmw.getEngineCapacity()+ ", number of doors:  " + bmw.getDoors());


    }

}

