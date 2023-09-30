import java.util.*;

public class hcf {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        while(m!=0) {
            int temp = m;
            m = n%m;
            n=temp;
        }
        System.out.println(n);
    }
}
