// Sub-array sum equal to K (# return the number of such sub-arrays)    eg: arr = {1,2,3}, K=3 -> ans = 2 [(1,2),(3)]

import java.util.*;

public class Hashing_prob5 {
    public static void main(String[] args) {
        int arr[] = { 10, 2, -2, -20, 10 }; // ans = 3
        int k = -10;
        HashMap<Integer, Integer> map = new HashMap<>(); // <Sum, Freq>

        map.put(0, 1); // empty sub-array
        int ans = 0;
        int sum = 0;

        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];

            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }

            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }
        System.out.println(ans);
    }
}
