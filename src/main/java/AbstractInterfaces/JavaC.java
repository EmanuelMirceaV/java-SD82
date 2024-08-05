package AbstractInterfaces;

public class JavaC extends SubjectsC{
    @Override
    public void courseContent() {
        System.out.println("Java Fundamentals");
    }

    @Override
    public void codeCompiler() {
        System.out.println("with IntelliJ");
    }

    public void test(){
        System.out.println("Quiz");
    }

}
