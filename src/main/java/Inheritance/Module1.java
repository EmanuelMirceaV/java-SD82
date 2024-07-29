package Inheritance;

public class Module1 extends BaseModule{

    public int duration = 16;

    public String subject = "Methodologies/Project Management";

    String test = "a test and practice, based on main concepts presented in the module";

    String location = "online only";

    public void defaultLocation(){
        System.out.println("Location: " + super.location);
    }

}
