package AbstractInterfaces;

public class PythonI implements SubjectsI{
    @Override
    public void courseContent() {
        System.out.println("Python Development");
    }

    @Override
    public void codeCompiler() {
        System.out.println("with PyCharm");
    }

    @Override
    public void courseDuration(int hours) {
        System.out.println("Course duration in H: " + hours);
    }
}
