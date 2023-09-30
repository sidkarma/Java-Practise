import java.util.*;
// String Builder
public class strz3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // StringBuilder sb = new StringBuilder("Tony");
        // System.out.println(sb);

        // //char at index 0
        // System.out.println(sb.charAt(0));

        // //set char at index 0
        // sb.setCharAt(0, 'P');
        // System.out.println(sb);

        // //insert char in string
        // sb.insert(2, 'n');
        // System.out.println(sb);

        // //delete any char or substring
        // sb.delete(2, 4);
        // System.out.println(sb);
        StringBuilder sb = new StringBuilder("hello");

        for(int i=0;i<sb.length()/2;i++) {
            int front = i;
            int back = sb.length()-1-i;

            char frontCh = sb.charAt(front);
            char backCh = sb.charAt(back);

            sb.setCharAt(front, backCh);
            sb.setCharAt(back, frontCh);
        }
        System.out.println(sb);
    }
}
