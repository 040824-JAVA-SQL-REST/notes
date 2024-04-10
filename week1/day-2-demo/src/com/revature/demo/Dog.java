package com.revature.demo;

public class Dog extends Object {
    // Fields are by default private!
    private String breed;
    private int age;
    private String color;
    private String size;

    // Every class needs a default constructor!!!!
    public Dog() {
    }

    // This is overloading aka polymorphism
    // This is a setter constructor
    public Dog(String breed, int age, String color, String size) {
        this.breed = breed;
        this.age = age;
        this.color = color;
        this.size = size;
    }

    // Getters and setters because our fields are private
    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    // Static methods can be called from the class without the need of an instantiated object
    public static String bark() {
        return "WOOF!";
    }

    // Overriding the toString() method allows us to print the object as a String
    @Override
    public String toString() {
        return "Dog [breed=" + breed + ", age=" + age + ", color=" + color + ", size=" + size + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((breed == null) ? 0 : breed.hashCode());
        result = prime * result + age;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((size == null) ? 0 : size.hashCode());
        return result;
    }

    // Overriding the equals() and hashCode() methods allows us to compare objects
    // of the same class
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dog other = (Dog) obj;
        if (breed == null) {
            if (other.breed != null)
                return false;
        } else if (!breed.equals(other.breed))
            return false;
        if (age != other.age)
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (size == null) {
            if (other.size != null)
                return false;
        } else if (!size.equals(other.size))
            return false;
        return true;
    }

}