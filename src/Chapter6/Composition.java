package Chapter6;


public class Composition {
    public static void main(String[] args) {
        Resolution resolution = new Resolution(1920,1080);
        Monitor monitor = new Monitor("Lenovo","Japon","15.5",resolution);
        Case kasa = new Case("Asus","German","Metal");
        MotherBoard motherBoard = new MotherBoard("b250 pro","Asus",10,"Linux");

        Computer computer = new Computer(motherBoard,kasa,monitor);
        computer.getaCase().openPC();
        computer.getMonitor().offMonitor();
        computer.getMotherBoard().downloadOS("Mac OS X");
        //They are composition


    }

}
//------------------ COMPUTER -------------------
class Computer{
    private MotherBoard motherBoard;
    private Case aCase;
    private Monitor monitor;

    public Computer(MotherBoard motherBoard, Case aCase, Monitor monitor) {
        this.motherBoard = motherBoard;
        this.aCase = aCase;
        this.monitor = monitor;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public Case getaCase() {
        return aCase;
    }

    public void setaCase(Case aCase) {
        this.aCase = aCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}

// ------------------- MOTHER BOARD -----------------------

class MotherBoard{
    private String model;
    private String manufacturer;
    private int number_of_nest;
    private String OS;

    public MotherBoard(String model, String manufacturer, int number_of_nest, String OS) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.number_of_nest = number_of_nest;
        this.OS = OS;

    }
    public void downloadOS(String OS){
        this.OS=OS;
        System.out.println("New OS is : " + this.OS);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getNumber_of_nest() {
        return number_of_nest;
    }

    public void setNumber_of_nest(int number_of_nest) {
        this.number_of_nest = number_of_nest;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }
}

//-------------------- CASE ----------------------
class Case{
    private String model;
    private String manufacturer;
    private String  made;
    public Case(String model, String manufacturer, String made) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.made = made;
    }
    public void openPC(){
        System.out.println("PC turns on ... ");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }
}

//------------------------ RESOLUTION -----------------
class Resolution{
    private int width;
    private int height;

    public Resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

//------------- MONITOR ---------------
class  Monitor{
    private String model;
    private String manufacturer;
    private String size;
    private Resolution resolution;   // COMPOSITION *****************************************

    public Monitor(String model, String manufacturer, String size, Resolution resolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.resolution = resolution;
    }
    public void offMonitor(){
        System.out.println("Monitor turns off ...");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }
}
