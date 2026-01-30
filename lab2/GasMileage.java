import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int miles;
        int gallons;
        double tripMPG;
        int totalMiles = 0;
        int totalGallons = 0;

        System.out.print("Enter miles driven (-1 to quit): ");
        miles = sc.nextInt();

        while (miles != -1) {
            System.out.print("Enter gallons used: ");
            gallons = sc.nextInt();

            tripMPG = (double) miles / gallons;
            System.out.println("Miles per gallon for this trip: " + tripMPG);

            totalMiles += miles;
            totalGallons += gallons;

            System.out.print("\nEnter miles driven (-1 to quit): ");
            miles = sc.nextInt();
        }

        if (totalGallons != 0) {
            double combinedMPG = (double) totalMiles / totalGallons;
            System.out.println("\nCombined miles per gallon: " + combinedMPG);
        } else {
            System.out.println("No data entered.");
        }
    }
}
