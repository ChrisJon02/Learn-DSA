import java.util.Arrays;
public class InsertionSort {
    public static void main(String[]args){
        int[] arr = {15, 27, 13, 6, 87, 4};
        int n = arr.length;
        iterativeSort(arr, n);
        System.out.println(Arrays.toString(arr));
    }
    // Iterative Approach
    public static void iterativeSort(int[] arr, int n) {
        for(int i = 0; i <= n-1; i++){
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                swap(arr, j-1, j);
                j--;
            }
        }
    }
    public static void swap(int[] arr, int p1, int p2){
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }
}
