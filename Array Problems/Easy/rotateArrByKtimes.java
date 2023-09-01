import java.util.*;
public class rotateArrByKtimes {
    public static void main(String[]args){
        int[] arr1 = {1, 2, 3, 4, 5};
        int n = arr1.length;
        int k = 3;
        System.out.println("Original Array : " +Arrays.toString(arr1));
        rotateRight(arr1, n, k);
        int[] arr2 = {1, 2, 3, 4, 5};
        rotateleft(arr2, n, k);
    }

    // Time Complexity : O(N)
    // Space Complexity : O(K) - since 'k' elements are stored in the temp array
    public static void rotateRight(int[] arr, int n, int k) {
        if (n == 0)
          return;
        k = k % n;
        if (k > n)
          return;
        int[] temp = new int[k];
        for (int i = n - k; i < n; i++) {
            temp[i - n + k] = arr[i];
        }
        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
        System.out.println("Rotating the array to the right by " +k+ " times : " + Arrays.toString(arr));
   }
   public static void rotateleft(int[] arr, int n, int k) {
        if (n == 0)
          return;
        k = k % n;
        if (k > n)
          return;
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
          temp[i] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
          arr[i] = arr[i + k];
        }
        for (int i = n - k; i < n; i++) {
          arr[i] = temp[i - n + k];
        }
        System.out.println("Rotating the array to the left by " +k+ " times : " + Arrays.toString(arr));

  }
}
