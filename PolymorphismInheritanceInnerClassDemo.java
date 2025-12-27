/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polymorphisminheritanceinnerclassdemo;

/**
 *
 * @author Admin
 */
// Base class (Superclass)
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class (Subclass) using Inheritance
class Dog extends Animal {
    // Overriding the sound method (Polymorphism)
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    // Inner class
    class Puppy {
        void display() {
            System.out.println("This is a puppy from the Dog class");
        }
    }
}

// Main class to demonstrate functionality
public class PolymorphismInheritanceInnerClassDemo {
    public static void main(String[] args) {
        // Polymorphism: reference of superclass, object of subclass
        Animal myAnimal = new Dog();
        myAnimal.sound();  // Dog's overridden method will be called

        // Inheritance: Creating a Dog object
        Dog myDog = new Dog();
        myDog.sound();  // Calls Dog's sound()

        // Inner Class: Creating object of inner class
        Dog.Puppy myPuppy = myDog.new Puppy();
        myPuppy.display();  // Calls inner class method
    }
}
