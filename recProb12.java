import java.util.*;
// Place tiles of size 1*m in a floor of size n*m
public class recProb12 {
    public static int totalWays(int n, int m) {
        if(n==m) {
            return 2;
        }
        if(n<m) {
            return 1;
        }

        // vertically
        int verPlacements = totalWays(n-m, m);

        // horizontally
        int horPlacements = totalWays(n-1, m);

        return verPlacements + horPlacements;
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n=4, m=2;
        int ans = totalWays(n, m);
        System.out.println(ans);
        sc.close();
    }
    
}
