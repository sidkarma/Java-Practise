import java.util.*;

public class arrz4 {
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

        int x = sc.nextInt();

        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                if(mat[i][j]==x) {
                    System.out.println("element found at index: " + i + "," + j);
                }
            }
        }
    }
}