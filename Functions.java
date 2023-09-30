import java.util.*;

public class Functions {

     static void printName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        Functions ob = new Functions();
        printName(name);

    }
}
