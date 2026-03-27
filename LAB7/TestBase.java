package LAB7;
class Base {
    String className;

    Base(String className) {
        this.className = className;
    }

    void debug() {
        System.out.println(className + " is being used.");
    }
}

class ClassA extends Base {
    ClassA() {
        super("ClassA");
    }
}

class ClassB extends Base {
    ClassB() {
        super("ClassB");
    }
}

class ClassC extends Base {
    ClassC() {
        super("ClassC");
    }
}

public class TestBase {
    public static void main(String[] args) {

        Base[] objs = new Base[3];

        objs[0] = new ClassA();
        objs[1] = new ClassB();
        objs[2] = new ClassC();

        for (Base obj : objs) {
            obj.debug(); 
        }
    }
}
