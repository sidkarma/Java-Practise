import java.util.*;

public class arrz3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] mat = new int[r][c];

        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
