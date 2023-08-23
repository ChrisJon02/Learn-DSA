import java.util.*;
public class LargestElmntInArray {
    public static void main(String[]args){
        int[] arr = {11, 31, 23, 47, 92, 63};
        int n = arr.length;
        System.out.println("Using For loop : " + optimal(arr, n));
        System.out.println("Using Sort() method : " +bruteForce(arr, n));
    }
    // Using Array.sort() to sort and get the last element
    // Time Complexity: O(NlogN)
    static int bruteForce(int[] arr, int n){
        Arrays.sort(arr);
        return arr[n-1];
    }
    // Simple traversing through Array
    // Time Complexity: O(N)
    static int optimal(int[] arr, int n) {
        int largest = -1;
        for(int i = 0; i<n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}
