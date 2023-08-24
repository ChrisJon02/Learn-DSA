import java.util.Arrays;

public class CheckIfArrIsSorted {
    public static void main(String[]args){
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 1, 6, 5};
        int n = arr1.length;
        int m = arr2.length;
        System.out.println("Is the array " +Arrays.toString(arr1) + " Sorted : " +isSorted(arr1, n));
        System.out.println("Is the array " +Arrays.toString(arr2) + " Sorted : " +isSorted(arr2, m));
    }
    // Optimal Approach
    // Time Complexity : O(N)
    static int isSorted(int[] arr, int n){
        for(int i = 1; i < n; i++){
            if(arr[i] < arr[i-1]){
                return 0;
            }
        }
        return 1;
    }
}
