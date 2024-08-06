package AbstractInterfaces;

public abstract class SubjectsC {

    String location;

    public abstract void courseContent();

    public abstract void codeCompiler();

    // Non-abstract method
    public void courseDuration(int hours){
        System.out.println("Course duration in H: " + hours);
    }

}
