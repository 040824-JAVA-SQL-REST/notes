package com.revature.demo3;

public class App {
    public static void main(String[] args) {
        // Saving it in memory
        // For resuability
        // Demo demo = new Demo();   //This creates an object that will be saved in memory when you use the startDemo() method.
        // demo.startDemo();

        // Anonymous function
        // This is cleaner / elegant
        new Demo().startDemo();  // This helps to avoid memory issues by only using startDemo() when you need it at the start rather than keeping it in memory
    }
}
