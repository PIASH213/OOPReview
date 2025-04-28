class Laptop {
    String brand;
    int price;

    void start() {
        System.out.println("Laptop is starting...");
    }
}

public class ClassObject {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop();
        myLaptop.brand = "Dell";
        myLaptop.price = 800;
        myLaptop.start();
    }
}
