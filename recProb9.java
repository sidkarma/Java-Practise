import java.util.*;
// Print keypad combinations
public class recProb9 {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};


    public static void printCombs(String str,int idx, String comb) {
        if(idx == str.length()) {
            System.out.println(comb);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar-'0'];

        for(int i=0;i<mapping.length();i++) {
            printCombs(str, idx+1, comb+mapping.charAt(i));
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = "23";
        sc.close();
        printCombs(str, 0, "");
    }
}
