package LAB6;
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int rollNo;

    Student(String name, int age, int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }

    void show() {
        super.display();
        System.out.println("Roll No: " + this.rollNo);
    }
}

public class SuperThisTest {
    public static void main(String[] args) {

        Student s = new Student("parumol", 18, 52);
        s.show();
    }
}
