abstract class Shape {
    abstract void draw(); // abstract method

    void info() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        c.info();
    }
}
