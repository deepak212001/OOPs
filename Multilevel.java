// Parent class
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

// Grandchild class inheriting from Dog
class Labrador extends Dog {
    void display() {
        System.out.println("Labrador dog");
    }
}

public class Multilevel{
    public static void main(String[] args) {
        Labrador labrador = new Labrador();
        labrador.display(); // Accessing method from Labrador class
        labrador.bark();    // Accessing method from Dog class
        labrador.eat();     // Accessing method from Animal class
    }
}
