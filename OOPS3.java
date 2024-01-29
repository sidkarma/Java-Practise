abstract class Animals {
    abstract void walk();

    Animals() {
        System.out.println("You are creating a new animal");
    }

    public void eat() {
        System.out.println("Animal eats");
    }
}

class Horse extends Animals {
    Horse() {
        System.out.println("Created a Horse");
    }

    public void walk() {
        System.out.println("Walks on 4 legs");

    }
}

class Chicken extends Animals {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class OOPS3 {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
    }
}