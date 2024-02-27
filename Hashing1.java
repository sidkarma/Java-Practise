import java.util.HashSet;

public class Hashing1 {
    public static void main(String[] args) {
        // Creating
        HashSet<Integer> set = new HashSet<>();
        // ArrayList<Integer> list = new ArrayList<>();

        // Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); // list.add(ele);

        // Search - contains
        if (set.contains(1)) {
            System.out.println("set contains 1");
        }
        if (!set.contains(6)) {
            System.out.println("Does not contains");
        }
    }
}
