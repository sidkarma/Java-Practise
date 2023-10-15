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

public class OOPS1 {
    public static void main(String args[]) {
        Pen ob1 = new Pen();
        ob1.color = "blue";
        ob1.type = "gel";

        Pen ob2 = new Pen();
        ob2.color = "red";
        ob2.type = "ballpoint";

        ob1.printColor();
        ob2.printColor();
    }
    
}
