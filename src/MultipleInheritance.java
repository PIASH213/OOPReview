interface Walkable {
    void walk();
}

interface Talkable {
    void talk();
}

class Robot implements Walkable, Talkable {
    public void walk() {
        System.out.println("Robot is walking...");
    }

    public void talk() {
        System.out.println("Robot is talking...");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Robot r = new Robot();
        r.walk();
        r.talk();
    }
}
