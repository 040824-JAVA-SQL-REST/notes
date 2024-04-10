// specify the package (aka location the file)
package com.revature.demo;

// Purpose: specify the class blueprint
// a class blueprint looks like: access modifier + class + variable_name
// (Note) access modifer can be default, public, private, or protected
// (Note) Always use public for classes!!
public class Main {
    // We can now declare attributes here

    // We can now declare behaviors here
    // a behavior looks like: 
    //   access modifier + (optional special key) + data type + variable_name + ()
    // (Note) static is an example of a special key
    // Purpose of Main is to start our application 
    // (Note)(DO NOT USE THIS METHOD TO IMPLEMENT CODE FUNCTIONALITIES)
    public static void main(String[] args) {
        // Instantiating class -> object
        // Class data type + variable_name = new keyword class datatype + ()
        ControlFlow cf = new ControlFlow();
        cf.start();

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

    }
}