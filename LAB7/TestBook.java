package LAB7;
class Book {
    int id;
    String title, author;
    double price;

    Book(int id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

class Periodical extends Book {
    String period;

    Periodical(int id, String title, String author, double price, String period) {
        super(id, title, author, price);
        this.period = period;
    }

    void modify(double newPrice, String newPeriod) {
        price = newPrice;
        period = newPeriod;
    }

    void display() {
        System.out.println(id + " " + title + " " + author + " " + price + " " + period);
    }
}

public class TestBook {
    public static void main(String[] args) {
        Periodical p = new Periodical(1, "padanila", "saya", 200, "Weekly");
        p.modify(2500, "Monthly");
        p.display();
    }
}
