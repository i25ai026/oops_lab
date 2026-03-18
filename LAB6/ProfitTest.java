package LAB6;
class Theater {

    double calculateTotalProfit(int attendees) {
        double ticketPrice = 5.0;
        double fixedCost = 20.0;
        double variableCost = 0.5 * attendees;

        double revenue = attendees * ticketPrice;
        double totalCost = fixedCost + variableCost;

        return revenue - totalCost;
    }
}

public class ProfitTest {
    public static void main(String[] args) {

        Theater t = new Theater();

        int attendees = 50;

        double profit = t.calculateTotalProfit(attendees);

        System.out.println("Number of Attendees: " + attendees);
        System.out.println("Total Profit: " + profit);
    }
}