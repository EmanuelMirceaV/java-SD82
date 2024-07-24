package Intro;

import java.util.Scanner;

public class ExMethods {

    // Write a program that requests the full name of the user, and prints it (in upper case) after the message "Hello, ", with the use of a method

    public static void main(String[] args) {
        System.out.println("Please enter your full name");
        System.out.println(getFullName());

    }

    public static String getFullName(){
        Scanner scan1 = new Scanner(System.in);
        return "Hello" + " " + scan1.nextLine().toUpperCase();
    }


}
