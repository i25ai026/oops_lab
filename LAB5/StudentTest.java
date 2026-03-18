package LAB5;
class Student {

    String inputName(String name) {
        return name;
    }

    String average(int m1, int m2, int m3) {
        double avg = (m1 + m2 + m3) / 3.0;

        if (avg > 50) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
}

public class StudentTest {
    public static void main(String[] args) {

        Student s = new Student();

        String name = s.inputName("Rahul");

        int m1 = 60, m2 = 55, m3 = 50;

        String result = s.average(m1, m2, m3);

        System.out.println("Name: " + name);
        System.out.println("Result: " + result);
    }
}