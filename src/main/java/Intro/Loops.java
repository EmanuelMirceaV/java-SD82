package Intro;

public class Loops {

    public static void main(String[] args) {

        /* Loops:
            - For loop
            - While loops
            - Do While loops
            - For-Each loops
        */

        // 1. For Loop:
        for (int i = 0; i < 3; i++) {       // i is a counter or index
            System.out.println(i);          // i < 3 is a  condition
        }

        // Using Break:
        for (int i = 1; i < 10; i++) {
            System.out.println(i);

            if (i == 5) {
                break;
            }
        }

        // Using Continue:
        int n1 = 2;

        for (int i2 = 1; i2 <= 20; i2++) {
            if (i2 == n1) {
                n1 = n1 +2;
                continue;
            }
            System.out.println(i2);
        }

        // 2. While Loop:
        int wl = 0;

        while (wl < 5) {
            System.out.println(wl);
            wl++;
        }

        /*
        When to use a WHILE loop:
            - Use a while loop when you need to execute the loop body repeatedly until a condition is met.
            - Use a while loop when you need to check the condition before executing the loop body.
        */

        // 3. Do While Loop:
        int i = 5;

        do {
            System.out.println("Value of i is: " + i);
            i++;

        } while (i < 5);
        /*
        When to use a DO WHILE loop:
            - Use a do while loop when you need to execute the loop body at least once.
            - Use a do while loop when you need to check the condition after executing the loop body.
        */
        // The WHILE loop checks the condition before executing the loop body
        // The DO WHILE loop executes the loop body at least once before checking the condition

        // 4. For Each loop - For iterating through an Array:
        String [] progLang = {"C++", "Java", "Python"};

        for (int i2 = 0; i2 < progLang.length; i2++){
            System.out.println(progLang[i2]);
        }

        for (String prog : progLang) {
            System.out.println(prog);
        }

        // 5. Print a Multi-dimensional Array - Nested loop example
        char[][] matrix1 = {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'}
        };

        for (int i3 = 0; i3 < matrix1.length; i3++) {
            System.out.println(matrix1[i3][i3]);
        }

        for (int i4 = 0; i4 < matrix1.length; i4++) {
            //.out.println("Value of i4: " + i4);
            for (int j1 = 0; j1 < matrix1.length; j1++) {
                //System.out.println("Value of j1: " + j1);
                System.out.println(matrix1[i4][j1]);
            }
        }

    }

}
