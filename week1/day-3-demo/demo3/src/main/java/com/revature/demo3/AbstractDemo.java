package com.revature.demo3;

//An abstract class can be used to create a blueprint for other classes
public abstract class AbstractDemo {
    protected String a; //The protected access modifier allows you to access these attributes within the same package only.
    protected int b;    //Subclasses can access protected attributes. Unlike the private access modifier which doesn't allow access to subclasses

    public void parentMethod() {  //This method is accessable by subclasses of the Abstract Demo class.
        System.out.println("I am inheriting this method");
    }

}
