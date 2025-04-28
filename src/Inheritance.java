class Vehicle {
    protected String brand = "Vehicle";

    void run() {
        System.out.println("Vehicle is running...");
    }
}

class Bike extends Vehicle {
    void honk() {
        System.out.println(brand + " says Beep Beep!");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Bike myBike = new Bike();
        myBike.run();
        myBike.honk();
    }
}
