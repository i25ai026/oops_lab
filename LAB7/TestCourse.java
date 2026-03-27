package LAB7;
class Course {
    int id;
    String description;
    int duration;
    double fees;

    Course(int id, String description, int duration, double fees) {
        this.id = id;
        this.description = description;
        this.duration = duration;
        this.fees = fees;
    }

    void getData() {
        System.out.println(id + " " + description + " " + duration + " Months " + fees);
    }
}

public class TestCourse {
    public static void main(String[] args) {
        Course[] c = new Course[5];

        c[0] = new Course(1, "Data Structures", 4, 6000);
        c[1] = new Course(2, "Object Oriented Programming", 3, 5500);
        c[2] = new Course(3, "Database Management System", 5, 7000);
        c[3] = new Course(4, "Operating Systems", 4, 6500);
        c[4] = new Course(5, "Computer Networks", 3, 5000);

        for (int i = 0; i < 5; i++) {
            c[i].getData();
        }
    }
}
