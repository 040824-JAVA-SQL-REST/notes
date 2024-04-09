package com.revature.demo;

public class ControlFlow {
    public void start() {
        // Data types
        // Primitive data types (8 total prim data types)
        short a = 32767;
        byte b = 1;
        int c = 10;
        long d = 1L;
        boolean e = true; // or false
        double f = 1.0;
        float g = 2.00f;
        char h = 'a';

        // Objects
        String str = "123";

        // Control flows
        // if
        // if else
        // switch case
        // all loops -> for, while, do wihle
        Human me = new Human("Bao", 20, 3.2, 260.0, false, false);

        // If I am attractive then I have a gf
        // else no :(
        if (me.isAttractive() == true) {
            me.setHasGf(true);
        } else {
            me.setHasGf(false);
        }

        System.out.println(me.toString());

        // while (condition) to keep looping
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