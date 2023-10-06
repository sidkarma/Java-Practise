import java.util.*;
// Print all subsets of a set of first n natural numbers
public class recProb14 {
    public static void printSubset( ArrayList<Integer> subset) {
        for(int i=0;i<subset.size();i++) {
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }

    public static void findSubsets(int n, ArrayList<Integer> subset) {
        if(n==0) {
            printSubset(subset);
            return;
        }

        //add hoga
        subset.add(n);
        findSubsets(n-1, subset);

        //add nahi hoga
        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int n=3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);
        sc.close();
    }
    
}
