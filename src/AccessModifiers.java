class Student {
    private int rollNumber; // private: only accessible inside Student class

    public void setRollNumber(int number) {
        rollNumber = number;
    }

    public int getRollNumber() {
        return rollNumber;
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        Student s = new Student();
        s.setRollNumber(101);
        System.out.println("Roll Number: " + s.getRollNumber());
    }
}
