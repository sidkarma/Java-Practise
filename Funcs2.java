import java.util.*;

public class Funcs2 {
    // static int addNums(int n,int m) {
    //     return n+m;
    // }

    static int mulNums(int n,int m) {
        return n*m;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        // int sum = addNums(n,m);
        int mul = mulNums(n, m);
        // System.out.println("Sum of 2 numbers is: " + sum);
        System.out.println("Multiplication of 2 numbers is: " + mul);
    }
}
