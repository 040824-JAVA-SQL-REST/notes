package com.revature.demo;

public class Human {
    private String name;
    private int age;
    private double height;
    private double weight;
    private boolean isAttractive;
    private boolean hasGf;

    // Remember that clases need a default constructor!
    public Human() {
    }

    public Human(String name, int age, double height, double weight, boolean isAttractive, boolean hasGf) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.isAttractive = isAttractive;
        this.hasGf = hasGf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isAttractive() {
        return isAttractive;
    }

    public void setAttractive(boolean isAttractive) {
        this.isAttractive = isAttractive;
    }

    public boolean isHasGf() {
        return hasGf;
    }

    public void setHasGf(boolean hasGf) {
        this.hasGf = hasGf;
    }

    @Override
    public String toString() {
        return "Human [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + ", isAttractive="
                + isAttractive + ", hasGf=" + hasGf + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        long temp;
        temp = Double.doubleToLongBits(height);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(weight);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + (isAttractive ? 1231 : 1237);
        result = prime * result + (hasGf ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Human other = (Human) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (age != other.age)
            return false;
        if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
            return false;
        if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
            return false;
        if (isAttractive != other.isAttractive)
            return false;
        if (hasGf != other.hasGf)
            return false;
        return true;
    }

}