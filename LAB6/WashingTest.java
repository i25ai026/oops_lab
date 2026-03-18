package LAB6;
class WashingMachine {

    void switchOn() {
        System.out.println("Machine Switched On");
    }

    int acceptClothes(int noOfClothes) {
        return noOfClothes;
    }

    void acceptDetergent() {
        System.out.println("Detergent Added");
    }

    void switchOff() {
        System.out.println("Machine Switched Off");
    }
}

public class WashingTest {
    public static void main(String[] args) {

        WashingMachine wm = new WashingMachine();

        wm.switchOn();

        int clothes = wm.acceptClothes(8);
        System.out.println("Number of Clothes: " + clothes);

        wm.acceptDetergent();

        wm.switchOff();
    }
}