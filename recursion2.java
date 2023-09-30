public class recursion2 {

    public static void printNums(int n) {
        if(n>5) {
            return;
        }
        System.out.println(n);
        printNums(n+1);
    }
    public static void main(String args[]) {
        int n=1;
        printNums(n);
    } 
}
