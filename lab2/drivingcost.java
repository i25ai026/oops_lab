import java.util.Scanner;

public class drivingcost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double miles, costPerGallon, parkingFees, tolls, totalCost;

        System.out.print("Enter total miles driven per day: ");
        miles = input.nextDouble();

        System.out.print("Enter cost per gallon of gasoline: ");
        costPerGallon = input.nextDouble();

        System.out.print("Enter average parking fees per day: ");
        parkingFees = input.nextDouble();

        System.out.print("Enter tolls per day: ");
        tolls = input.nextDouble();

        totalCost = (miles * costPerGallon) + parkingFees + tolls;

        System.out.println("\nYour daily driving cost is: " + totalCost);

        input.close();
    }
}

