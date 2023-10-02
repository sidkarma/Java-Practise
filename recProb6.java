import java.util.*;
// Remove all duplicates in a string
public class recProb6 {
    public static boolean[] map = new boolean[26];

    public static void removeDups(String str, int idx, String newStr) {
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a']) {
            removeDups(str, idx+1, newStr);
        } else {
            newStr += currChar;
            map[currChar-'a'] = true;
            removeDups(str, idx+1, newStr);
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = "abbcccda";
        sc.close();
        removeDups(str, 0, "");
    }
}
