import java.util.Arrays;

public class leftRotateArrByOne {
    public static void main(String[]args){
         int[] arr = {1, 2, 3, 4, 5};
         int n = arr.length;
         System.out.println("Original Array : " +Arrays.toString(arr));
         bruteForce(arr, n);
         optimal(arr, n);
    }

    // Time Complexity : O(N)
    // Space Complexity : O(N)
    static void bruteForce(int[] arr, int n){
        int[] temp = new int[n];
        for(int i = 0; i<n-1; i++){
            temp[i] = arr[i+1];
        }
        temp[n-1] = arr[0];
        System.out.println("Using BruteForce approach : " +Arrays.toString(temp));
    }

    // Time Complexity : O(N)
    // Space Complexity : O(1)
    static void optimal(int[] arr, int n) {
        // Write your code here.
        for(int i = 0; i < n-1; i++){
            //Swapping
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }  
        System.out.println("Using Optimal approach : " +Arrays.toString(arr));
    }
}
