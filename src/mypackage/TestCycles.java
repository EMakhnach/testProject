package mypackage;

import java.util.Iterator;

public class TestCycles {
    public static void main(String[] args) {

        System.out.println("Start program");
        for (int i = 0; i < 10; i++) {
            System.out.println(i * 10);
        }
        System.out.println("End program");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }


        int[] array = new int[10];
        System.out.println();
        for (int i = 0; i < 10; i++) {
            array[i] = i * 2;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Element with index" + i + " is:" + array[i]);
        }

        System.out.println();
        int i = 0;
        while (i < 10) {
            System.out.println("While: " + i);
            i++;
        }

        System.out.println();
        int j = 0;
        boolean bool = true;
        while (bool) {
        System.out.println("While: " + j);
        j++;
        if (j == 5) bool = false;
    }


        System.out.println();
        i = 0;
        do {
            System.out.println("Do: " + i);
            i++;
        } while (i < 5);


    }
}
