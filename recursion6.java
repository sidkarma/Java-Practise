import java.util.Scanner;
public class recursion6 {

    // public static int calcPow(int x, int n) { 
    //     // (stack height = n)
    //     if(n==0)
    //         return 1;
    //     if(x==0)
    //         return 0;

    //     int xPnm1 = calcPow(x, n-1);
    //     int xPn = x * xPnm1;
    //     return xPn;
    // }

    public static int calcPow(int x, int n) { 
        // (stack height = logn)
        if(n==0)
            return 1;
        if(x==0)
            return 0;
        // if n is even
        if(n%2==0) {
            return calcPow(x, n/2) * calcPow(x, n/2);
        }
        else { // n is odd
            return calcPow(x, n/2) * calcPow(x, n/2) * x;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int ans = calcPow(x, n);
        System.out.println(ans);
        sc.close();
    }
}
