package Intro;

import java.util.Scanner;

public class ExLoops {

    /*
       Write a program that requests the user to input a password and compare it to an existing password: P@ssword0
       Define and assign yourself this existing password, in your program
       If they are different, print "Incorrect password. Please try again" until the correct answer is introduced
       If they are not different, print "Login successful"
    */

    public static void main(String[] args) {

        String pw = "P@ssword0";

        System.out.println("Please insert your password");
        Scanner scan1 = new Scanner(System.in);
        String input1 = scan1.nextLine();

        while(!input1.equals(pw)){
            System.out.println("Incorrect password. Please try again");
            input1 = scan1.nextLine();
        }
        System.out.println("Login successful");

    }


}


