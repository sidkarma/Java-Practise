class Pen {
    String color;
    String type; // ballpoint/gel

    public void write() {
        System.out.println("Writing simething");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    Student() {

    }
}

public class OOPS1 {
    public static void main(String args[]) {
        // Pen ob1 = new Pen();
        // ob1.color = "blue";
        // ob1.type = "gel";

        // Pen ob2 = new Pen();
        // ob2.color = "red";
        // ob2.type = "ballpoint";

        // ob1.printColor();
        // ob2.printColor();

        Student s1 = new Student();
        s1.name = "sidkarma";
        s1.age = 25;

        Student s2 = new Student(s1);
        s2.printInfo();
    }
    
}
