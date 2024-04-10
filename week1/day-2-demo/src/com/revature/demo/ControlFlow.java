package com.revature.demo;

public class ControlFlow {
    public void start() {
        // Data types
        // Primitive data types (8 total prim data types)
        // Primitive data types do not have additional methods/functionality
        short a = 32767;
        byte b = 1;
        int c = 10;
        long d = 1L; // the L tells the compiler the number is a long
        boolean e = true; // or false
        double f = 1.0; // all doubles and floats should include a decimal, even if it is .0
        float g = 2.00f; // the f tells the compiler the number is a float
        char h = 'a'; // note how the char uses the single quote symbol

        // Objects, such as Strings, have additional methods and functionality
        // compared to primative data types
        String str = "123";

        // Control flows:
        // if
        // if else
        // switch case
        // all loops -> for, while, do while
        Human me = new Human("Bao", 20, 3.2, 260.0, false, false);

        // If I am attractive, then I have a gf
        // else no :(
        if (me.isAttractive() == true) {
            me.setHasGf(true);
        } else {
            me.setHasGf(false);
        }

        System.out.println(me.toString());

        // while (condition) to keep looping until the condition is false
        int count = 0;
        while (me.isAttractive() == false) {
            System.out.println("I want a to be attractive");

            if (count == 4) {
                me.setAttractive(true);
            }

            count++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("hi");
        }
    }
}