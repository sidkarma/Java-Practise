import java.util.*;
// Check if an array is sorted (Strictly increasing)
public class recProb4 {

    public static boolean checkInc(int[] arr, int idx) {
        if(idx == arr.length-1) {
            return true;
        }
        if(arr[idx] < arr[idx+1]) {
            //arr is sorted till now
            return checkInc(arr, idx+1);
        }
        else {
            return false;
        }
    }
   public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int[] nums = {1,2,5,4,2};
    boolean ans = checkInc(nums, 0);
    if(ans == true) {
        System.out.println("Sorted");
    }
    else {
        System.out.println("Not sorted");
    }
    sc.close();
   } 
}
