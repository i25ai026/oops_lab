package LAB7;
class Teacher {
    String name;
    int age;

    Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Student extends Teacher {
    int rollNo;

    Student(String name, int age, int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }

    void showStudent() {
        display();
        System.out.println("Roll No: " + rollNo);
    }
}

public class TestStudent {
    public static void main(String[] args) {
        Student s = new Student("Harshil", 20, 101);
        s.showStudent();
    }
}