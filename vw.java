// Base Class (Superclass)
class Animal {
    // Encapsulation: private field
    private String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Getter method
    public String getName() {
        return name;
    }

    // Abstract method - Polymorphism (method overriding)
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived Class (Subclass)
class Dog extends Animal {
    // Constructor calling parent class constructor
    public Dog(String name) {
        super(name);
    }

    // Overriding the sound method (Polymorphism)
    @Override
    public void sound() {
        System.out.println(getName() + " barks");
    }
}

// Another Derived Class (Subclass)
class Cat extends Animal {
    // Constructor calling parent class constructor
    public Cat(String name) {
        super(name);
    }

    // Overriding the sound method (Polymorphism)
    @Override
    public void sound() {
        System.out.println(getName() + " meows");
    }
}

public class OOPConcepts {
    public static void main(String[] args) {
        // Creating objects (Instances of Dog and Cat classes)
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");

        // Accessing methods
        dog.sound();  // Polymorphism: Dog class overridden method
        cat.sound();  // Polymorphism: Cat class overrid
