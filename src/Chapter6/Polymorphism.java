package Chapter6;

public class Polymorphism {
    public static void main(String[] args) {

        Animal animal = new Cat("Cabbar");
        System.out.println(animal.speak());

        Animal animal1 = new Animal("Fero");
        System.out.println(animal1.speak());

        Animal animal2 = new Dog("Karabaş");
        System.out.println(animal2.speak());

        Animal animal3 = new Bird("Paşa");
        System.out.println(animal3.speak());

    }
}
class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  String speak(){
        return "Animal is speaking...";
    }
}
class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }
    @Override
    public String speak() {
        return this.getName()+" is miyavvvv...";
    }
}
class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }
    @Override
    public String speak() {
        return this.getName()+" is havvvvv...";
    }
}
class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }
    @Override
    public String speak() {
        return this.getName()+" is cikkkkk...";

    }
}

