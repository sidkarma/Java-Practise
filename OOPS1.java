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

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
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

        s1.printInfo(s1.name, s1.age);
    }
    
}
