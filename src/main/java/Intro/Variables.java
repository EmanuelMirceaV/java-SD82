package Intro;

public class Variables {

    static final int MAX_NR = 100;

    public static void main(String[] args) {

        /* Data Types

           1. Primitive
             - byte
             - short
             - int
             - long
             - float
             - double
             - char
             - boolean

           2. Non-Primitive or Reference
             - String
             - Arrays
             - Objects
             - Interfaces
             etc.

           3. Type Casting
        */

        // 1.
        byte b1 = 0;
        short s1;
        s1 = 10;
        int i3 = 999999999;
        int i4 = -500, i5 = 33;

        System.out.println(i3 + " " + s1+i4);
        System.out.println(s1 * i4);

        long l1 = 9999999999999L;
        float f1 = 2.5F;
        double d1 = 9999.44;

        System.out.println(f1);

        char c1 = 'A';

        boolean bl1 = true;

        boolean bl2 = (s1 == c1);
        System.out.println(bl1);
        System.out.println(bl2);

        // 2.

        String str1 = "This is a string";
        str1 = "This is the same string";
        System.out.println(str1.toUpperCase());

        // constant variable
        final int MAX_NR = 120;

        // MAX_NR = 101;
        System.out.println(MAX_NR);

        // 3.

        // Widening
        int myInt1 = 5;
        double myDouble1 = myInt1; // Automatic casting: int to double
        System.out.println(myInt1);
        System.out.println(myDouble1);

        // Narrowing
        double myDouble2 = 5.25;
        int myInt2 = (int) myDouble2;

        System.out.println(myDouble2);
        System.out.println(myInt2);


    }


}
