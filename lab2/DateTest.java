import java.util.Scanner;

class Date {
    int month;
    int day;
    int year;

    Date(int m, int d, int y) {
        month = m;
        day = d;
        year = y;
    }

    void displayDate() {
        System.out.println("Date: " + month + "/" + day + "/" + year);
    }
}

public class DateTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Month: ");
        int m = sc.nextInt();

        System.out.print("Enter Day: ");
        int d = sc.nextInt();

        System.out.print("Enter Year: ");
        int y = sc.nextInt();

        Date date = new Date(m, d, y);
        date.displayDate();
    }
}
