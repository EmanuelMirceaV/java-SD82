package Intro;

import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {

        // If Else statement:
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter your age");

        int age = scan1.nextInt();

        if(age >= 18) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

        // Else If statements:
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Please enter your username");

        // User must be at least 6 characters long, and not more than 10
        String user = scan2.next();
        int nr = user.length();

        if(nr >= 0 && nr <= 5){
            System.out.println("Your username is too short");
        } else if (nr >= 6 && nr <= 10) {
            System.out.println("Welcome back " + user);
        } else{
            System.out.println("Your username is too long");
        }

        // Switch case
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Enter the number of the module from the list, for more info:");

        System.out.println("Module 1: Agile \n" +
                "Module 2: Version Control \n" +
                "Module 3: Java \n" +
                "Module 4: Data Visualisation \n" +
                "Module 5: Python \n" +
                "Module 6: Testing \n" +
                "Module 7: API"
        );

        int Module = scan3.nextInt();

        switch (Module) {
            case 1:
                System.out.println("Module nr." + Module + " is Agile, from 24.04 to 09.05");
                break;
            case 2:
                System.out.println("Module nr." + Module + " is Version Control, from 17.05 to 23.05");
                break;
            case 3:
                System.out.println("Module nr." + Module + " is Java, from 29.05 to 06.06");
                break;
            case 4:
                System.out.println("Module nr." + Module + " is Data Visualisation, from 12.06 to 04.07");
                break;
            case 5:
                System.out.println("Module nr." + Module + " is Python, from 10.07 to 15.08");
                break;
            case 6:
                System.out.println("Module nr." + Module + " is Testing, from 04.09 to 12.09");
                break;
            case 7:
                System.out.println("Module nr." + Module + " is API, from 18.09 to 26.09");
                break;
            default:
                System.out.println("Unknown Module");
        }

    }

}
