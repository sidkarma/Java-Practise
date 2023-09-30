import java.util.Scanner;

public class recursion4 {

    public static int calFact(int n) {
        if(n==1 || n==0) {
            return 1;
        }
        int fact_nm1 = calFact(n-1);
        int fact_n = n*fact_nm1;
        return fact_n;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int fact = calFact(n);
        System.out.println(fact);

    }
}
