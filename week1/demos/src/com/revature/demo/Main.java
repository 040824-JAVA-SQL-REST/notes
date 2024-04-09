// specify the package (aka location the file)
package com.revature.demo;

// specify the class blueprint
// access modifier + class + variable_name
// default, public, private, protected
// Always use public for classes
public class Main {
    // We can now declare attributes here

    // We can now declare behaviors here
    // access modifier + (optional special key) + data type + variable_name + ()
    // Purpose of Main is to start our application (DO NOT USE THIS METHOD TO
    // IMPLEMENT CODE FUNCTIONALITIES)
    public static void main(String[] args) {
        // Instantiating class -> object
        // Class data type + variable_name = new keyword class datatype + ()
        // Dog dog1 = new Dog("pitbull", 4, "red", "M"); // this is an empty dog
        // Dog dog2 = new Dog("pitbull", 4, "red", "M"); // this is a dog object with

        // predefined attributes

        // Using a setter to set the dog's breed
        // dog1.setBreed("German shepperd");

        // System.out.println("Dog 1: " + dog1.toString());
        // System.out.println("Dog 2: " + dog2.toString());

        // printing out dog static method example
        // System.out.println(Dog.bark());

        // System.out.println(dog1.equals(dog2));
        // System.out.println(dog1.toString());

        ControlFlow cf = new ControlFlow();
        cf.start();
    }
}