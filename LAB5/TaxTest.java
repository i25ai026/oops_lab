package LAB5;
class Employee {

    double calculateTax(double grossPay) {
        return grossPay * 0.15;
    }

    double calculateNetPay(int hoursWorked) {
        double hourlyRate = 12.0;
        double grossPay = hoursWorked * hourlyRate;
        double tax = calculateTax(grossPay);
        return grossPay - tax;
    }
}

public class TaxTest {
    public static void main(String[] args) {

        Employee e = new Employee();

        int hours = 40;

        double grossPay = hours * 12.0;
        double tax = e.calculateTax(grossPay);
        double netPay = e.calculateNetPay(hours);

        System.out.println("Hours Worked: " + hours);
        System.out.println("Gross Pay: " + grossPay);
        System.out.println("Tax (15%): " + tax);
        System.out.println("Net Pay: " + netPay);
    }
}