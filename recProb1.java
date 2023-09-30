import java.util.*;

public class recProb1 {
    // Tower Of Hanoi

    public static void toh(int n,String src, String hlp, String dest) {
        if(n==1) {
            System.out.println("transfer disk"+n+" from "+src+" to "+dest);
            return;
        }
        toh(n-1, src, dest, hlp);
        System.out.println("transfer disk"+n+" from "+src+" to "+dest);
        toh(n-1, hlp, src, dest);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        toh(n, "S", "H", "D");
        sc.close();
    }
}
