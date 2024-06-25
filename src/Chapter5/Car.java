package Chapter5;

public class Car {
    private String color;
    private int doors;
    private double engineCapacity;
    private String model;

    public void setModel(String model){
        this.model = model;
    }
    public  String getModel(){
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        if (doors < 0 ){
            System.out.println("Number of doors can not negative");
        }else{
            this.doors = doors;
        }

    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
