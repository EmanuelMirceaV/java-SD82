package Encapsulation;

public class TestThis {

    private int I;

    public TestThis(int I){
        this.I = I;
    }

    public static void main(String[] args) {
        TestThis intVal = new TestThis(10);
        System.out.println("Value of I is: " + intVal.I);

    }


}
