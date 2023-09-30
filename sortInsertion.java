import java.util.*;

public class sortInsertion {

    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int arr[] = {7,8,3,1,2};
        
        for(int i=1;i<arr.length;i++) {
            int cur = arr[i];
            int j=i-1;
            while(j>=0 && cur<arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            //placement
            arr[j+1] = cur;
        }
        printArr(arr);
    }
}