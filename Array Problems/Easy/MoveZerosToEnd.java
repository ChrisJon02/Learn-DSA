import java.util.ArrayList;
import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[]args){
        int[] arr = {0, 1, 0, 3, 12};
        int n = arr.length;
        bruteForce(arr, n);
        optimal(arr, n);
    }

    // Time Complexity : O(N) + O(X) + O(N-X) ~= O(2*N)
    // where N = no.of elements, X = no.of non-sero elements, N-X = total no.of zeros
    // Space Complexity : O(N)
    static void bruteForce(int[] arr, int n){
        ArrayList<Integer> temp = new ArrayList<>();

        //copy non-zero elements from original -> temp array:
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0)
                temp.add(arr[i]);
        }
        int nz = temp.size();

        //copy elements from temp, fill first nz fields of original array:
        for (int i = 0; i < nz; i++) {
            arr[i] = temp.get(i);
        }

        // fill rest of the cells with 0:
        for (int i = nz; i < n; i++) {
            arr[i] = 0;
        }
        System.out.println("Using Brute Force approach : " +Arrays.toString(arr));
    }

    // Time Complexity : O(N)
    // Space Complexity : O(1) -> because no extra space
    static void optimal(int[] arr, int n){
        int j = -1;
        
        // find the first zero element
        for(int i = 0; i<n; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }

        if(j == -1) return;
        
        // find non zero elements and swap them with zeros
        for(int i = j+1; i<n; i++){
            if(arr[i] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        System.out.println("Using Optimal approach : " +Arrays.toString(arr));

    }
}
