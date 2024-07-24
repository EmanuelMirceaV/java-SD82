package Intro;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {

        int[] grades = {5,6,8,7,9,10};

        String[] progLangs = {"C", "C++", "Java", "Python", "JavaScript", "PHP"};

        String[] webServices = new String[3];
        webServices[0] = "XAMPP";
        webServices[1] = "Tomcat";
        webServices[2] = "Wildfly";

        // Print all elements of an Array

        for (String prog : progLangs) {
            System.out.println(prog);
        }

        // 1. Fill a new array with values
        int[] arr = new int[4];
        Arrays.fill(arr,55);

        for (int e : arr) {
            System.out.println(e + " ");
        }

        // 2. Copy from an existing array into a new array
        int[] newGrades = Arrays.copyOf(grades, grades.length);

        for (int i : newGrades) {
            System.out.println(i + " ");
        }

        // 3. Test if 2 arrays are equal
        System.out.println(Arrays.equals(grades, newGrades));
        System.out.println(Arrays.equals(progLangs, webServices));

        // 4. Sort the values in an array
        Arrays.sort(grades);

        for (int i : grades) {
            System.out.println(i + " ");
        }

        // 5. binarySearch - Returns the Index of an Element from an Array. It does not sort it, so it's better to do that first
        System.out.println(Arrays.binarySearch(grades,6));

        // 6. Remove element from an Array (with ArrayList and asList)
        ArrayList<String> aList = new ArrayList<>(Arrays.asList(webServices));
        aList.remove(1);
        System.out.println(aList);

    }

}
