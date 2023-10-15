class Pen {
    String color;
    String type; // ballpoint/gel

    public void write() {
        System.out.println("Writing simething");
    }
}

public class OOPS1 {
    public static void main(String args[]) {
        Pen ob = new Pen();
        ob.color = "blue";
        ob.type = "gel";

        ob.write();
    }
    
}
