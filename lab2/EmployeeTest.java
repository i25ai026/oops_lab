
import java.util.Scanner;

class Employee {
    String firstName;
    String lastName;
    double monthlySalary;

    Employee(String fName, String lName, double salary) {
        firstName = fName;
        lastName = lName;
        if (salary > 0)
            monthlySalary = salary;
    }

    void setFirstName(String fName) {
        firstName = fName;
    }

    void setLastName(String lName) {
        lastName = lName;
    }

    void setMonthlySalary(double salary) {
        if (salary > 0)
            monthlySalary = salary;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    double getMonthlySalary() {
        return monthlySalary;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Employee 1
        System.out.println("Enter details of Employee 1:");
        System.out.print("First Name: ");
        String f1 = sc.nextLine();
        System.out.print("Last Name: ");
        String l1 = sc.nextLine();
        System.out.print("Monthly Salary: ");
        double s1 = sc.nextDouble();
        sc.nextLine();

        // Employee 2
        System.out.println("\nEnter details of Employee 2:");
        System.out.print("First Name: ");
        String f2 = sc.nextLine();
        System.out.print("Last Name: ");
        String l2 = sc.nextLine();
        System.out.print("Monthly Salary: ");
        double s2 = sc.nextDouble();

        Employee e1 = new Employee(f1, l1, s1);
        Employee e2 = new Employee(f2, l2, s2);

        // Yearly salary
        System.out.println("\nYearly Salaries:");
        System.out.println(e1.getFirstName() + " : " + (e1.getMonthlySalary() * 12));
        System.out.println(e2.getFirstName() + " : " + (e2.getMonthlySalary() * 12));

        // 10% hike
        e1.setMonthlySalary(e1.getMonthlySalary() * 1.10);
        e2.setMonthlySalary(e2.getMonthlySalary() * 1.10);

        // After hike
        System.out.println("\nYearly Salaries after 10% hike:");
        System.out.println(e1.getFirstName() + " : " + (e1.getMonthlySalary() * 12));
        System.out.println(e2.getFirstName() + " : " + (e2.getMonthlySalary() * 12));
    }
}
