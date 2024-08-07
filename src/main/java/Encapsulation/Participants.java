package Encapsulation;

public class Participants {

    public static void main(String[] args) {

        Trainee T1 = new Trainee("Alex Smith", "ID001");
       // T1.setFullName("Alex Smith");
       // T1.setID("ID001");

        Trainee T2 = new Trainee("Mary Jane", "ID002");
       // T2.setFullName("Mary Jane");
       // T2.setID("ID002");

        System.out.println(T1.getFullName());
        System.out.println(T1.getID());

        System.out.println();

        System.out.println(T2.getFullName());
        System.out.println(T2.getID());


    }

}
