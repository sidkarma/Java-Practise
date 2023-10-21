// Backtracking
import java.util.*;
// 
public class Backtracking1 {
    public static void printPermu(String str, String perm, int idx) {
        if(str.length()==0) {
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i)+str.substring(i+1);
            printPermu(newStr, perm + currChar, idx+1);
        }
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = "ABC";
        printPermu(str, "", 0);
        sc.close();
    }
}
