import java.util.*;
// Print a string in REVERSE
public class recProb2 {

    public static void printRevString(String s, int index) {
        if(index==0) {
            System.out.print(s.charAt(index));
            return;

        }
        System.out.print(s.charAt(index));
        printRevString(s, index-1);;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = "abcd";
        printRevString(str, str.length()-1);
        sc.close();
    }
}
