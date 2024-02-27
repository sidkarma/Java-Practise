import java.util.HashSet;
import java.util.Iterator;

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

        // Size
        System.out.println("Size of set is: " + set.size());

        // Print all elements
        System.out.println(set);

        // // Search - contains
        // if (set.contains(1)) {
        // System.out.println("Set contains 1");
        // }
        // if (!set.contains(6)) {
        // System.out.println("Does not contains");
        // }

        // // Delete
        // set.remove(1);
        // if (!set.contains(1)) {
        // System.out.println("Does not contain 1 (Deleted 1)");
        // }

        // Iterator
        Iterator it = set.iterator();

        // hasNext(); next();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
