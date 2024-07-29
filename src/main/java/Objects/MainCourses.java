package Objects;

class Courses2 {
    String subject;
    String level;
    int durationHR;
    double grade;
}

public class MainCourses {
    public static void main(String[] args) {

        Course Java1 = new Course();
        Java1.subject = "Java Fundamentals";
        Java1.level = "Basics";
        Java1.durationHR = 24;

        Courses2 Python1 = new Courses2();
        Python1.subject = "Python Programming";
        Python1.durationHR = 46;
        Python1.grade = 5.5;

        System.out.println("We are learning " + Java1.subject + " before learning " + Python1.subject);

        System.out.println("Python course duration is: " + Python1.durationHR);


    }

}
