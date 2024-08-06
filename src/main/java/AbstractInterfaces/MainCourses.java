package AbstractInterfaces;

public class MainCourses {

    public static void main(String[] args) {

       // JavaC sub1 = new JavaC();
       // PythonC sub2 = new PythonC();

        JavaI sub1 = new JavaI();
        PythonI sub2 = new PythonI();

        sub1.courseContent();
        sub1.codeCompiler();
        sub1.courseDuration(24);
        sub1.test();

        System.out.println();

        sub2.courseContent();
        sub2.codeCompiler();
        sub2.courseDuration(48);
        sub2.courseDuration2(48);

    }

}
