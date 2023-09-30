import java.util.*;

public class strz {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // String name = "Tony";
        // String fullNAme = "Tony Stark";
        // String sent = "My name is Tony Stark.";
        // String name = sc.nextLine();
        // System.out.println("Your name is : " + name);

        //concatenation
        String fname = "Tony";
        String lname = "Stark";
        String fullname = fname +" "+ lname;
        System.out.println(fullname.length());

        //charAt
        for(int i=0;i<fullname.length();i++) {
            System.out.println(fullname.charAt(i));
        }
    }
}
