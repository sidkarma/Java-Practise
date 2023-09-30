import java.util.Scanner;

public class recursion3 {
    // sum of first n natural numbers

    public static void printSum(int i,int n, int sum) {
        if(i==n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i+1, n, sum);
        System.out.println(i);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        printSum(1, 5, 0);
        sc.close();

    }
}
