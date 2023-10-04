import java.util.*;
// Print all permutations of a string
public class recProb10 {
    public static void printPerm(String str, String permu) {
        if(str.length()==0) {
            System.out.println(permu);
            return;
        }

        for(int i=0;i<str.length();i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i)+str.substring(i+1);
            printPerm(newStr, permu+currChar);
        }
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        String str = "abc";
        printPerm(str, "");
        sc.close();
    }
    
}
