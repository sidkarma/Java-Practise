import java.util.*;

// Print all the subsequences of a string

public class recProb7 {
    public static void subsequences(String str, int idx, String newString) {
        if(idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);

        // to be
        subsequences(str, idx+1, newString+currChar);

        // or not to be
        subsequences(str, idx+1, newString);
    }
    public static void main(String srgs[]) {
        Scanner sc = new Scanner(System.in);
        String str = "abc";
        subsequences(str, 0, "");
        sc.close();
    }
}
