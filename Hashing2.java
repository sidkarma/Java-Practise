import java.util.HashMap;

public class Hashing2 {
    public static void main(String[] args) {
        // country(key), population
        HashMap<String, Integer> hm = new HashMap<>();

        // Insertion
        hm.put("India", 120);
        hm.put("US", 30);
        hm.put("China", 150);

        System.out.println(hm);

        hm.put("China", 180);
        System.out.println(hm);

        // Search - Look up
        if (hm.containsKey("Indonesia")) {
            System.out.println("key is present in the map");
        } else {
            System.out.println("key is not present");
        }

        // get
        System.out.println(hm.get("China"));
        System.out.println(hm.get("Indonesia"));
    }
}
