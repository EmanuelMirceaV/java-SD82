package Intro;


import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        int[] grades = {5,6,8,7,9,10};
        System.out.println(Arrays.toString(grades));

        String[] progLangs = {"C", "C++", "Java", "Python", "JavaScript", "PHP"};
        progLangs[4] = "SQL";
        System.out.println(progLangs[4]);

        String[] webServices = new String[4];
        webServices[0] = "XAMPP";
        webServices[1] = "Tomcat";
        webServices[2] = "Wildfly";
        webServices[3]= "etc";

        int l1 = webServices.length;
        System.out.println(l1);

        // Multi-dimensional Arrays:
        char[][] mult1 = {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'}
        };

        System.out.println(mult1[0][1]);
        System.out.println(Arrays.toString(mult1));

    }


}
