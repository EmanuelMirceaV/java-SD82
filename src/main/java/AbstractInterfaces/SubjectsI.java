package AbstractInterfaces;

public interface SubjectsI {

    public abstract void courseContent();

    public abstract void codeCompiler();

    public abstract void courseDuration(int hours);

    public default void courseDuration2(int hours){
        System.out.println("Course duration in H: " + hours + " and is worth " + hours*2 + " points");
    }

}
