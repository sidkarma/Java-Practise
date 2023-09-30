import java.util.*;

public class recursion1 {
    public static void printNums(int n) {
        if(n==0) {
            return;
        }
        System.out.println(n);
        printNums(n-1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        printNums(n);
        sc.close();
    }
}
