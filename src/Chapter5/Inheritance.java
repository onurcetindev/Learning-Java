package Chapter5;

import java.security.PublicKey;

public class Inheritance {
    public static void main(String[] args) {

        Manager manager = new Manager("Onur Çetin",30000,"IT Dev.",25);
        manager.changeDepartment("DevOps");
        manager.work();
        manager.zamYap(200);
        manager.showInfo();

    }
}

//---------------------EMPLOYEE-------------------
class Employee{
    private String name;
    private int salary;
    private String department;

    public Employee(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void work(){
        System.out.println("Employee working ");
    }
    public void showInfo(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);

    }
    public void changeDepartment(String newDepartment){
        System.out.println("Changing department ... ");
        this.department = newDepartment;
        System.out.println("Department changed to " + newDepartment);
    }
}

//---------------MANAGER-------------------------------
class Manager extends Employee{ // Subclass

    private int sorumluKisiSayisi;

    public Manager(String name, int salary, String department,int sorumluKisiSayisi) {
        super(name, salary, department);
        this.sorumluKisiSayisi = sorumluKisiSayisi;
    }
    public void zamYap(int zam){
        System.out.println("Çalışanlara zam yapıldı");
        System.out.println("Zam miktari : " +zam);
    }
    //OVERRIDE
    public void showInfo(){
        /*

        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Department: " + getDepartment());

        */
        super.showInfo();
        System.out.println("Sorumlu kişi sayisi : " + this.sorumluKisiSayisi);
    }

}
