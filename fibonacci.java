import java.util.*;

public class fibonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int terms = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        for(int i=0;i<terms;i++){
            System.out.print(n1 + " ");
            int n3 = n1+n2;
            n1=n2;
            n2=n3;
        }
    }
}
