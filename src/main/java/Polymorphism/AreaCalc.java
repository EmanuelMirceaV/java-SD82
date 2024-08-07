package Polymorphism;

public class AreaCalc {

    /**
     * Function for area of a circle
     * @param r
     */
    public void area(int r) {
        System.out.println("Circle area is: " + 3.14*r*r);
    }

    public void area(double b, double h){
        System.out.println("Triangle area is: " + 0.5*b*h);
    }

    public static void main(String[] args) {

        AreaCalc shapes = new AreaCalc();
        shapes.area(3);
        shapes.area(8.0,1.5);

    }


}
