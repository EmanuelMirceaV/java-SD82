package Objects;

import java.time.LocalDate;

public class ExObjects {

    /*
    Create a "Student" class that has the following attributes:
    - First name
    - Last name
    - Year of birth
    - Phone number

    In the "ExObjects" class, create a student object
    Provide values for those attributes and print out: "Full name: first name & last name"
    Calculate his age with a method and print the result in the following format: "Age: (result of the calculation)"
    Print out the full phone number: "Phone number: 0xxxxxxxxx"
    */

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.firstName = "Alex";
        student1.lastName = "Smith";
        student1.birthYear = 1990;
        student1.number = "0749035459";

        System.out.println("Full name: " + student1.firstName + " " + student1.lastName);
        age(student1.birthYear);
        System.out.println("Phone number: " + student1.number);
    }

    public static void age(int year){
        //System.out.println("Age: " + (2024 - year));
        System.out.println("Age: " + (LocalDate.now().getYear() - year));
    }

}
