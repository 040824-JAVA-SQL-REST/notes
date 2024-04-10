package com.revature.demo3;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public void startDemo() {
        // Wrapper classes
        // allows you to convert prim -> obj
        // There are 8
        Byte bytez = 123;
        Short shortz = 123;
        Integer integer = 1;
        Long longz = 1L;
        Boolean booleanz = true;
        Character charz = '1';
        Float floatz = 1.0f;
        Double doublez = 1.0;

        // This is true
        boolean isLetter = charz.isLetter('a');

        // Arrays
        // Basket to hold a single datatype of values
        // datatype + [] + variable_name = size (new array datatype [ insert_number ])
        // or insert predefined values {}
        // fixed size
        int[] nums = new int[10];
        int[] pre_num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // What if we want to make it mutable?
        // use a List<T>
        List<Integer> listz = new ArrayList<>();
    }

    /* ########## Helper Methods ########## */
    // Can only be access from this class
    private void helperMethod() {
    }
}
