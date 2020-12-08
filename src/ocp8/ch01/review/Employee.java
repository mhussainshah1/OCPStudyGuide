package ocp8.ch01.review;

public class Employee {

    public int employeeId;
    public String firstName, lastName;
    public int yearStarted;

    @Override
    public int hashCode() {
        return employeeId;
    }

    //Overloaded
    public boolean equals(Employee e) {
        return this.employeeId == e.employeeId;
    }

    public static void main(String[] args) {
        Employee one = new Employee();
        one.employeeId = 101;
        Employee two = new Employee();
        two.employeeId = 101;
        if (one.equals(two)) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }
    }
}
