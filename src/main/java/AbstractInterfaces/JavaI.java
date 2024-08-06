package AbstractInterfaces;

public class JavaI extends SubjectsC implements SubjectsI, TestInterface{
    @Override
    public void courseContent() {
        System.out.println("Java Fundamentals");
    }

    @Override
    public void codeCompiler() {
        System.out.println("with IntelliJ");
    }

    @Override
    public void courseDuration(int hours) {
        System.out.println("Course duration in H: " + hours + " and is worth " + hours*2 + " points");
    }

    @Override
    public void test() {
        System.out.println("Quiz");
    }
}
