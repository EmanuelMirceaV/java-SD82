package Encapsulation;

public class ExEncaps {

    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.setEmployeeId(401);
        emp.setSalary(1500);

        System.out.println("Employee Information: Employee ID is " + emp.getEmployeeId() + " and Employee Salary is " + emp.getSalary());

    }


}
