import java.util.*;
// FIBONACCI SERIES

public class recursion5 {

    public static int fibo(int n) {
        if(n<=1)
            return n;
        else
            return fibo(n-1)+fibo(n-2);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++) {
            System.out.println(fibo(i) + " ");
        }

    }
}
