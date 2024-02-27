import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

        // // Search - Look up
        // if (hm.containsKey("Indonesia")) {
        // System.out.println("key is present in the map");
        // } else {
        // System.out.println("key is not present");
        // }

        // // get
        // System.out.println(hm.get("China"));
        // System.out.println(hm.get("Indonesia"));

        // int arr[] = { 12, 15, 18 };
        // for (int i : arr) {
        // System.out.print(i + " ");
        // }

        // // Iteration in HashMap
        // for (Map.Entry<String, Integer> e : hm.entrySet()) {
        // System.out.print(e.getKey() + " : ");
        // System.out.println(e.getValue());
        // }

        // Set<String> keys = hm.keySet();
        // for (String key : keys) {
        // System.out.println(key + " " + hm.get(key));
        // }

        // Remove pair
        hm.remove("China");
        System.out.println(hm);
    }
}
