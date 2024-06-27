package Chapter5.example;

import Chapter1.ScannerObject;

import java.util.Scanner;

public class Employees {
    //Çalışan üst sınıf
    //Türeyen yazılımcı sınıfı
    //Türeyen yönetici sınıfı

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Employees Program \n");
        String operations = "1- Software Employees Operations \n"+
                            "2- Manager Employees Operations \n"+
                            "3- Press q to exit";
        System.out.println("*****************");
        System.out.println(operations);
        System.out.println("*****************");
        while (true){
            System.out.println("Choose an operation");
            String operation = scanner.nextLine();

            if (operation.equals("q")){
                System.out.println("Thank you for using our program");
                break;
            }else if (operation.equals("1")){
                SofwareEmployee sofwareEmployee = new SofwareEmployee("Onur ",2,"Çetin","Java,Kotlin,C");
                String softwareOperations = "Choose a software employee operation \n"
                                            +"1- Format \n"+
                                            "2- Show Info \n"+
                                            "3- Press q to exit";
                System.out.println(softwareOperations);
                while (true){
                    System.out.println("Choose an operation");
                    String softwareOp = scanner.nextLine();
                    if (softwareOp.equals("q")){
                        System.out.println("Thank you for using our program");
                        break;
                    }else if (softwareOp.equals("1")){
                        System.out.println("Operating System : " );
                        String OS = scanner.nextLine();

                        sofwareEmployee.format(OS);
                    }else if (softwareOp.equals("2")){
                        sofwareEmployee.showInfo();
                    }else {
                        System.out.println("Invalid operation");
                    }


                }
            } else if (operation.equals("2")) {
                ManagerEmployee managerEmployee = new ManagerEmployee("Ümit",1,"Uluşar",300);
                String managerOperations = "1- Raise Operation \n" +
                                            "2- Show Info \n" +
                                            "3- Press q to exit";
                System.out.println(managerOperations);
                while (true){
                    System.out.println("Choose an manager operation");
                    String managerOp = scanner.nextLine();

                    if (managerOp.equals("q")){
                        System.out.println("Thank you for using our program");
                        break;

                    }else if (managerOp.equals("1")) {
                        System.out.println("Enter your raise price ");
                        int price = scanner.nextInt();
                        scanner.nextLine();
                        managerEmployee.raise(price);

                    }else if (managerOp.equals("2")) {
                        managerEmployee.showInfo();
                    }else{
                        System.out.println("Invalid operation");
                    }
                }

            }else {
                System.out.println("Invalid choice");
            }
        }


    }


}
class Employee {
    private String name;
    private int id;
    private String surname;

    public Employee(String name, int id,String surname) {
        this.name = name;
        this.id = id;
        this.surname = surname;
    }
    public void showInfo(){
        System.out.println("Name: " + name + " Surname: " + surname + " ID: " + id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
//--------------------SOFTWARE EMPLOYEE------------------
class SofwareEmployee extends Employee {
    private String languages;
    public SofwareEmployee(String name, int id,String surname,String languages) {
        super(name,id,surname);
        this.languages = languages;
    }
    public void format(String operatingSystem){
        System.out.println(getName() + " " + operatingSystem + " downloading") ;
    }
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Software Engineer know that languages : " + languages);
    }
}

class ManagerEmployee extends Employee {
    private int number_of_responsible_persons;

    public ManagerEmployee(String name, int id, String surname, int number_of_responsible_persons) {
        super(name, id, surname);
        this.number_of_responsible_persons = number_of_responsible_persons;

    }
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Number of responsible persons: " + number_of_responsible_persons);
    }
    public void raise(int number){
        System.out.println("Amount of raise: " + number);
    }
}

