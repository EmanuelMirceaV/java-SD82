package package1;

import package2.P2Class2;

public class P1Class1 {

    protected String proVar = "Protected Variable";

    public static void main(String[] args) {

        P2Class2 C2 = new P2Class2();
     // System.out.println(C2.defVar);  // Default Variable
        System.out.println(C2.pubVar);

        P1Class2 C3 = new P1Class2();
    //  System.out.println(C3.priVar);  // Private Variable

    }

}
