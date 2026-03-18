package LAB5;
class Product {
    int productId;
    String name;
    int categoryId;
    double unitPrice;

    Product(int productId, String name, int categoryId, double unitPrice) {
        this.productId = productId;
        this.name = name;
        this.categoryId = categoryId;
        this.unitPrice = unitPrice;
    }
}

class ElectricalProduct extends Product {
    String voltageRange;
    int wattage;

    ElectricalProduct(int productId, String name, int categoryId, double unitPrice,
                      String voltageRange, int wattage) {
        super(productId, name, categoryId, unitPrice);
        this.voltageRange = voltageRange;
        this.wattage = wattage;
    }

    void updateDetails(int newWattage, double newPrice) {
        wattage = newWattage;
        unitPrice = newPrice;
    }

    void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Category ID: " + categoryId);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Voltage Range: " + voltageRange);
        System.out.println("Wattage: " + wattage);
    }
}

public class ProductTest {
    public static void main(String[] args) {

        ElectricalProduct e = new ElectricalProduct(101, "Fan", 10, 1500.0, "220-240V", 75);

        e.updateDetails(100, 1800.0);

        e.display();
    }
}