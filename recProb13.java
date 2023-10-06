import java.util.*;
// Find the number of ways in which you can can invite n ppl
// to your party, single or in pairs
public class recProb13 {
    public static int totalWays(int n) {
        if(n<=1) {
            return 1;
        }

        //single
        int ways1 = totalWays(n-1);

        //pair
        int ways2 = (n-1) * totalWays(n-2);

        return ways1 + ways2;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int ans = totalWays(n);
        System.out.println(ans);
        sc.close();
    }
}
